package com.gmail.nmessaoudene.tp_news.dal.online

import com.gmail.nmessaoudene.tp_news.dal.online.models.ArticleResponse
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitApiService {

    @GET("/everything")
    fun getArticles(): Call<ArticleResponse>
}