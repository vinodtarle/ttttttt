package com.kidgeneration.school.kg.branch.model

import androidx.databinding.Bindable
import com.google.firebase.firestore.Exclude
import com.kidgeneration.school.kg.BR
import com.kidgeneration.school.kg.address.Address
import com.kidgeneration.school.kg.base.model.BaseModel
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK
import com.kidgeneration.school.kg.contact.Contact

data class Branch(
    @get:Exclude override var id: String = BLANK
) : BaseModel() {

    @get:Bindable
    var schoolId: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.schoolId)
        }

    @get:Bindable
    var schoolName: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.schoolName)
        }

    @get:Bindable
    var branchName: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.branchName)
        }

    @get:Bindable
    var contact: Contact? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.contact)
        }

    @get:Bindable
    var address: Address? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.address)
        }

    @get:Bindable
    var geo: List<Double>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.geo)
        }

    @get:Bindable
    var logo: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.logo)
        }

    @get:Bindable
    var banner: String = BLANK
        set(value) {
            field = value
            notifyPropertyChanged(BR.banner)
        }

    @get:Bindable
    var totalLikes: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.totalLikes)
        }

    @get:Bindable
    var gallery: List<String>? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.gallery)
        }

    @get:Bindable
    var totalComments: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.totalComments)
        }

    @get:Bindable
    var averageRating: Float = 0.toFloat()
        set(value) {
            field = value
            notifyPropertyChanged(BR.averageRating)
        }
}