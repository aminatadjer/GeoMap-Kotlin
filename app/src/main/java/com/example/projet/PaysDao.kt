package com.example.projet

import androidx.room.Dao
import androidx.room.Query

@Dao
interface PaysDao {
    @Query("SELECT * FROM pays")
    fun getAll(): List<Pays>

    @Query("SELECT * FROM pays WHERE id = :id")
    fun getById(id: Int): Pays

    @Query("SELECT count(*) FROM pays")
    fun getSize(): Int



}