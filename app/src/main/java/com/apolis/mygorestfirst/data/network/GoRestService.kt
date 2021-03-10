package com.apolis.mygorestfirst.data.network

import com.apolis.mygorestfirst.app.utils.Const
import com.apolis.mygorestfirst.data.model.UserResponse
import retrofit2.http.GET

interface GoRestService {

    @GET(Const.ENDPOINT)
    suspend fun getUserFromApi():UserResponse


}