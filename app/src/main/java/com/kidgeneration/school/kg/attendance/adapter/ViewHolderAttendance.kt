package com.kidgeneration.school.kg.attendance.adapter

import android.view.View
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.attendance.model.Attendance
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.base.view.BaseViewHolder
import com.kidgeneration.school.kg.databinding.ViewAttendanceBinding

class ViewHolderAttendance(
    private val baseFragment: BaseFragment,
    private val view: View,
    private val binding: ViewAttendanceBinding
) : BaseViewHolder(baseFragment, view) {

    override fun bind(document: Any) {
        document as Attendance
        binding.attendance = document
    }

    fun layoutResourceId() = R.layout.view_activities
}