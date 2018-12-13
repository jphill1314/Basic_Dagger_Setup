package com.appdev.jphil.basemvp.main

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import com.appdev.jphil.basemvp.main.injection.AppComponent
import com.appdev.jphil.basemvp.main.injection.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainApplication : HasActivityInjector, HasSupportFragmentInjector, Application() {

    lateinit var component: AppComponent
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder().application(this).build()
        component.inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return activityInjector
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector
    }
}