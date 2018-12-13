package com.appdev.jphil.basemvp.example

import android.content.res.Resources
import com.appdev.jphil.basemvp.R
import javax.inject.Inject

class ExampleRepository @Inject constructor(private val resources: Resources): ExampleContract.Repository {

    private lateinit var presenter: ExampleContract.Presenter

    override fun attachPresenter(presenter: ExampleContract.Presenter) {
        this.presenter = presenter
    }

    override fun fetchData() {
        presenter.onDataFetched(resources.getString(R.string.app_name))
    }
}