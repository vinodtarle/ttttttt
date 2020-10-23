package com.kidgeneration.school.kg.certificate.model

import com.google.firebase.firestore.Exclude
import com.kidgeneration.school.kg.base.model.BaseModel
import com.kidgeneration.school.kg.base.utility.constant.Constant.Companion.BLANK

data class Certificate(
    @get:Exclude override var id: String = BLANK
) : BaseModel() {

}
