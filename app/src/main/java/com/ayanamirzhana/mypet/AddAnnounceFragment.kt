package com.ayanamirzhana.mypet

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import android.widget.Button
import android.widget.Toast


class AddAnnounceFragment : Fragment() {



    private var ctx: Context? = null
    private var self: View? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        ctx = container?.context
        self = LayoutInflater.from(ctx).inflate(R.layout.fragment_add_announce, container, false)
        val bDaButton = self?.findViewById<Button>(R.id.chooseFileButton)

        bDaButton?.setOnClickListener {
            Toast.makeText(ctx, "button works!", Toast.LENGTH_SHORT).show()
            val intent = Intent(activity, StorageActivity::class.java)
            startActivity(intent)

        }
        return self
    }


    companion object {
        fun newInstance(): AddAnnounceFragment = AddAnnounceFragment()
    }


}