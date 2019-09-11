package com.example.ass6_fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_three.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*

/**
 * A simple [Fragment] subclass.
 */
class Three : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        view.btnClickFragThree.setOnClickListener() {
            var fragment: Fragment? = null
            fragment = Onefragment()
            replaceFragment(fragment)
        }
        return view
    }
    fun replaceFragment(someFragment: Fragment){
        val transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.frameLayout, someFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
