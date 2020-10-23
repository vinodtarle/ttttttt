package com.kidgeneration.school.kg.branch.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.kidgeneration.school.kg.base.repository.BaseRepository
import com.kidgeneration.school.kg.base.utility.constant.Path

class RepositoryBranch internal constructor(
    override val path: String,
    override val firebase: FirebaseFirestore
) : BaseRepository()