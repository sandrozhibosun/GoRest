package com.apolis.mygorestfirst.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.apolis.mygorestfirst.app.di.DaggerAppComponent
import com.apolis.mygorestfirst.data.model.User
import com.apolis.mygorestfirst.data.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainViewModel:ViewModel() {

    @Inject
    lateinit var repository: UserRepository
    init {
        val component=DaggerAppComponent.create()
        component.inject(this)
    }

    val userLivedata:LiveData<ArrayList<User>> = liveData {
        withContext(Dispatchers.IO){
            emit(repository.getUserFromService().userList)
        }

    }
    fun onclick(){

        Log.d("abc","click this message")
    }


}