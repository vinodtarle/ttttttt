package com.kidgeneration.school.kg.attendance.model

import androidx.databinding.Bindable
import com.google.firebase.firestore.Exclude
import com.kidgeneration.school.kg.BR
import com.kidgeneration.school.kg.base.model.BaseModel
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK

data class Attendance(
    @get:Exclude override var id: String = BLANK
) : BaseModel() {

    @get:Bindable
    var attendance: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.attendance)
        }

    @get:Bindable
    var subjectId: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.subjectId)
        }

    @get:Bindable
    var subjectName: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.subjectName)
        }

    @get:Bindable
    var timeTableId: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.timeTableId)
        }

    @get:Bindable
    var timeTableName: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.timeTableName)
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
