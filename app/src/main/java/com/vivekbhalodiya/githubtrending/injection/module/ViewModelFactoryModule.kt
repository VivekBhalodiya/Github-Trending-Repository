/*
 * Created by Vivek Bhalodiya on 19/11/19 1:29 AM
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 19/11/19 1:29 AM
 */

package com.vivekbhalodiya.githubtrending.injection.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vivekbhalodiya.githubtrending.injection.scope.ViewModelScope
import com.vivekbhalodiya.githubtrending.ui.home.HomeViewModel
import com.vivekbhalodiya.githubtrending.ui.trending.TrendingReposViewModel
import com.vivekbhalodiya.githubtrending.utils.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * Created by Vivek Patel on 2019-11-19.
 */
@Module
abstract class ViewModelFactoryModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    /**
     * Activity's ViewModels
     */

    @Binds
    @IntoMap
    @ViewModelScope(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

    /**
     * Fragment's ViewModels
     */

    @Binds
    @IntoMap
    @ViewModelScope(TrendingReposViewModel::class)
    abstract fun bindTrendingReposViewModel(trendingReposViewModelViewModel: TrendingReposViewModel): ViewModel
}