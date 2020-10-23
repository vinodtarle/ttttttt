package com.kidgeneration.school.kg.base.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kidgeneration.school.kg.blog.repository.room.BlogCacheEntity
import com.kidgeneration.school.kg.blog.repository.room.BlogDao

@Database(entities = [BlogCacheEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun blogDao(): BlogDao

    companion object {
        val DATABASE_NAME = "app_database"
    }
}