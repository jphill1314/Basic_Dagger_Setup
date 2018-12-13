package com.appdev.jphil.basemvp.mvp

import android.content.Context
import android.support.v4.app.Fragment
import javax.inject.Inject

open class BaseFragment<P: MVPContract.Presenter<MVPContract.View<*>>>: MVPContract.View<P>, Fragment(){

    @Inject
    lateinit var presenter: P

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        presenter.onViewAttached(this)
    }

    override fun onDetach() {
        presenter.onViewDetached()
        super.onDetach()
    }
}