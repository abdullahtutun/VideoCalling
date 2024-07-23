package com.abdullahtutun.videocallingapp.di

import com.abdullahtutun.videocallingapp.VideoCallingApp
import com.abdullahtutun.videocallingapp.connect.ConnectViewModel
import com.abdullahtutun.videocallingapp.video.VideoCallViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val  appModule = module {
    factory {
        val app = androidContext().applicationContext as VideoCallingApp
        app.client
    }

    viewModelOf(::ConnectViewModel)
    viewModelOf(::VideoCallViewModel)
}