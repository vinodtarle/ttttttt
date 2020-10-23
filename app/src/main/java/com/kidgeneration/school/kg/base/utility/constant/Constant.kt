package com.kidgeneration.school.kg.base.utility.constant

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import java.util.*

class Constant {
    companion object {
        const val BLANK = ""
        const val SPACE = " "
        const val UNDERSCORE = "_"
        const val FIELD_SEPARATOR = "."
        const val COLOR_RANGE = "400"

        const val SEPARATOR_DATE = "/"
        const val SEPARATOR_TIME = ":"

        const val FORMAT_EEEE_DD_MMM_YYYY = "EEEE dd MMM yyyy"
        const val FORMAT_DD_MMMM_YYYY = "dd MMMM yyyy"
        const val FORMAT_DD_MMM_YYYY = "dd MMM yyyy"

        const val FORMAT_DATE_DMY = "dd/MM/yyyy"
        const val FORMAT_DATE_MDY = "MM${SEPARATOR_DATE}dd${SEPARATOR_DATE}yyyy"
        const val FORMAT_DATE_YMD = "yyyy${SEPARATOR_DATE}MM${SEPARATOR_DATE}dd"
        const val FORMAT_DATE_TIME =
            "yyyy${SEPARATOR_DATE}MM${SEPARATOR_DATE}dd HH${SEPARATOR_TIME}mm${SEPARATOR_TIME}ss"
        const val FORMAT_TIME = "HH${SEPARATOR_TIME}mm"
        const val FORMAT_TIME_FULL = "HH${SEPARATOR_TIME}mm${SEPARATOR_TIME}ss"

        fun hideKeyboard(activity: Activity) {
            if (activity.currentFocus != null) {
                val manager =
                    activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                manager.hideSoftInputFromWindow(activity.currentFocus!!.windowToken, 0)
            }
        }

        fun getCurrentDate(): String {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            return day.toString() + "-" + (month + 1) + "-" + year
        }
    }
}