package com.appdev.jphil.basemvp.main.injection

import com.appdev.jphil.basemvp.example.ExampleFragment
import com.appdev.jphil.basemvp.example.ExampleFragmentModule
import com.appdev.jphil.basemvp.main.injection.scopes.PerFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = [ExampleFragmentModule::class])
    abstract fun providesExampleFragment(): ExampleFragment
}