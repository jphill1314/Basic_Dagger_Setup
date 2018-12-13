package com.appdev.jphil.basemvp.example

import com.appdev.jphil.basemvp.main.injection.scopes.PerFragment
import dagger.Binds
import dagger.Module

@Module
abstract class ExampleFragmentModule {

    @Binds
    @PerFragment
    abstract fun providesPresenter(presenter: ExamplePresenter): ExampleContract.Presenter

    @Binds
    @PerFragment
    abstract fun providesRepository(repository: ExampleRepository): ExampleContract.Repository
}