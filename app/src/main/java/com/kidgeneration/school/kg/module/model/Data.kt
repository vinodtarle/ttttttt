package com.kidgeneration.school.kg.module.model

import com.kidgeneration.school.kg.base.model.BaseModel

data class Data(
    val role: Role,
    val type: ModuleType,
    val collection: List<BaseModel> = emptyList()
)