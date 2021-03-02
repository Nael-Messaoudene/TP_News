package com.gmail.nmessaoudene.tp_news.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gmail.nmessaoudene.tp_news.models.Article
import com.gmail.nmessaoudene.tp_news.repositories.ArticleRepository
import java.util.concurrent.Executors


class HomeViewModel : ViewModel() {

    private val repository: ArticleRepository = ArticleRepository.getInstance()
    private val _articles = MutableLiveData<List<Article>>()
    val articles: LiveData<List<Article>>
        get() = _articles

    init {
        loadArticles(query = "Covid")
    }

    fun loadArticles(query:String) {
        Executors.newSingleThreadExecutor().execute() {
            val result = repository.getArticles(query)
            _articles.postValue(result.value)
        }
    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}