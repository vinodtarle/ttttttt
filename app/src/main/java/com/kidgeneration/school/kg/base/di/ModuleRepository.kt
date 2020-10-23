package com.kidgeneration.school.kg.base.di

import com.google.firebase.firestore.FirebaseFirestore
import com.kidgeneration.school.kg.activities.repository.RepositoryActivities
import com.kidgeneration.school.kg.alert.repository.RepositoryAlert
import com.kidgeneration.school.kg.attendance.repository.RepositoryAttendance
import com.kidgeneration.school.kg.base.utility.constant.Path
import com.kidgeneration.school.kg.blog.repository.BlogRepository
import com.kidgeneration.school.kg.blog.repository.retrofit.BlogRetrofit
import com.kidgeneration.school.kg.blog.repository.retrofit.NetworkMapper
import com.kidgeneration.school.kg.blog.repository.room.BlogDao
import com.kidgeneration.school.kg.blog.repository.room.CacheMapper
import com.kidgeneration.school.kg.branch.repository.RepositoryBranch
import com.kidgeneration.school.kg.certificate.repository.RepositoryCertificate
import com.kidgeneration.school.kg.module.repository.RepositoryModule
import com.kidgeneration.school.kg.school.repository.RepositorySchool
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object ModuleRepository {

    @Singleton
    @Provides
    fun repositorySchool(firebase: FirebaseFirestore) =
        RepositorySchool(
            path = Path.schools(),
            firebase = firebase
        )

    @Singleton
    @Provides
    fun repositoryActivities(firebase: FirebaseFirestore) =
        RepositoryActivities(
            path = Path.activities(),
            firebase = firebase
        )

    @Singleton
    @Provides
    fun repositoryAlert(firebase: FirebaseFirestore) =
        RepositoryAlert(
            path = Path.alerts(),
            firebase = firebase
        )

    @Singleton
    @Provides
    fun repositoryAttendance(firebase: FirebaseFirestore) =
        RepositoryAttendance(
            path = Path.attendances(),
            firebase = firebase
        )

    @Singleton
    @Provides
    fun repositoryBranch(firebase: FirebaseFirestore) =
        RepositoryBranch(
            path = Path.branches(),
            firebase = firebase
        )

    @Singleton
    @Provides
    fun repositoryCertificate(firebase: FirebaseFirestore) =
        RepositoryCertificate(
            path = Path.certificates(),
            firebase = firebase
        )

    @Singleton
    @Provides
    fun repositoryModule(firebase: FirebaseFirestore) =
        RepositoryModule(
            path = Path.modules(),
            firebase = firebase
        )

    @Singleton
    @Provides
    fun provideBlogRepository(
        blogDao: BlogDao,
        blogRetrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): BlogRepository =
        BlogRepository(
            blogDao = blogDao,
            blogRetrofit = blogRetrofit,
            cacheMapper = cacheMapper,
            networkMapper = networkMapper
        )
}