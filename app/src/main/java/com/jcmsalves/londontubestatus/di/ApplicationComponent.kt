package com.jcmsalves.londontubestatus.di

import com.jcmsalves.data.di.NetworkModule
import com.jcmsalves.londontubestatus.App
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
    NetworkModule::class,
    RepositoryModule::class,
    MappersModule::class,
    InteractorsModule::class])
interface ApplicationComponent {
    fun inject(app: App)
}
