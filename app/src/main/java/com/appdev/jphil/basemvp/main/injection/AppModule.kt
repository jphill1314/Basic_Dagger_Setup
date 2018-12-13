package com.appdev.jphil.basemvp.main.injection

import android.app.Application
import android.content.Context
import android.content.res.Resources
import com.appdev.jphil.basemvp.main.injection.scopes.PerApplication
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class AppModule {

    @Binds
    @PerApplication
    abstract fun providesContext(application: Application): Context

    @Module
    companion object {
        @JvmStatic
        @Provides
        @PerApplication
        fun providesResources(context: Context): Resources = context.resources
    }
}