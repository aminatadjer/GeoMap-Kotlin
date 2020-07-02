package com.example.projet

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_liste_pays.*

class listePays : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_liste_pays, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "Liste des pays"

        val pays= listOf<String>("Algérie","Suède","Norvège","Australie")
        list.adapter=ArrayAdapter(context,android.R.layout.simple_list_item_1,pays)
        list.setOnItemClickListener{parentFragment,view,position,id->
            val action=listePaysDirections.actionDetailPays()
            action.pays=position
            Toast.makeText(context,position.toString(), Toast.LENGTH_SHORT).show()
            Navigation.findNavController(view).navigate(action)

        }
        pays1.setOnClickListener{
            val action=listePaysDirections.actionDetailPays()
            Navigation.findNavController(it).navigate(action)
        }


    }


}
