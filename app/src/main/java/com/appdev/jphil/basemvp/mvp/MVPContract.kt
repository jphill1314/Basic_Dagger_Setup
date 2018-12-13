package com.appdev.jphil.basemvp.mvp

interface MVPContract {

    interface View<P : Presenter<*>> : SimpleView

    interface SimpleView

    interface Presenter<in V : SimpleView> {
        fun onViewAttached(view: V)
        fun onViewDetached()
    }

    interface Repository
}
