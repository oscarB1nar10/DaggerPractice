package com.example.daggerpractice.di

import com.example.daggerpractice.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import android.app.Application
import dagger.android.support.AndroidSupportInjectionModule


@Component(
    modules = [AndroidSupportInjectionModule::class,
                ActivityBuildersModule::class,
                AppModule::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}