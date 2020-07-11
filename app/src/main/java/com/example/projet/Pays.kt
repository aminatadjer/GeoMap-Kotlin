package com.example.projet

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pays")
class Pays( @PrimaryKey var id : Int,
            var nom:String,
            var description:String,
            var surface:Double,
            var population:Double,
            var historique:List<Historique>,
            var ressourcesPrin:List<String>,
            var personnalitésPrin:List<String>,
            var drapeau: String,
            var images:List<String>,
            var hymne:String,
            var tweets:List<String>,
            var videosYoutube:List<String>

            ) {

}