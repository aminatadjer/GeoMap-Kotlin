package com.example.projet

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities =arrayOf(Pays::class),version = 1)
abstract class PaysDB: RoomDatabase() {
    abstract fun seanceDao(): PaysDao
    companion object {
        @Volatile
        private var INSTANCE: PaysDB? = null
        //Singleton pattern with synchonization

        fun getDB(context: Context):PaysDB {
            if (INSTANCE != null) {
                return INSTANCE as PaysDB
            }
            synchronized(this) {
                val db = Room.databaseBuilder(
                    context.applicationContext, PaysDB::class.java, "database_pays"
                ).allowMainThreadQueries().build()
                INSTANCE = db
                return db
            }
        }}
}