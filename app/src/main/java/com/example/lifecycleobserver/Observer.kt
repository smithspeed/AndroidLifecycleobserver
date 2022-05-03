package com.example.lifecycleobserver

import android.util.Log
import androidx.lifecycle.*


class Observer: DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        Log.d("Main*", "onCreate: observer")
    }

    override fun onStart(owner : LifecycleOwner){
        Log.d("Main*", "onStart: observer")
    }

    override fun onStop(owner : LifecycleOwner){
        Log.d("Main*", "onStop: observer")
    }

    override fun onResume(owner : LifecycleOwner){
        Log.d("Main*", "onResume: observer")
    }

    override fun onPause(owner : LifecycleOwner){
        Log.d("Main*", "onPause: observer")
    }

    override fun onDestroy(owner : LifecycleOwner){
        Log.d("Main*", "onDestroy: observer")
    }
}