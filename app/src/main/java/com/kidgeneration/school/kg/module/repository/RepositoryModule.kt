package com.kidgeneration.school.kg.module.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.kidgeneration.school.kg.base.repository.BaseRepository
import com.kidgeneration.school.kg.base.utility.constant.Path

class RepositoryModule internal constructor(
    override val path: String,
    override val firebase: FirebaseFirestore
) : BaseRepository()
