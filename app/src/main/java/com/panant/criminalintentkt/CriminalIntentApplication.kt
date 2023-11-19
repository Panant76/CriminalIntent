package com.panant.criminalintentkt;

import android.app.Application;
import com.panant.criminalintentkt.repository.CrimeRepository

class CriminalIntentApplication : Application (){

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}
