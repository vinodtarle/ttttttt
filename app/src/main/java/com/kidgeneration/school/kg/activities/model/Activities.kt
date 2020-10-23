package com.kidgeneration.school.kg.activities.model

import androidx.databinding.Bindable
import com.google.firebase.firestore.Exclude
import com.kidgeneration.school.kg.BR
import com.kidgeneration.school.kg.base.model.BaseModel
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK

data class Activities(
    @get:Exclude override var id: String = BLANK
) : BaseModel() {

    @get:Bindable
    var title: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.title)
        }

    @get:Bindable
    var description: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.description)
        }

    @get:Bindable
    var standardIds: List<String>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.standardIds)
        }

    @get:Bindable
    var divisionIds: List<String>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.divisionIds)
        }

    @get:Bindable
    var studentIds: List<String>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.studentIds)
        }
}