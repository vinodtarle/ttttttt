package com.kidgeneration.school.kg.base.di

import android.content.Context
import com.kidgeneration.school.kg.activities.adapter.AdapterActivities
import com.kidgeneration.school.kg.module.adapter.AdapterModule
import com.kidgeneration.school.kg.school.adapter.AdapterSchool
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object ModuleAdapter {

    @Singleton
    @Provides
    fun adapterSchool(@ApplicationContext context: Context): AdapterSchool {
        return AdapterSchool(context)
    }

    @Singleton
    @Provides
    fun adapterActivities(@ApplicationContext context: Context): AdapterActivities {
        return AdapterActivities(context)
    }

    @Singleton
    @Provides
    fun adapterModule(): AdapterModule {
        return AdapterModule()
    }
}