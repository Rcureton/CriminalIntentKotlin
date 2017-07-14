package com.bignerdranch.android.criminalintentkotlin

import android.content.Context
import java.util.*

class CrimeLab {
    private var mCrimes = arrayListOf<Crime>()
    constructor(context: Context) {
        for (i in 0..99) {
            var crime = Crime()
            crime.title = "Crime # " + i
            crime.solved = (i % 2 == 0)
            mCrimes.add(crime)
        }
    }

   lateinit var sCrimeLab: CrimeLab
    fun get(context: Context): CrimeLab {
        if (sCrimeLab == null) {
            sCrimeLab = CrimeLab(context)
        }
        return sCrimeLab
    }

    fun getCrimes(): List<Crime> {
        return mCrimes
    }

    fun getCrime(id: UUID): Crime {
        for (crime: Crime in mCrimes)
            if (crime.id.equals(id)) {
                return crime
            }
        return null!!
    }
}