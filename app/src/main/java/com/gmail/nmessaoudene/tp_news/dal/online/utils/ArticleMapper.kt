package com.gmail.nmessaoudene.tp_news.dal.online.utils

import com.gmail.nmessaoudene.tp_news.dal.online.models.ItemResponse
import com.gmail.nmessaoudene.tp_news.dal.online.models.SourceResponse
import com.gmail.nmessaoudene.tp_news.models.Article
import com.gmail.nmessaoudene.tp_news.models.Source

fun ItemResponse.toArticle() = Article(
    author = author ?: "",
    content = content ?: "",
    title = title ?: "",
    description = description ?: "",
    publishedAt = publishedAt ?: "",
    source = source?.toSource() ?: null,
    url = url ?: "",
    urlToImage = urlToImage ?: ""
)

fun SourceResponse.toSource() = Source(
    id = id ?: "",
    name = name ?: ""
)