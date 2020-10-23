package com.kidgeneration.school.kg.base.view

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.graphics.Color
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.utility.constant.Converter
import com.kidgeneration.school.kg.base.utility.extension.hideKeyboard
import java.util.*

abstract class BaseFragment(layoutResourceId: Int) : Fragment(layoutResourceId) {

    abstract fun className(): String

    val TAG = className()

    private lateinit var layoutView: View

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        super.onCreateView(inflater, container, savedInstanceState)
//        val binding = FragmentBaseBinding.inflate(layoutInflater, container, false)
//        val content = inflater.inflate(layoutResourceId, container, false)
//        binding.layoutContent.addView(content)
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        layoutView = view
//    }

    open fun init() {}

    open fun initListener() {}

    open fun initObserver() {}

    open fun initNavigation() {}

    open fun initRecyclerView() {}

    fun getAppName(): String = getString(R.string.app_name)

    fun hideKeyboard() = activity?.hideKeyboard()

    fun showProgressBar() {
        //layoutView.layoutProgressBar.visibility = View.VISIBLE
    }

    fun hideProgressBar() {
        //layoutView.layoutProgressBar.visibility = View.VISIBLE
    }

    fun showFullScreenError() {}

    fun datePickerDialog(onClick: (date: String) -> Unit = {}) {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(requireContext(), { _, cYear, cMonth, cDay ->
                onClick.invoke(Converter.toDMY(cDay, (cMonth + 1), cYear))
            }, year, month, day
        ).run { show() }
    }

    fun timePickerDialog(onClick: (time: String) -> Unit = {}) {
        val calendar = Calendar.getInstance()
        val mHour = calendar.get(Calendar.HOUR_OF_DAY)
        val mMinute = calendar.get(Calendar.MINUTE)
        TimePickerDialog(requireContext(), { _, hourOfDay, minute ->
                onClick.invoke(Converter.toHM(hourOfDay, minute))
            }, mHour, mMinute, true
        ).run { show() }
    }

    fun showSuccessAdd() {
        val snackbar = Snackbar.make(requireView(), R.string.successAdd, Snackbar.LENGTH_LONG)
        val view = snackbar.view
        val textView = view.findViewById<TextView>(R.id.snackbar_text)
        textView.setTextColor(Color.WHITE)
        snackbar.show()
    }

    fun showErrorAdd() {
        val snackbar = Snackbar.make(requireView(), R.string.errorAdd, Snackbar.LENGTH_LONG)
        val view = snackbar.view
        val textView = view.findViewById<TextView>(R.id.snackbar_text)
        textView.setTextColor(Color.WHITE)
        snackbar.show()
    }
}