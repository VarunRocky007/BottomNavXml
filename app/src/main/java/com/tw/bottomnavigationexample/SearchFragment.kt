package com.tw.bottomnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.fragment.navArgs

class SearchFragment : Fragment() {
    private val args : SearchFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_search, container, false)
        val searchEditText = view.findViewById<EditText>(R.id.search_edit_text)
        searchEditText.setText(args.search)
        return view
    }
}