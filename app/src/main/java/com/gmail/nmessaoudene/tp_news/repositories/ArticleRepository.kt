package com.gmail.nmessaoudene.tp_news.repositories

import androidx.lifecycle.LiveData
import com.gmail.nmessaoudene.tp_news.dal.NewsDataSource
import com.gmail.nmessaoudene.tp_news.dal.online.ArticleOnlineService
import com.gmail.nmessaoudene.tp_news.models.Article

class ArticleRepository {
    private val dataSource: NewsDataSource = ArticleOnlineService()
    fun getArticles(query:String): LiveData<List<Article>> {
        return dataSource.getArticles(query)
    }

    companion object {
        private var instance: ArticleRepository? = null
        fun getInstance(): ArticleRepository {
            if(instance == null){
                instance = ArticleRepository()
            }
            return instance!!
        }
    }
}