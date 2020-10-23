package com.kidgeneration.school.kg.school.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kidgeneration.school.kg.databinding.ViewSchoolBinding
import com.kidgeneration.school.kg.school.model.School
import javax.inject.Inject

class AdapterSchool @Inject internal constructor(
    private val context: Context
) : RecyclerView.Adapter<AdapterSchool.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(this.context)
    private var collection = emptyList<School>()

    inner class ViewHolder(val binding: ViewSchoolBinding) : RecyclerView.ViewHolder(binding.layoutMain)

    internal fun setData(collection: List<School>) {
        this.collection = collection
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewSchoolBinding.inflate(this.inflater, parent, false)
        return ViewHolder(binding = binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = this.collection[position]
        holder.binding.school = data

//        holder.binding.school = VMSchool(this.context, data)
//        holder.binding.layoutMain.setOnClickListener {
//            if (this.context is FragmentSchool) this.context.details()
//        }
//        holder.binding.layoutLike.setOnClickListener {
//            data.like = !data.like
//            notifyDataSetChanged()
//            if (this.context is ActivitySchool) this.context.likes(school = data)
//        }
//        holder.binding.layoutRating.setOnClickListener {
//            if (this.context is ActivitySchool) this.context.rating(school = data)
//        }
//        holder.binding.layourComments.setOnClickListener {
//            this.context.startActivity(
//                Intent(this.context, ActivityComment::class.java)
//                    .putExtra(this.context.getString(R.string.keySchool), data)
//            )
//        }
    }

    override fun getItemCount(): Int {
        return this.collection.size
    }
}