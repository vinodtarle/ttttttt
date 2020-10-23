package com.kidgeneration.school.kg.base.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kidgeneration.school.kg.base.repository.BaseRepository
import com.kidgeneration.school.kg.base.repository.Resource
import com.kidgeneration.school.kg.base.repository.Response

abstract class BaseViewModel(private val repository: BaseRepository) : ViewModel() {

    val update: MutableLiveData<Boolean> = MutableLiveData()

    fun set(data: Any): LiveData<Resource<Response>> {
        return this.repository.set(data = data)
    }

    fun update(documentId: String, key: String, value: Any): LiveData<Resource<Response>> {
        return this.repository.update(
            documentId = documentId,
            key = key,
            value = value
        )
    }

    fun delete(documentId: String): LiveData<Resource<Response>> {
        return this.repository.delete(documentId = documentId)
    }

    fun document(documentId: String): LiveData<Resource<Response>> {
        return this.repository.document(documentId = documentId)
    }

    fun documentListener(documentId: String): LiveData<Resource<Response>> {
        return this.repository.documentListener(documentId = documentId)
    }

    fun collection(): LiveData<Resource<Response>> {
        return this.repository.collection()
    }

    fun collectionListener(): LiveData<Resource<Response>> {
        return this.repository.collectionListener()
    }

    fun byStandard(standardId: String): LiveData<Resource<Response>> {
        return this.repository.byStandard(value = standardId)
    }

    fun byDivision(divisionId: String): LiveData<Resource<Response>> {
        return this.repository.byDivision(value = divisionId)
    }

    fun byStudent(studentId: String): LiveData<Resource<Response>> {
        return this.repository.byStudent(value = studentId)
    }
}