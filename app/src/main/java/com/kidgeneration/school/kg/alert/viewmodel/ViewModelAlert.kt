package com.kidgeneration.school.kg.alert.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import com.kidgeneration.school.kg.alert.repository.RepositoryAlert
import com.kidgeneration.school.kg.base.viewmodel.BaseViewModel

class ViewModelAlert @ViewModelInject internal constructor(
    private val repository: RepositoryAlert
) : BaseViewModel(repository) {

}