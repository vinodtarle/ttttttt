package com.kidgeneration.school.kg.dashboard.teacher.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.activities.adapter.AdapterActivities
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
import kotlinx.android.synthetic.main.fragment_teacher.*
import javax.inject.Inject

@AndroidEntryPoint
class FragmentTeacher : BaseFragment(layoutResourceId = R.layout.fragment_teacher) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModelModule: ViewModelModule by viewModels()

    @Inject
    lateinit var adapterModule: AdapterModule

    @Inject
    lateinit var adapterActivities: AdapterActivities

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initRecyclerView()
        initNavigation()
        initObserver()
        initListener()


        println(">>>>>> ${this::adapterActivities.isInitialized}")

        setTitle(R.string.titleTeacher)
        homeBackButton()
        homeOptionMenu()
    }

    override fun init() {

    }

    override fun initRecyclerView() {
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = this.adapterModule
    }

    override fun initNavigation() {
        /*btnFab.setOnClickListener {
            val bundle = bundleOf("data" to "some hard code string type data")
            navigateTo(
                FragmentDirections.R.id.action_fragmentActivities_to_fragmentAddActivities,
                bundle
            )
        }*/
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
                role = Role.Teacher,
                type = ModuleType.Module,
                collection = collection
            )
        )
    }

    override fun initListener() {}

    fun navigate(document: Module) {
        //navigateTo(document = document)
    }
}
