package com.panant.criminalintentkt.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.panant.criminalintentkt.Crime
import java.util.UUID

@Dao
interface CrimeDao {
    @Query("Select * from crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("Select * from crime where id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}