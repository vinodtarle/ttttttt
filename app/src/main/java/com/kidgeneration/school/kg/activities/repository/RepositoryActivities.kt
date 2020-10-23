package com.kidgeneration.school.kg.activities.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.kidgeneration.school.kg.base.repository.BaseRepository

class RepositoryActivities internal constructor(
    override val path: String,
    override val firebase: FirebaseFirestore
) : BaseRepository()