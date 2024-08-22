
// BookAdapter.kt
package com.bookmoa.android.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bookmoa.android.databinding.ItemBookListBinding
import com.bookmoa.android.models.SearchBook
import com.bumptech.glide.Glide


class SearchBookAdapter(private val itemClickedListener: (SearchBook) -> Unit) :
    ListAdapter<SearchBook, SearchBookAdapter.BookItemViewHolder>(BookDiffCallback()) {

    inner class BookItemViewHolder(private val binding: ItemBookListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(bookModel: SearchBook) {
            binding.itemBookListTitleTv.text = bookModel.title
            binding.itemBookListAuthorTv.text = bookModel.author

            // 이미지 로드
            Glide.with(binding.itemBookListCoverIv.context)
                .load(bookModel.coverSmallUrl)
                .into(binding.itemBookListCoverIv)

            // 아이템 클릭 리스너 설정
            binding.root.setOnClickListener {
                itemClickedListener(bookModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookItemViewHolder {
        val binding = ItemBookListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BookItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    // DiffUtil을 위한 콜백
    class BookDiffCallback : DiffUtil.ItemCallback<SearchBook>() {
        override fun areItemsTheSame(oldItem: SearchBook, newItem: SearchBook): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: SearchBook, newItem: SearchBook): Boolean {
            return oldItem == newItem
        }
    }
}