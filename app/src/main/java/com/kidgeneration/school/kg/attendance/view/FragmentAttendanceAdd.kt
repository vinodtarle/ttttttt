package com.kidgeneration.school.kg.attendance.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.attendance.viewmodel.ViewModelAttendance
import com.kidgeneration.school.kg.base.repository.Resource
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.module.adapter.AdapterModule
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_attendance_add.*
import javax.inject.Inject

@AndroidEntryPoint
class FragmentAttendanceAdd : BaseFragment(layoutResourceId = R.layout.fragment_attendance_add) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelAttendance by viewModels()

    @Inject
    lateinit var adapter: AdapterModule

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initNavigation()
        initObserver()
        initListener()
        initRecyclerView()
    }

    override fun init() {
    }

    override fun initNavigation() {
        /*fabAdd.setOnClickListener {
            val bundle = bundleOf("data" to "some hard code string type data")
            navigateTo(
                FragmentDirections.R.id.action_fragmentAttendance_to_fragmentAddAttendance,
                bundle
            )
        }*/
    }

    override fun initObserver() {
        this.viewModel.collection()
            .observe(viewLifecycleOwner, Observer { result ->
                when (result) {
                    is Resource.Loading -> {
                        showProgressBar()
                    }
                    is Resource.Success -> {
                        updateData()
                    }
                    is Resource.Error -> {
                        hideProgressBar()
                        showFullScreenError()
                    }
                }
            })
    }

    override fun initListener() {

    }

    override fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }

    private fun updateData() {
    }
}
