package com.kidgeneration.school.kg.address

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.kidgeneration.school.kg.BR
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK

class Address : BaseObservable() {
    @get:Bindable
    var address: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.address)
        }

    @get:Bindable
    var zipcode: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.zipcode)
        }

    @get:Bindable
    var landmark: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.address)
        }

    @get:Bindable
    var nationality: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.address)
        }

    @get:Bindable
    var state: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.address)
        }

    @get:Bindable
    var district: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.address)
        }

    @get:Bindable
    var taluka: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.address)
        }

    @get:Bindable
    var city: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.address)
        }
}