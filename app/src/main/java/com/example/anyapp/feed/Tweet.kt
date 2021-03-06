package com.example.anyapp.feed

data class Tweet(
    val tweetId: Int,
    val userId: Int,
    val userIconUrl: String,
    val username: String,
    val location: String,
    val profileName: String,
    val text: String,
    val imageUrl: String?,
    val videoUrl: String?,
    val audioUrl: String?,
    val repliesId: Int?,
    val createDate: String,
    val likes: Int,
    val isLiked: Boolean,
    val isSelf: Boolean,
)
