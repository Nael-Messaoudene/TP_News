package com.gmail.nmessaoudene.tp_news.dal

import androidx.lifecycle.LiveData
import com.gmail.nmessaoudene.tp_news.models.Article

interface NewsDataSource {

    fun getArticles(): LiveData<List<Article>>
}