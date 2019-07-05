package com.example.daggerpractice.di

import com.example.daggerpractice.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.Provides



@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity



}