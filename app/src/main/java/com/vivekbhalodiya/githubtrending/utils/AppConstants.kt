/*
 * Created by Vivek Bhalodiya on 19/11/19 2:32 PM
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 19/11/19 2:32 PM
 */

package com.vivekbhalodiya.githubtrending.utils

/**
 * Created by Vivek Patel on 2019-11-19.
 */

class AppConstants {
    companion object {
        const val DATABASE_NAME = "trendingrepos_db"

        //Time Conversions
        private const val SECOND_IN_MILLISECONDS: Long = 1000
        private const val MINUTE_IN_MILLISECONDS: Long = 60 * SECOND_IN_MILLISECONDS
        const val HOUR_IN_MILLISECONDS: Long = 60 * MINUTE_IN_MILLISECONDS
        const val TWO_HOURS_IN_MILLISECONDS: Long = HOUR_IN_MILLISECONDS * 2
    }
}

enum class TrendingReposOrderBy(val value: String) {
    DEFAULT(""),
    STARS("stars"),
    NAME("name")
}

enum class OrderType {
    DESC,
    ASC
}