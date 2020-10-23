package com.kidgeneration.school.kg.base.di

import android.content.Context
import androidx.room.Room
import com.kidgeneration.school.kg.base.db.AppDatabase
import com.kidgeneration.school.kg.blog.repository.room.BlogDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object ModuleRoom {

    @Singleton
    @Provides
    fun provideBlogDB(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideBlogDao(blogDatabase: AppDatabase): BlogDao {
        return blogDatabase.blogDao()
    }
}