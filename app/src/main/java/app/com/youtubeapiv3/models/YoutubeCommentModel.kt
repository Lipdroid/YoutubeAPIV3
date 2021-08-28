package app.com.youtubeapiv3.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**
 * Created by mdmunirhossain on 1/4/18.
 */
@Parcelize
data class YoutubeCommentModel(
    var title: String? = "",
    var comment: String? = "",
    var publishedAt: String? = "",
    var thumbnail: String? = "",
    var video_id: String? = ""
) : Parcelable