package com.bookmoa.android.services

import android.content.Context
import android.content.SharedPreferences

class TokenManager(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)


    private val hardcodedToken = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJCQiIsImF1dGgiOiJST0xFX1VTRVIiLCJuaWNrbmFtZSI6IkJCIiwiZXhwIjoxNzI0Mzg1NjYyfQ.jIbMoTVOnhzR8O42Nu2fDbtWorhEiUVVNQwiZaDOs9E"
    fun getToken(): String {

        return hardcodedToken
    }
}