package app.com.youtubeapiv3.ui.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import app.com.youtubeapiv3.databinding.ItemCommentBinding
import app.com.youtubeapiv3.models.YoutubeCommentModel
import com.squareup.picasso.Picasso

class CommentAdapter (val context: Context): RecyclerView.Adapter<CommentAdapter.YoutubeCommentHolder>() {
    var commentList: List<YoutubeCommentModel>
        get() = differ.currentList
        set(value) { differ.submitList(value) }

    inner class YoutubeCommentHolder(val binding: ItemCommentBinding): RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<YoutubeCommentModel>() {
        override fun areItemsTheSame(oldItem: YoutubeCommentModel, newItem: YoutubeCommentModel): Boolean {
            return oldItem.video_id == newItem.video_id
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: YoutubeCommentModel, newItem: YoutubeCommentModel): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, diffCallback)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeCommentHolder {
        return YoutubeCommentHolder(
            ItemCommentBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: YoutubeCommentHolder, position: Int) {
        holder.binding.apply {
            val comment = commentList[position]
            textViewName.setText(comment.title)
            feedback.setText(comment.comment)
            comment.thumbnail?.let {
                if(it.startsWith("http")){
                    Picasso.with(context)
                        .load(comment.thumbnail)
                        .into(profileImage)
                }
            }
        }
    }

    override fun getItemCount() = commentList.size
}