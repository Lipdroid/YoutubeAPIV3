package app.com.youtubeapiv3.api

import app.com.youtubeapiv3.models.YoutubeApiResponse
import app.com.youtubeapiv3.models.YoutubePlaylistResponse
import app.com.youtubeapiv3.utils.CHANNEL_ID
import app.com.youtubeapiv3.utils.GOOGLE_YOUTUBE_API_KEY
import app.com.youtubeapiv3.utils.PLAYLIST_ID
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeApi {

    @GET("youtube/v3/search")
    suspend fun getChannelVideos(
        @Query("part") part: String = "snippet",
        @Query("order") order: String = "date",
        @Query("channelId") channelId: String = CHANNEL_ID,
        @Query("maxResults") maxResults: Int = 20,
        @Query("key") key: String = GOOGLE_YOUTUBE_API_KEY
        ): Response<YoutubeApiResponse>

    @GET("youtube/v3/playlistItems")
    suspend fun getPlaylistVideos(
        @Query("part") part: String = "snippet",
        @Query("playlistId") playlistId: String = PLAYLIST_ID,
        @Query("maxResults") maxResults: Int = 20,
        @Query("key") key: String = GOOGLE_YOUTUBE_API_KEY
    ): Response<YoutubePlaylistResponse>

    @GET("youtube/v3/search")
    suspend fun getLiveVideos(
        @Query("part") part: String = "snippet",
        @Query("type") type: String = "video",
        @Query("channelId") channelId: String = CHANNEL_ID,
        @Query("eventType") eventType: String = "live",
        @Query("maxResults") maxResults: Int = 20,
        @Query("key") key: String = GOOGLE_YOUTUBE_API_KEY
    ): Response<YoutubeApiResponse>

}