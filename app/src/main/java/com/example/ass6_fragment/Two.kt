package com.example.ass6_fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_onefragment.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*

/**
 * A simple [Fragment] subclass.
 */
class Two : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_two, container, false)
        view.btnClickFragTwo.setOnClickListener() {
            var fragment: Fragment? = null
            fragment = Onefragment()
            replaceFragment(fragment)

        }
        return view
    }

    fun replaceFragment(someFragment: Fragment) {
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}