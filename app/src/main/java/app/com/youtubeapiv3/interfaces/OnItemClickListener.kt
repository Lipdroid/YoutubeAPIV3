package app.com.youtubeapiv3.interfaces

import YoutubeDataModel
import app.com.youtubeapiv3.models.YoutubePlayistModel

/**
 * Created by mdmunirhossain on 12/19/17.
 */
interface OnItemClickListener {
    fun onItemClick(item: YoutubeDataModel?)
}

interface OnPlaylistItemClickListener {
    fun onItemClick(item: YoutubePlayistModel?)
}