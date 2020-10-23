package com.kidgeneration.school.kg.school.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import com.kidgeneration.school.kg.base.viewmodel.BaseViewModel
import com.kidgeneration.school.kg.school.repository.RepositorySchool

class ViewModelSchool @ViewModelInject internal constructor(
    private val repository: RepositorySchool
) : BaseViewModel(repository) {}