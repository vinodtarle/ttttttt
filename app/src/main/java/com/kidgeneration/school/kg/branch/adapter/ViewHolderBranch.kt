package com.kidgeneration.school.kg.branch.adapter

import android.view.View
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.base.view.BaseViewHolder
import com.kidgeneration.school.kg.branch.model.Branch
import com.kidgeneration.school.kg.databinding.ViewBranchBinding

class ViewHolderBranch(
    private val baseFragment: BaseFragment,
    private val view: View,
    private val binding: ViewBranchBinding
) : BaseViewHolder(baseFragment, view) {

    override fun bind(document: Any) {
        document as Branch
        binding.branch = document
    }

    fun layoutResourceId() = R.layout.view_branch
}