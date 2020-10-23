package com.kidgeneration.school.kg.activities.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import com.kidgeneration.school.kg.activities.repository.RepositoryActivities
import com.kidgeneration.school.kg.base.viewmodel.BaseViewModel

class ViewModelActivities @ViewModelInject internal constructor(
    private val repository: RepositoryActivities
) : BaseViewModel(repository) {}