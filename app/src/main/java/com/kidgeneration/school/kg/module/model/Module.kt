package com.kidgeneration.school.kg.module.model

import androidx.databinding.Bindable
import com.google.firebase.firestore.Exclude
import com.kidgeneration.school.kg.BR
import com.kidgeneration.school.kg.base.model.BaseModel
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK

data class Module(
    @get:Exclude override var id: String = BLANK
) : BaseModel() {

    @get:Bindable
    var hasModule: Boolean = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.hasModule)
        }

    @get:Bindable
    var moduleNumber: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.moduleNumber)
        }

    @get:Bindable
    var moduleName: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.moduleName)
        }

    @get:Bindable
    var accessible: List<String>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.accessible)
        }

    @get:Bindable
    var accessibleAdd: List<String>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.accessibleAdd)
        }

    @get:Bindable
    var accessibleUpdate: List<String>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.accessibleUpdate)
        }

    @get:Bindable
    var accessibleDelete: List<String>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.accessibleDelete)
        }
}