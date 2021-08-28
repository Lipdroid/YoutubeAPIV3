package app.com.youtubeapiv3.models

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by mdmunirhossain on 12/18/17.
 */
@Parcelize
class YoutubeDataModel(
    var title: String? = "",
    var description: String? = "",
    var publishedAt: String? = "",
    var thumbnail: String? = "",
    var video_id: String? = ""
) : Parcelable