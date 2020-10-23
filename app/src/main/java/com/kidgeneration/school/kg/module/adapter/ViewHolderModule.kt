package com.kidgeneration.school.kg.module.adapter

import android.view.View
import androidx.core.content.ContextCompat
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.base.view.BaseViewHolder
import com.kidgeneration.school.kg.dashboard.parent.view.FragmentParent
import com.kidgeneration.school.kg.dashboard.teacher.view.FragmentTeacher
import com.kidgeneration.school.kg.databinding.ViewModuleBinding
import com.kidgeneration.school.kg.module.model.Module
import com.kidgeneration.school.kg.module.view.UI
import kotlinx.android.synthetic.main.view_module.view.*

class ViewHolderModule(
    private val baseFragment: BaseFragment,
    private val view: View,
    private val binding: ViewModuleBinding
) : BaseViewHolder(baseFragment, view) {

    override fun bind(document: Any) {
        document as Module
        binding.module = document

        view.layoutModule.setBackgroundResource(
            UI.background(
                moduleNumber = document.moduleNumber
            )
        )
        view.moduleIcon.setImageResource(
            UI.icon(
                moduleNumber = document.moduleNumber
            )
        )
        view.moduleIcon.setColorFilter(
            ContextCompat.getColor(
                view.context,
                UI.iconColor(
                    moduleNumber = document.moduleNumber
                )
            )
        )
        view.layoutMain.setOnClickListener {
            when (baseFragment) {
                is FragmentTeacher -> {
                    baseFragment.navigate(document = document)
                }
                is FragmentParent -> {
                    baseFragment.navigate(document = document)
                }
            }
        }
    }

    fun layoutResourceId() = R.layout.view_module_parent
}