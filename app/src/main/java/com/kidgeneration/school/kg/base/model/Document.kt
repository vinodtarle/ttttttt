package com.kidgeneration.school.kg.base.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ServerTimestamp
import com.kidgeneration.school.kg.BR
import com.kidgeneration.school.kg.base.utility.constant.Constant
import java.io.Serializable
import java.util.*

inline fun <reified T : Model> DocumentSnapshot.toObject(): T {
    return this.toObject(T::class.java)!!.also {
        it.id = this.id
    }
}

inline fun <reified T : Model> QuerySnapshot.toObjects(): List<T> {
    return this.documents.map {
        it.toObject<T>()
    }
}

interface Model : Serializable {
    var id: String
}

abstract class BaseModel : BaseObservable(), Model {

    @ServerTimestamp
    @get:Bindable
    var createdAt: Date? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.createdAt)
        }

    @get:Bindable
    var createdBy: String =
        Constant.BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.createdBy)
        }

    @get:Bindable
    var createdById: String =
        Constant.BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.createdById)
        }

    @get:Bindable
    var selected: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.selected)
        }

    @get:Bindable
    var status: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.status)
        }

    @get:Bindable
    var date: Date? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.date)
        }

    @get:Bindable
    var time: String = Constant.BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.time)
        }

}
