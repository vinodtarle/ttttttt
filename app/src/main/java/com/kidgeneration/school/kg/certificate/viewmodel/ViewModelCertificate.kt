package com.kidgeneration.school.kg.certificate.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import com.kidgeneration.school.kg.base.viewmodel.BaseViewModel
import com.kidgeneration.school.kg.certificate.repository.RepositoryCertificate

class ViewModelCertificate @ViewModelInject internal constructor(
    private val repository: RepositoryCertificate
) : BaseViewModel(repository) {}
