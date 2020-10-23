package com.kidgeneration.school.kg.base.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.google.firebase.firestore.ServerTimestamp
import com.kidgeneration.school.kg.BR
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK

class UI : BaseObservable() {
    @ServerTimestamp
    @get:Bindable
    var date: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.date)
        }

    @ServerTimestamp
    @get:Bindable
    var time: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.time)
        }

    @get:Bindable
    var update: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.update)
        }
}