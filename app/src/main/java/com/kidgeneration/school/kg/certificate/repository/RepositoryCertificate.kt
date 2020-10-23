package com.kidgeneration.school.kg.certificate.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.kidgeneration.school.kg.base.repository.BaseRepository
import com.kidgeneration.school.kg.base.utility.constant.Path

class RepositoryCertificate internal constructor(
    override val path: String,
    override val firebase: FirebaseFirestore
) : BaseRepository()