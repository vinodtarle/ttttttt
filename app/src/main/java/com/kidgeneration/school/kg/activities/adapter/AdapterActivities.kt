package com.kidgeneration.school.kg.activities.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kidgeneration.school.kg.activities.model.Activities
import com.kidgeneration.school.kg.databinding.ViewActivitiesBinding
import com.kidgeneration.school.kg.module.model.Module
import javax.inject.Inject

class AdapterActivities @Inject internal constructor(
    private val context: Context
) : RecyclerView.Adapter<AdapterActivities.ViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(this.context)
    private lateinit var module: Module
    private var collection = emptyList<Activities>()

    inner class ViewHolder(binding: ViewActivitiesBinding) :
        RecyclerView.ViewHolder(binding.layoutMain)

    internal fun setData(module: Module, collection: List<Activities>) {
        this.module = module
        this.collection = collection
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewActivitiesBinding.inflate(this.inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = this.collection[position]


//        if (position != 0 && data.date != null)
//            holder.binding.header.visibility =
//                if (data.date!!.compareTo(this.data[position - 1].date) == 0)
//                    View.GONE else View.VISIBLE
//        else holder.binding.header.visibility = View.VISIBLE
//
//        holder.binding.divider.background
//            .setColorFilter(
//                RandomColor.getColor(this.context, Constant.COLOR_RANGE),
//                PorterDuff.Mode.SRC_IN
//            )
//
//        holder.binding.layoutMain.setOnClickListener {
////            this.context.startActivity(
////                Intent(this.context, ActivityDetailsActivities::class.java)
////                    .putExtra(this.context.getString(R.string.keyModule), this.module)
////                    .putExtra(this.context.getString(R.string.keyActivities), data)
////            )
//        }
//
//        holder.binding.layoutMain.setOnLongClickListener {
////            if (this.context is ActivityModuleData)
////                this.context.deleteDialog(
////                    path = Path.activities(),
////                    id = data.id
////                )
//            true
//        }
    }

    override fun getItemCount(): Int {
        return this.collection.size
    }
}