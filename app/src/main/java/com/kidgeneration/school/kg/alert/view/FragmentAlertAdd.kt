package com.kidgeneration.school.kg.alert.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.alert.model.Alert
import com.kidgeneration.school.kg.alert.viewmodel.ViewModelAlert
import com.kidgeneration.school.kg.base.model.UI
import com.kidgeneration.school.kg.base.repository.Resource
import com.kidgeneration.school.kg.base.utility.constant.Constant
import com.kidgeneration.school.kg.base.utility.constant.Converter
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.databinding.FragmentAlertAddBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_alert_add.*
import java.util.*

@AndroidEntryPoint
class FragmentAlertAdd : BaseFragment(layoutResourceId = R.layout.fragment_alert_add) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelAlert by viewModels()

    private lateinit var ui: UI
    private lateinit var alert: Alert
    private lateinit var binding: FragmentAlertAddBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = FragmentAlertAddBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initListener()
    }

    override fun init() {
        this.ui = UI()
        this.alert = Alert()
        this.binding.ui = this.ui
        this.binding.alert = this.alert
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
                this.alert.time = time
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
        this.alert.status = false
        if (!this.alert.title.isBlank()
            && !this.ui.date.isBlank()
            && !this.alert.time.isBlank()
            && !this.alert.description.isBlank()
        ) this.alert.status = true
        this.binding.alert = this.alert
    }

    fun onClick(view: View) {
        this.alert.createdBy = "Admin"
        this.alert.createdById = Constant.BLANK
        this.alert.date = Converter.toDate(this.ui.date)
        this.alert.id = Constant.BLANK
        this.alert.standardIds = Arrays.asList("K5iknemJaXRzta5TraZv")
        this.alert.divisionIds = Arrays.asList("VSYfYhIOvsi4oPdJEtwi")
        this.alert.studentIds = emptyList()
        addAlert()
    }

    private fun addAlert() {
        buttonAdd.isEnabled = false
        this.viewModel.set(data = this.alert)
            .observe(viewLifecycleOwner, Observer { result ->
                this.binding.buttonAdd.isEnabled = true
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
        this.alert = Alert()
        this.ui.date = Constant.BLANK
        this.binding.ui = this.ui
    }
}