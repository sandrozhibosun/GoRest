package com.apolis.mygorestfirst.app.di

import com.apolis.mygorestfirst.viewmodel.MainViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(RetrofitClientModule::class))
interface AppComponent {
    fun inject(viewModel: MainViewModel)
}