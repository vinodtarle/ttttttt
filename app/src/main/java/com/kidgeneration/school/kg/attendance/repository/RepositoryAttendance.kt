package com.kidgeneration.school.kg.attendance.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.kidgeneration.school.kg.base.repository.BaseRepository
import com.kidgeneration.school.kg.base.utility.constant.Path

class RepositoryAttendance internal constructor(
    override val path: String,
    override val firebase: FirebaseFirestore
) : BaseRepository()