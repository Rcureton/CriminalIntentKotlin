package com.bignerdranch.android.criminalintentkotlin

import java.util.*

data class Crime(var id: UUID = UUID.randomUUID(), var title: String = "", var date: Date = Date(),
                 var solved: Boolean = true) {

    init {
        id = UUID.randomUUID()
        date = Date()
    }


}
