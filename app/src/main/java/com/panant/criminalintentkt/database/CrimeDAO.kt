package com.panant.criminalintentkt.database

import androidx.room.Dao
import androidx.room.Query
import com.panant.criminalintentkt.Crime
import java.util.UUID

@Dao
interface CrimeDAO {
    @Query("Select * from crime")
    fun getCrimes(): List<Crime>

    @Query("Select * from crime where id=(:id)")
    fun getCrime(id: UUID): Crime
}