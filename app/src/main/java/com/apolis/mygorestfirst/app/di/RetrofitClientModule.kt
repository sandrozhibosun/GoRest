package com.apolis.mygorestfirst.app.di

import com.apolis.mygorestfirst.app.utils.Const
import com.apolis.mygorestfirst.data.network.GoRestService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitClientModule {

    @Provides
    @Singleton
    fun RetrofitClient():GoRestService{
        return Retrofit.Builder()
            .baseUrl(Const.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GoRestService::class.java)
    }

}