package com.kidgeneration.school.kg.blog.viewmodel

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kidgeneration.school.kg.base.repository.DataState
import com.kidgeneration.school.kg.base.utility.BaseStateEvent
import com.kidgeneration.school.kg.blog.model.Blog
import com.kidgeneration.school.kg.blog.repository.BlogRepository
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class ViewModelBlog @ViewModelInject internal constructor(
    private val repository: BlogRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _dataState: MutableLiveData<DataState<List<Blog>>> = MutableLiveData()
    val dataState: LiveData<DataState<List<Blog>>>
        get() = _dataState

    fun setStateEvent(mainStateEvent: BaseStateEvent) {
        viewModelScope.launch {
            when (mainStateEvent) {
                is BaseStateEvent.GetBlogEvent -> {
                    repository.getBlog()
                        .onEach { dataState ->
                            _dataState.value = dataState
                        }.launchIn(viewModelScope)
                }
                is BaseStateEvent.None -> {
                    // TODO offs
                }
            }
        }
    }
}