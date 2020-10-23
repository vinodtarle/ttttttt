package com.kidgeneration.school.kg.alert.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.activities.model.Activities
import com.kidgeneration.school.kg.alert.viewmodel.ViewModelAlert
import com.kidgeneration.school.kg.base.repository.Resource
import com.kidgeneration.school.kg.base.model.toObjects
import com.kidgeneration.school.kg.base.utility.extension.homeBackButton
import com.kidgeneration.school.kg.base.utility.extension.homeOptionMenu
import com.kidgeneration.school.kg.base.utility.extension.navigateTo
import com.kidgeneration.school.kg.base.utility.extension.setTitle
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.module.adapter.AdapterModule
import com.kidgeneration.school.kg.module.model.Data
import com.kidgeneration.school.kg.module.model.ModuleType
import com.kidgeneration.school.kg.module.model.Role
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_activities.*
import javax.inject.Inject

@AndroidEntryPoint
class FragmentAlert : BaseFragment(layoutResourceId = R.layout.fragment_alert) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelAlert by viewModels()

    @Inject
    lateinit var adapter: AdapterModule

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        initNavigation()
        initObserver()
        initRecyclerView()

        setTitle(R.string.titleAlert)
        homeBackButton()
        homeOptionMenu()
    }

    override fun init() {

    }

    override fun initNavigation() {
        fabAdd.setOnClickListener {
            navigateTo(R.id.toFragmentAlertAdd)
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

    private fun updateData(collection: List<Activities>) {
        this.adapter.setData(
            baseFragment = this,
            data = Data(
                role = Role.Teacher,
                type = ModuleType.Alert,
                collection = collection
            )
        )
    }
}
