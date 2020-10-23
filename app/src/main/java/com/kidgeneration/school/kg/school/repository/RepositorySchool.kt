package com.kidgeneration.school.kg.school.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.kidgeneration.school.kg.base.repository.BaseRepository
import javax.inject.Inject

class RepositorySchool @Inject internal constructor(
    override val path: String,
    override val firebase: FirebaseFirestore
) : BaseRepository()