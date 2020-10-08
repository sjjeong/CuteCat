package com.dino.cutecat.di

import com.dino.cutecat.remote.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val remoteModule = module {
    single<ApiService> { get<Retrofit>().create(ApiService::class.java) }
}