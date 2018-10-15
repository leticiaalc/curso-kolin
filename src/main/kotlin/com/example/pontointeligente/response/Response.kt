package com.example.pontointeligente.response

/**
 * Created by Leticia - QA on 15/10/2018
 **/
data class Response<T> (
        val erros: ArrayList<String> = arrayListOf(),
        var data: T? = null
)