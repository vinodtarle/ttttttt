package com.kidgeneration.school.kg.activities.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.activities.model.Activities
import com.kidgeneration.school.kg.activities.viewmodel.ViewModelActivities
import com.kidgeneration.school.kg.base.model.UI
import com.kidgeneration.school.kg.base.repository.Resource
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK
import com.kidgeneration.school.kg.base.utility.constant.Converter
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.databinding.FragmentActivitiesAddBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_activities_add.*
import java.util.*

@AndroidEntryPoint
class FragmentActivitiesAdd : BaseFragment(layoutResourceId = R.layout.fragment_activities_add) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelActivities by viewModels()

    private lateinit var ui: UI
    private lateinit var activities: Activities
    private lateinit var binding: FragmentActivitiesAddBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = FragmentActivitiesAddBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initListener()
    }

    override fun init() {
        this.ui = UI()
        this.activities = Activities()
        this.binding.ui = this.ui
        this.binding.activities = this.activities
    }

    override fun initListener() {
        edDate.setOnClickListener {
            hideKeyboard()
            datePickerDialog { date ->
                this.ui.date = date
            }
        }
        edTime.setOnClickListener {
            hideKeyboard()
            timePickerDialog { time ->
                this.activities.time = time
            }
        }
        edTitle.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                validate()
            }
        })
        edDate.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                layoutDate.helperText = getString(R.string.helperRequired)
                if (s!!.isBlank()) layoutDate.error = getString(R.string.errorRequired)
                validate()
            }
        })
        edTime.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                layoutTime.helperText = getString(R.string.helperRequired)
                if (s!!.isBlank()) layoutTime.error = getString(R.string.errorRequired)
                validate()
            }
        })
        edDescription.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                validate()
            }
        })
    }

    private fun validate() {
        this.activities.status = false
        if (!this.activities.title.isBlank()
            && !this.ui.date.isBlank()
            && !this.activities.time.isBlank()
            && !this.activities.description.isBlank()
        ) this.activities.status = true
        this.binding.activities = this.activities
    }

    fun onClick(view: View) {
        this.activities.createdBy = "Admin"
        this.activities.createdById = BLANK
        this.activities.date = Converter.toDate(this.ui.date)
        this.activities.id = BLANK
        this.activities.standardIds = Arrays.asList("K5iknemJaXRzta5TraZv")
        this.activities.divisionIds = Arrays.asList("VSYfYhIOvsi4oPdJEtwi")
        this.activities.studentIds = emptyList()
        addActivities()
    }

    private fun addActivities() {
        buttonAdd.isEnabled = false
        this.viewModel.set(data = this.activities)
            .observe(viewLifecycleOwner, Observer { result ->
                when (result) {
                    is Resource.Loading -> {
                        showProgressBar()
                    }
                    is Resource.Success -> {
                        clear()
                        showSuccessAdd()
                    }
                    is Resource.Error -> {
                        hideProgressBar()
                        showErrorAdd()
                    }
                }
            })
    }

    private fun clear() {
        this.activities = Activities()
        this.ui.date = BLANK
        this.binding.ui = this.ui
    }
}
