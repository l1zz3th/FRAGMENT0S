package com.example.fragmentos

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), FRAG1.OnFragmentInteractionListener,
                                           FRAG2.OnFragmentInteractionListener,
                                           FRAG3.OnFragmentInteractionListener{
    override fun onFragmentInteractionC(uri: Uri) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragmentInteractionB(uri: Uri) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFragmentInteractionA(uri: Uri) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var FRAGM1 = true
    var FRAGM2 = true


    fun CambiarFrag (view: View) {
        val fragmentoFRAG1 = FRAG1()
        val fragmentoFRAG2 = FRAG2()
        val fragmentoFRAG3 = FRAG3()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        if (FRAGM1)
        {
            FRAGM1 = false
            transaction.replace(R.id.reemplazar, fragmentoFRAG1)
            transaction.commit()
        }

        else if (FRAGM2)
        {
            FRAGM2 = false
            transaction.replace(R.id.reemplazar, fragmentoFRAG2)
            transaction.commit()
        }

        else
        {
            FRAGM1 = true
            FRAGM2 = true
            transaction.replace(R.id.reemplazar, fragmentoFRAG3)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

}
