package com.appdev.jphil.basemvp.example

import javax.inject.Inject

class ExamplePresenter @Inject constructor(private val repository: ExampleContract.Repository): ExampleContract.Presenter {

    private var view: ExampleContract.View? = null

    init {
        repository.attachPresenter(this)
    }

    override fun onDataFetched(data: String) {
        view?.displayData(data)
    }

    override fun onViewAttached(view: ExampleContract.View) {
        this.view = view
        repository.fetchData()
    }

    override fun onViewDetached() {
        view = null
    }
}