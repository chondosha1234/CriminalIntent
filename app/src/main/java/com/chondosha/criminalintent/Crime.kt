package com.chondosha.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Crime (
    @PrimaryKey val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean,
    val suspect: String = "",
    val photoFileName: String? = null
    )
