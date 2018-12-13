package com.appdev.jphil.basemvp.main.injection

import com.appdev.jphil.basemvp.main.MainActivity
import com.appdev.jphil.basemvp.main.injection.scopes.PerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun providesMainActivity(): MainActivity
}