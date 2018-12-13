package com.appdev.jphil.basemvp.example

import com.appdev.jphil.basemvp.mvp.MVPContract

interface ExampleContract {

    interface View: MVPContract.View<Presenter> {
        fun displayData(data: String)
    }

    interface Presenter: MVPContract.Presenter<View> {
        fun onDataFetched(data: String)
    }

    interface Repository: MVPContract.Repository {
        fun attachPresenter(presenter: Presenter)
        fun fetchData()
    }
}