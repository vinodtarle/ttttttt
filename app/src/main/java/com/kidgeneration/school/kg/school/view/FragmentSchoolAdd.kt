package com.kidgeneration.school.kg.school.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.address.Address
import com.kidgeneration.school.kg.base.model.UI
import com.kidgeneration.school.kg.base.repository.Resource
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.contact.Contact
import com.kidgeneration.school.kg.databinding.FragmentSchoolAddBinding
import com.kidgeneration.school.kg.school.model.School
import com.kidgeneration.school.kg.school.viewmodel.ViewModelSchool
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_school_add.*

@AndroidEntryPoint
class FragmentSchoolAdd : BaseFragment(layoutResourceId = R.layout.fragment_school_add) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelSchool by viewModels()

    private lateinit var binding: FragmentSchoolAddBinding
    private lateinit var data: School
    private lateinit var ui: UI

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentSchoolAddBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initListener()
    }

    override fun init() {
        ui = UI()
        data = School()
        data.apply {
            this.address = Address()
            this.contact = Contact()
        }
        this.binding.ui = ui
        this.binding.data = data
    }

    override fun initListener() {
        edName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                validate()
            }
        })
        edDate.setOnClickListener {
            hideKeyboard()
            datePickerDialog { date ->
                ui.date = date
            }
        }
        edDate.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                layoutDate.helperText = getString(R.string.helperRequired)
                if (s!!.isBlank()) layoutDate.error = getString(R.string.errorRequired)
                validate()
            }
        })
        edPhoneNumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                validate()
            }
        })
        buttonAdd.setOnClickListener {
            if (validate())
                onClick()
        }
    }

    private fun validate(): Boolean {
        return true
    }

    fun onClick() {

        val data = Gson().toJson(data)
        val ui = Gson().toJson(ui)

        println(">>>>> data $data")
        println(">>>>> ui $ui")
        //addData()
    }

    private fun addData() {
        buttonAdd.isEnabled = false
        viewModel.set(data = data)
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
        data = School()
        binding.ui = UI()
        binding.data = data
    }
}
