package com.kidgeneration.school.kg.module.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import com.kidgeneration.school.kg.base.viewmodel.BaseViewModel
import com.kidgeneration.school.kg.module.repository.RepositoryModule

class ViewModelModule @ViewModelInject internal constructor(
    private val repository: RepositoryModule
) : BaseViewModel(repository) {}