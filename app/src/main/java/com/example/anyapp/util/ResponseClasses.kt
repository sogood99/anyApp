package com.example.anyapp.util

// Retro2 Api Response Data Classes
data class CreateUserResponse(
    val id: Int,
    val username: String,
    val email: String,
    val token: String,
)

data class LoginResponse(
    val token: String,
)

data class ProfileResponse(
    val userId: Int,
    val username: String,
    val profileName: String,
    val userIconUrl: String,
    val userBkgUrl: String,
    val createDate: String,
    val profileInfo: String?,
)

data class ProfileDetailResponse(
    val userId: Int,
    val username: String,
    val profileName: String,
    val userIconUrl: String,
    val userBkgUrl: String,
    val createDate: String,
    val profileInfo: String?,
    val isSelf: Boolean,
    val isFollowed: Boolean?,
    val isBlocked: Boolean?,
)

data class LikeResponse(
    val isLike: Boolean // if not liked -> like, then this is set to true
)

data class FollowResponse(
    val isFollowed: Boolean?
)

data class BlockResponse(
    val isBlocked: Boolean?
)

data class NotificationResponse(
    val type: String,
    val createDate: String,
    val tweetId: Int?, // for notification related to tweet sent by user
    val tweetBrief: String?,
    val likeUserId: Int?, // for if some user replied to
    val likeUserInfo: String?,
    val followUserId: Int?, // if some user followed
    val followUserInfo: String?,
    val replyTweetId: Int?, // if some user replied using replyTweetId
    val replyTweetBrief: String?,
)