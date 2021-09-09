package com.yunuserbek.havadurumu.service

import com.yunuserbek.havadurumu.model.WeathearModel
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class WeahearAPiService {

    private val BASE_URL = "http://api.openweathermap.org/"

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(WeathearAPİ::class.java)

    fun getDataService(cityName: String): Single<WeathearModel> {
        return api.getData(cityName)
    }

}