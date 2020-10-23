package com.kidgeneration.school.kg.base.view

import android.os.Bundle
import android.view.View
import com.google.gson.Gson
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.address.Address
import com.kidgeneration.school.kg.base.utility.extension.homeBackButton
import com.kidgeneration.school.kg.base.utility.extension.homeOptionMenu
import com.kidgeneration.school.kg.base.utility.extension.navigateTo
import com.kidgeneration.school.kg.base.utility.extension.setTitle
import com.kidgeneration.school.kg.contact.Contact
import com.kidgeneration.school.kg.school.model.School
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

@AndroidEntryPoint
@ExperimentalCoroutinesApi
class FragmentMain internal constructor(private val someString: String = "") : BaseFragment(R.layout.fragment_main) {

    override fun className(): String = this.javaClass.simpleName

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewModel.setStateEvent(MainStateEvent.GetBlogEvent)

        init()
        initObserver()

        setTitle()
        homeBackButton(visible = false)
        homeOptionMenu(visible = true)
    }

    override fun init() {
        buttonTeacher.setOnClickListener {
            navigateTo(R.id.toFragmentTeacher)
        }

        buttonParent.setOnClickListener {
            navigateTo(R.id.toFragmentParent)
        }

        buttonSchool.setOnClickListener {
            navigateTo(R.id.fragmentSchool)
        }
    }
}