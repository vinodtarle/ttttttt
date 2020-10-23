package com.kidgeneration.school.kg.branch.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.repository.Resource
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.branch.viewmodel.ViewModelBranch
import com.kidgeneration.school.kg.module.adapter.AdapterModule
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FragmentBranchAdd : BaseFragment(layoutResourceId = R.layout.fragment_branch_add) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelBranch by viewModels()

    @Inject
    lateinit var adapter: AdapterModule

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initNavigation()
        initObserver()
    }

    override fun init() {

    }

    override fun initNavigation() {
        /*fabAdd.setOnClickListener {
            val bundle = bundleOf("data" to "some hard code string type data")
            navigateTo(
                FragmentDirections.R.id.action_fragmentActivities_to_fragmentAddActivities,
                bundle
            )
        }*/
    }

    override fun initObserver() {
        this.viewModel.collection()
            .observe(viewLifecycleOwner, Observer {
                when (it) {
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

    private fun updateData() {
    }
}
