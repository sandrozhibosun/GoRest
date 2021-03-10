package com.apolis.mygorestfirst.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Adapter
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.apolis.mygorestfirst.R
import com.apolis.mygorestfirst.databinding.ActivityMainBinding
import com.apolis.mygorestfirst.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val userAdapter by lazy {
        UserAdapter(this)
    }
    lateinit var viewModel:MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        init()
    }

    private fun init(){

        viewModel= ViewModelProvider(this).get(MainViewModel::class.java)
    binding.viewModel=viewModel
        binding.recyclerView.apply{
            adapter=userAdapter
            layoutManager=LinearLayoutManager(this@MainActivity)
        }

        viewModel.userLivedata.observe(this,{
            userAdapter.setData(it)

        })





    }


}