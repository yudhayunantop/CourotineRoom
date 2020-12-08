package com.example.courotineroom.catatan

import androidx.room.Entity
import androidx.room.PrimaryKey

//Deklarasi tabel, kolom, dan objek
@Entity(tableName = "note_table")
data class Note(
    var title: String?,
    var description: String?,
    var priority: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}