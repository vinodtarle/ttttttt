package com.kidgeneration.school.kg.alert.adapter

import android.view.View
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.alert.model.Alert
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.base.view.BaseViewHolder
import com.kidgeneration.school.kg.databinding.ViewAlertBinding

class ViewHolderAlert(
    private val baseFragment: BaseFragment,
    private val view: View,
    private val binding: ViewAlertBinding
) : BaseViewHolder(baseFragment, view) {

    override fun bind(document: Any) {
        document as Alert
        binding.alert = document
    }

    fun layoutResourceId() = R.layout.view_alert
}