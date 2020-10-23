package com.kidgeneration.school.kg.alert.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.kidgeneration.school.kg.base.repository.BaseRepository
import com.kidgeneration.school.kg.base.utility.constant.Path
import javax.inject.Inject

class RepositoryAlert @Inject internal constructor(
    override val path: String,
    override val firebase: FirebaseFirestore
) : BaseRepository()