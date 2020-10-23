package com.kidgeneration.school.kg.module.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.kidgeneration.school.kg.activities.adapter.ViewHolderActivities
import com.kidgeneration.school.kg.alert.adapter.ViewHolderAlert
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.base.view.BaseViewHolder
import com.kidgeneration.school.kg.databinding.ViewActivitiesBinding
import com.kidgeneration.school.kg.databinding.ViewAlertBinding
import com.kidgeneration.school.kg.databinding.ViewModuleBinding
import com.kidgeneration.school.kg.databinding.ViewModuleParentBinding
import com.kidgeneration.school.kg.module.model.Data
import com.kidgeneration.school.kg.module.model.ModuleType
import com.kidgeneration.school.kg.module.model.Role
import javax.inject.Inject

class AdapterModule @Inject internal constructor() : RecyclerView.Adapter<BaseViewHolder>() {
    private lateinit var baseFragment: BaseFragment

    private var collection: Data = Data(
        role = Role.Default,
        type = ModuleType.Module,
        collection = emptyList()
    )

    fun setData(
        baseFragment: BaseFragment,
        data: Data
    ) {
        this.baseFragment = baseFragment
        this.collection = collection
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            ModuleType.Activities.ordinal -> {
                val binding = ViewActivitiesBinding.inflate(inflater, parent, false)
                ViewHolderActivities(
                    baseFragment = baseFragment,
                    view = binding.root,
                    binding = binding
                )
            }
            ModuleType.Alert.ordinal -> {
                val binding = ViewAlertBinding.inflate(inflater, parent, false)
                ViewHolderAlert(
                    baseFragment = baseFragment,
                    view = binding.root,
                    binding = binding
                )
            }
            else -> {
                if (collection.role == Role.Parent) {
                    val binding = ViewModuleParentBinding.inflate(inflater, parent, false)
                    ViewHolderModuleParent(
                        baseFragment = baseFragment,
                        view = binding.root,
                        binding = binding
                    )
                } else {
                    val binding = ViewModuleBinding.inflate(inflater, parent, false)
                    ViewHolderModule(
                        baseFragment = baseFragment,
                        view = binding.root,
                        binding = binding
                    )
                }
            }
        }
    }

    private fun getItemView(parent: ViewGroup, @LayoutRes resource: Int): View {
        return LayoutInflater.from(parent.context).inflate(
            resource,
            parent,
            false
        )
    }

    override fun getItemCount() = collection.collection.size

    override fun getItemViewType(position: Int) = collection.type.ordinal

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bind(collection.collection[position])
    }
}