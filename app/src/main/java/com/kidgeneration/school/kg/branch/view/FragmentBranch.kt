package com.kidgeneration.school.kg.branch.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.repository.Resource
import com.kidgeneration.school.kg.base.model.toObjects
import com.kidgeneration.school.kg.base.utility.extension.homeBackButton
import com.kidgeneration.school.kg.base.utility.extension.homeOptionMenu
import com.kidgeneration.school.kg.base.utility.extension.navigateTo
import com.kidgeneration.school.kg.base.utility.extension.setTitle
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.branch.model.Branch
import com.kidgeneration.school.kg.branch.viewmodel.ViewModelBranch
import com.kidgeneration.school.kg.module.adapter.AdapterModule
import com.kidgeneration.school.kg.module.model.Data
import com.kidgeneration.school.kg.module.model.ModuleType
import com.kidgeneration.school.kg.module.model.Role
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_branch.*
import javax.inject.Inject

@AndroidEntryPoint
class FragmentBranch : BaseFragment(layoutResourceId = R.layout.fragment_branch) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelBranch by viewModels()

    @Inject
    lateinit var adapter: AdapterModule

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initNavigation()
        initObserver()
        initRecyclerView()

        setTitle(R.string.titleBranch)
        homeBackButton()
        homeOptionMenu()
    }

    override fun init() {

    }

    override fun initNavigation() {
        fabAdd.setOnClickListener {
            navigateTo(R.id.toFragmentBranchAdd)
        }
    }

    override fun initObserver() {
        this.viewModel.collection()
            .observe(viewLifecycleOwner, Observer { result ->
                when (result) {
                    is Resource.Loading -> {
                        showProgressBar()
                    }
                    is Resource.Success -> {
                        updateData(
                            collection = result.type?.collection?.toObjects() ?: emptyList()
                        )
                    }
                    is Resource.Error -> {
                        hideProgressBar()
                        showFullScreenError()
                    }
                }
            })
    }

    override fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }

    private fun updateData(collection: List<Branch>) {
        this.adapter.setData(
            baseFragment = this,
            data = Data(
                role = Role.Teacher,
                type = ModuleType.Branch,
                collection = collection
            )
        )
    }
}
