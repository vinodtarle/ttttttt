package com.kidgeneration.school.kg.dashboard.parent.view

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
import com.kidgeneration.school.kg.base.utility.extension.setTitle
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.module.adapter.AdapterModule
import com.kidgeneration.school.kg.module.model.Data
import com.kidgeneration.school.kg.module.model.Module
import com.kidgeneration.school.kg.module.model.ModuleType
import com.kidgeneration.school.kg.module.model.Role
import com.kidgeneration.school.kg.module.viewmodel.ViewModelModule
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_parent.*
import javax.inject.Inject

@AndroidEntryPoint
class FragmentParent : BaseFragment(layoutResourceId = R.layout.fragment_parent) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModelModule: ViewModelModule by viewModels()

    @Inject
    lateinit var adapterModule: AdapterModule

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initRecyclerView()
        initObserver()
        initListener()

        setTitle(R.string.titleParent)
        homeBackButton()
        homeOptionMenu()
    }

    override fun init() {
    }

    override fun initRecyclerView() {
        recyclerViewModule.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerViewModule.setHasFixedSize(true)
        recyclerViewModule.adapter = this.adapterModule
    }

    override fun initObserver() {
        this.viewModelModule.collection()
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

    private fun updateData(collection: List<Module>) {
        this.adapterModule.setData(
            baseFragment = this,
            data = Data(
                role = Role.Parent,
                type = ModuleType.Module,
                collection = collection
            )
        )
    }

    override fun initListener() {}

    fun navigate(document: Module) {
        //navigateTo(document = document)
        println(document.moduleName)
    }
}
