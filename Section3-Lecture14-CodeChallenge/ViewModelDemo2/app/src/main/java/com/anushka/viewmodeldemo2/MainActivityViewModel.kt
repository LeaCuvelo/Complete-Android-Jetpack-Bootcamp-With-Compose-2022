package com.anushka.viewmodeldemo2

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    
    private var count = 0

    fun getCount() : Int {
        return count
    }

    fun getUpdatedCount(toAdd: Int): Int {
        count+=toAdd
        return count
    }




}