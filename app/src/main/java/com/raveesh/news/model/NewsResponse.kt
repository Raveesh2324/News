package com.raveesh.news.model

import com.raveesh.news.model.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)