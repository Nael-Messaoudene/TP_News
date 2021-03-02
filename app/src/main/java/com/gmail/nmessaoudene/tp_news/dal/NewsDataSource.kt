package com.gmail.nmessaoudene.tp_news.dal

import androidx.lifecycle.LiveData
import com.gmail.nmessaoudene.tp_news.models.Article
import retrofit2.http.Query

interface NewsDataSource {

    fun getArticles(query: String): LiveData<List<Article>>
}