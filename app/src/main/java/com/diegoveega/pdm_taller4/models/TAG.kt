package com.diegoveega.pdm_taller4.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "TAG_table")
data class TAG
    (@PrimaryKey (autoGenerate = true) val id_libro: Int,
     @ColumnInfo(name = "nombre") val nombre_tag : String)