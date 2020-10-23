package com.kidgeneration.school.kg.base.utility

sealed class BaseStateEvent {
    object GetBlogEvent : BaseStateEvent()
    object None : BaseStateEvent()
}