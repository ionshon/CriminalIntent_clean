package com.inu.andoid.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class Crime(@PrimaryKey val id: Int = 0,
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)
