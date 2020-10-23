package com.kidgeneration.school.kg.blog.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.repository.DataState
import com.kidgeneration.school.kg.base.utility.BaseStateEvent
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.blog.viewmodel.ViewModelBlog
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_blog.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

@AndroidEntryPoint
@ExperimentalCoroutinesApi
class FragmentBlog internal constructor(
    private val someString: String
) : BaseFragment(R.layout.fragment_blog) {
    
    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelBlog by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initObserver()
        viewModel.setStateEvent(BaseStateEvent.GetBlogEvent)
    }

    override fun initObserver() {
        viewModel.dataState.observe(viewLifecycleOwner, Observer { state ->
            when (state) {
                is DataState.Loading -> {
                    Toast.makeText(requireContext(), "Loading...", Toast.LENGTH_SHORT).show()
                }
                is DataState.Success -> {
                    val data = StringBuilder()
                    for (blog in state.data) {
                        data.append(blog.title + "\n")
                    }
                    tvText.text = data
                    Toast.makeText(requireContext(), "Success...", Toast.LENGTH_SHORT).show()
                }
                is DataState.Error -> {
                    println(">>>> ${state.exception.message}")
                    Toast.makeText(requireContext(), "Error...", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }
}