package com.example.applocalize

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JewelryCategoryAdapter(private var categories: List<String>) :
    RecyclerView.Adapter<JewelryCategoryAdapter.CategoryViewHolder>() {

    private var fullCategoryList = categories.toList() // Keep a copy of the original list

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(android.R.id.text1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.textView.text = categories[position]
    }

    override fun getItemCount(): Int = categories.size

    fun filter(query: String?) {
        categories = if (query.isNullOrEmpty()) {
            fullCategoryList // Return the full list if query is empty
        } else {
            fullCategoryList.filter { it.contains(query, ignoreCase = true) }
        }
        notifyDataSetChanged()
    }
}
