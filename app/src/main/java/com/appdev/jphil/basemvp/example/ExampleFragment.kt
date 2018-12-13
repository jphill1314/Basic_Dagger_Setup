package com.appdev.jphil.basemvp.example

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.appdev.jphil.basemvp.R
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_main.view.*
import javax.inject.Inject

class ExampleFragment: ExampleContract.View, Fragment() {

    @Inject
    lateinit var presenter: ExampleContract.Presenter
    private lateinit var textView: TextView

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onDetach() {
        presenter.onViewDetached()
        super.onDetach()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        textView = view.text_view
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.onViewAttached(this)
    }

    override fun displayData(data: String) {
        textView.text = data
    }
}