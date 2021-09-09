package com.yunuserbek.havadurumu.service

import com.yunuserbek.havadurumu.model.WeathearModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeathearAPİ {
    @GET("data/2.5/weather?&units=metric&APPID=16175ebedcfab20214b9b02fc8aa5425")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeathearModel>
}