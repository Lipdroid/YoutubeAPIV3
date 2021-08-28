package app.com.youtubeapiv3.ui.fragments

import YoutubeDataModel
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.com.youtubeapiv3.R
import app.com.youtubeapiv3.interfaces.OnItemClickListener
import app.com.youtubeapiv3.ui.adapters.VideoAdapter
import app.com.youtubeapiv3.ui.viewModels.MainViewModel
import java.util.*


/**
 * A simple [Fragment] subclass.
 */
class ChannelFragment : Fragment(), OnItemClickListener {
    private var mList_videos: RecyclerView? = null
    private var adapter: VideoAdapter? = null
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_channel, container, false)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.getChannelVideoList()
        mList_videos = view.findViewById<View>(R.id.mList_videos) as RecyclerView
        initRecyclerView()
        viewModel.channelVideoList.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
             adapter?.videoList = it
        })
        return view
    }

    private fun initRecyclerView() = activity?.let{
        adapter = VideoAdapter(it, this)
        mList_videos?.layoutManager = LinearLayoutManager(it)
        mList_videos?.setAdapter(adapter)
    }

    override fun onItemClick(item: YoutubeDataModel?) {
    }
}