package com.apolis.mygorestfirst.data.repository

import com.apolis.mygorestfirst.data.network.GoRestService
import javax.inject.Inject

class UserRepository @Inject constructor(private val goRestService: GoRestService) {

    suspend fun getUserFromService() = goRestService.getUserFromApi()

}