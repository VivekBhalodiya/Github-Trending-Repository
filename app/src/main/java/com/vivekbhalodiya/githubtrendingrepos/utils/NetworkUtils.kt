/*
 * Created by Vivek Bhalodiya on 19/11/19 12:21 PM
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 19/11/19 12:21 PM
 */

package com.vivekbhalodiya.githubtrendingrepos.utils

import android.content.Context
import android.net.ConnectivityManager
import io.reactivex.Observable

/**
 * Created by Vivek Patel on 2019-11-19.
 */
class NetworkUtils constructor(
    private val context: Context,
    private val onSubscribeBroadcastReceiver: OnSubscribeBroadcastReceiver?
) {
    fun isConnected(): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        connectivityManager.activeNetworkInfo?.let { return it.isConnected }
        return false
    }

    fun networkConnectivityStream(): Observable<Boolean> {
        return Observable.create(onSubscribeBroadcastReceiver)
            .map {
                isConnected()
            }
            .distinctUntilChanged()
            .onBackground()
    }
}