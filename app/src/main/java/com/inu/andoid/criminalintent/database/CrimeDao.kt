package com.inu.andoid.criminalintent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.inu.andoid.criminalintent.Crime

@Dao
interface CrimeDao {

    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: Int): LiveData<Crime?>

    @Insert
    fun addCrime(crime: Crime) //remove this before pushing


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(crime: Crime)

    @Query("DELETE FROM crime")
    suspend fun deleteAll()
}