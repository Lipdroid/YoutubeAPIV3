package app.com.youtubeapiv3.models

class YoutubePlaylistResponse(
    val items: List<YoutubePlayistModel>,
)
data class YoutubePlayistModel(
    val etag: String,
    val id: String,
    val kind: String,
    val snippet: Snippet
)

data class Snippet(
    val channelId: String,
    val channelTitle: String,
    val description: String,
    val liveBroadcastContent: String,
    val publishTime: String,
    val publishedAt: String,
    val thumbnails: Thumbnails,
    val title: String
)

data class Default(
    val height: Int,
    val url: String,
    val width: Int
)

data class High(
    val height: Int,
    val url: String,
    val width: Int
)
data class Medium(
    val height: Int,
    val url: String,
    val width: Int
)

data class Thumbnails(
    val default: Default,
    val high: High,
    val medium: Medium
)