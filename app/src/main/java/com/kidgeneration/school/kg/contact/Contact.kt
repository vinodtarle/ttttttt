package com.kidgeneration.school.kg.contact

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.kidgeneration.school.kg.BR
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK

class Contact : BaseObservable()  {

    @get:Bindable
    var phoneNumber: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.phoneNumber)
        }

    @get:Bindable
    var mobileNumber: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.mobileNumber)
        }

    @get:Bindable
    var email: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }
}