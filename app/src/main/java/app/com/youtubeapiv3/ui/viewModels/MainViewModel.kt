package app.com.youtubeapiv3.ui.viewModels

import YoutubeDataModel
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.com.youtubeapiv3.api.RetrofitInstance
import app.com.youtubeapiv3.models.YoutubePlayistModel
import app.com.youtubeapiv3.utils.Coroutines

class MainViewModel: ViewModel() {
    var channelVideoList: MutableLiveData<List<YoutubeDataModel>> = MutableLiveData<List<YoutubeDataModel>>()
    var liveVideoList: MutableLiveData<List<YoutubeDataModel>> = MutableLiveData<List<YoutubeDataModel>>()
    var playlistVideoList: MutableLiveData<List<YoutubePlayistModel>> = MutableLiveData<List<YoutubePlayistModel>>()

    fun getChannelVideoList()= Coroutines.main {
        val response = RetrofitInstance.api.getChannelVideos()
        Log.e("response",response.toString())
        if(response.isSuccessful){
            Log.e("success",response.toString())
            channelVideoList.postValue(response.body()?.items)
        }else{
            Log.e("error","${response.code().toString()} ${response.message()}")
        }
    }

    fun getLiveVideoList()= Coroutines.main {
        val response = RetrofitInstance.api.getLiveVideos()
        Log.e("response",response.toString())
        if(response.isSuccessful){
            Log.e("success",response.toString())
            liveVideoList.postValue(response.body()?.items)
        }else{
            Log.e("error","${response.code().toString()} ${response.message()}")
        }
    }

    fun getPlaylistVideoList()= Coroutines.main {
        val response = RetrofitInstance.api.getPlaylistVideos()
        Log.e("response",response.toString())
        if(response.isSuccessful){
            Log.e("success",response.toString())
            playlistVideoList.postValue(response.body()?.items)
        }else{
            Log.e("error","${response.code().toString()} ${response.message()}")
        }
    }
}