package com.apolis.mygorestfirst.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apolis.mygorestfirst.data.model.User
import com.apolis.mygorestfirst.databinding.ItemUserBinding

class UserAdapter(val context: Context):RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    var mList= ArrayList<User>()

    inner class MyViewHolder(private val binding: ItemUserBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(user: User){
        binding.user=user
    }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(ItemUserBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.size
    }
    fun setData(userList:ArrayList<User>){
        mList=userList
        notifyDataSetChanged()

    }

}