package com.kidgeneration.school.kg.activities.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.viewModels
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.activities.model.Activities
import com.kidgeneration.school.kg.activities.viewmodel.ViewModelActivities
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.databinding.FragmentActivitiesDetailsBinding
import com.kidgeneration.school.kg.module.model.Module
import com.kidgeneration.school.kg.module.view.UI
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentActivitiesDetails : BaseFragment(layoutResourceId = R.layout.fragment_activities_details) {

    override fun className(): String = this.javaClass.simpleName

    private val viewModel: ViewModelActivities by viewModels()

    private lateinit var binding: FragmentActivitiesDetailsBinding
    private lateinit var activities: Activities
    private lateinit var module: Module

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = FragmentActivitiesDetailsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            activities = it.getSerializable(getString(R.string.keyActivities)) as Activities
            module = it.getSerializable(getString(R.string.keyModule)) as Module
        }

        this.binding.layoutModule.setBackgroundResource(UI.selectedBackground(this.module.moduleNumber))
        this.binding.moduleIcon.setImageResource(UI.icon(this.module.moduleNumber))

        this.binding.moduleIcon.setColorFilter(
            ContextCompat.getColor(requireContext(), R.color.moduleIcon)
        )
        this.binding.activities = this.activities
    }
}
