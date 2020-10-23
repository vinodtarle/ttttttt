package com.kidgeneration.school.kg.alert.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.alert.model.Alert
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.databinding.FragmentAlertDetailsBinding
import com.kidgeneration.school.kg.module.model.Module
import com.kidgeneration.school.kg.module.view.UI
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentAlertDetails : BaseFragment(layoutResourceId = R.layout.fragment_activities_details) {

    override fun className(): String = this.javaClass.simpleName

    private lateinit var binding: FragmentAlertDetailsBinding
    private lateinit var alert: Alert
    private lateinit var module: Module

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding = FragmentAlertDetailsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            alert = it.getSerializable(getString(R.string.keyAlert)) as Alert
            module = it.getSerializable(getString(R.string.keyModule)) as Module
        }

        this.binding.layoutModule.setBackgroundResource(UI.selectedBackground(this.module.moduleNumber))
        this.binding.moduleIcon.setImageResource(UI.icon(this.module.moduleNumber))

        this.binding.moduleIcon.setColorFilter(
            ContextCompat.getColor(requireContext(), R.color.moduleIcon)
        )
        this.binding.alert = this.alert
    }
}

