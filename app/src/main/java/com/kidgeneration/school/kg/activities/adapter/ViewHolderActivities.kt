package com.kidgeneration.school.kg.activities.adapter

import android.view.View
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.activities.model.Activities
import com.kidgeneration.school.kg.base.utility.constant.Constant
import com.kidgeneration.school.kg.base.utility.constant.RandomColor
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.base.view.BaseViewHolder
import com.kidgeneration.school.kg.databinding.ViewActivitiesBinding

class ViewHolderActivities(
    private val baseFragment: BaseFragment,
    private val view: View,
    private val binding: ViewActivitiesBinding
) : BaseViewHolder(baseFragment, view) {

    override fun bind(document: Any) {
        document as Activities
        binding.activities = document

        binding.divider.setBackgroundColor(
            RandomColor.getColor(view.context, Constant.COLOR_RANGE)
        )
    }

    fun layoutResourceId() = R.layout.view_activities
}