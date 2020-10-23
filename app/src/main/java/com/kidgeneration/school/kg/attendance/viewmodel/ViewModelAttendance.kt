package com.kidgeneration.school.kg.attendance.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import com.kidgeneration.school.kg.attendance.repository.RepositoryAttendance
import com.kidgeneration.school.kg.base.viewmodel.BaseViewModel

class ViewModelAttendance @ViewModelInject internal constructor(
    private val repository: RepositoryAttendance
) : BaseViewModel(repository) {}