package com.gmail.nmessaoudene.tp_news.models

class Article(
    val source: Source?,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val title: String,
    val url: String,
    val urlToImage: String
)

data class Source(
    val id: String,
    val name: String
)