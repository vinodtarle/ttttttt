package com.kidgeneration.school.kg.certificate.adapter

import android.view.View
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.view.BaseFragment
import com.kidgeneration.school.kg.base.view.BaseViewHolder
import com.kidgeneration.school.kg.certificate.model.Certificate
import com.kidgeneration.school.kg.databinding.ViewCertificateBinding

class ViewHolderCertificate(
    private val baseFragment: BaseFragment,
    private val view: View,
    private val binding: ViewCertificateBinding
) : BaseViewHolder(baseFragment, view) {

    override fun bind(document: Any) {
        document as Certificate
        binding.certificate = document
    }

    fun layoutResourceId() = R.layout.view_certificate
}