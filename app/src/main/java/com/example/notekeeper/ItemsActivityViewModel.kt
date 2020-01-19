package com.example.notekeeper

import android.arch.lifecycle.ViewModel

class ItemsActivityViewModel : ViewModel (){
    var navDrawerDisplaySelection = R.id.nav_notes

    private val maxRecentlyViewedNotes = 5
    val recentlyViewedNotes = ArrayList<NoteInfo>(maxRecentlyViewedNotes)

    private fun addToRecentlyViewedNotes(note: NoteInfo) {
//        Check if selection is already in the list
        val existingIndex = recentlyViewedNotes.indexOf(note)
        if (existingIndex == -1){
//            It isn't in the list...
//            Add new one to beginning of list and remove any beyond max we want to keep
            recentlyViewedNotes.add(0, note)
            for(index in recentlyViewedNotes.lastIndex downTo maxRecentlyViewedNotes)
                recentlyViewedNotes.removeAt(index)
        }else{
//            It is in the list
//            Shift the ones above down the list and make if first member of the list
            for(index in (existingIndex - 1) downTo 0)
                recentlyViewedNotes[index +1] = recentlyViewedNotes[index]
            recentlyViewedNotes[0] = note
        }
    }
}