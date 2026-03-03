package com.example.project5_cs388_christopherlarena

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "water_table")
data class WaterEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val amount: Int, // in oz or ml
    val timestamp: Long = System.currentTimeMillis()
)
