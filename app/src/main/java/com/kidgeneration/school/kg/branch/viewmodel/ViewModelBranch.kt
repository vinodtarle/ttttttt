package com.kidgeneration.school.kg.branch.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import com.kidgeneration.school.kg.base.viewmodel.BaseViewModel
import com.kidgeneration.school.kg.branch.repository.RepositoryBranch

class ViewModelBranch @ViewModelInject internal constructor(
    private val repository: RepositoryBranch
) : BaseViewModel(repository) {}