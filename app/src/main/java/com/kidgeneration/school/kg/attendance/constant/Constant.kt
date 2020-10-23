package com.kidgeneration.school.kg.attendance.constant

import android.util.SparseArray
import android.util.SparseIntArray
import com.kidgeneration.school.kg.R

class Constant {
    companion object {
        const val ATTENDANCE_PRESENT_ID: Int = 1
        const val ATTENDANCE_PRESENT: String = "Present"

        const val ATTENDANCE_ABSENT_ID: Int = 2
        const val ATTENDANCE_ABSENT: String = "Absent"

        const val ATTENDANCE_HALF_DAY_ID: Int = 3
        const val ATTENDANCE_HALF_DAY: String = "Half Day"

        const val ATTENDANCE_HOLIDAY_ID: Int = 4
        const val ATTENDANCE_HOLIDAY: String = "Holiday"

        const val ATTENDANCE_LEAVE_ID: Int = 5
        const val ATTENDANCE_LEAVE: String = "Leave"

        val attendanceId = HashMap<String, Int>()
        val attendance = SparseArray<String>()
        val background = SparseIntArray()
        val status = SparseIntArray()
        val color = SparseIntArray()

        init {
            this.attendanceId[ATTENDANCE_PRESENT] = ATTENDANCE_PRESENT_ID
            this.attendanceId[ATTENDANCE_ABSENT] = ATTENDANCE_ABSENT_ID
            this.attendanceId[ATTENDANCE_HALF_DAY] = ATTENDANCE_HALF_DAY_ID
            this.attendanceId[ATTENDANCE_HOLIDAY] = ATTENDANCE_HOLIDAY_ID
            this.attendanceId[ATTENDANCE_LEAVE] = ATTENDANCE_LEAVE_ID

            this.attendance.put(ATTENDANCE_PRESENT_ID, ATTENDANCE_PRESENT)
            this.attendance.put(ATTENDANCE_ABSENT_ID, ATTENDANCE_ABSENT)
            this.attendance.put(ATTENDANCE_HALF_DAY_ID, ATTENDANCE_HALF_DAY)
            this.attendance.put(ATTENDANCE_HOLIDAY_ID, ATTENDANCE_HOLIDAY)
            this.attendance.put(ATTENDANCE_LEAVE_ID, ATTENDANCE_LEAVE)

            this.background.put(ATTENDANCE_PRESENT_ID, R.drawable.style_attendance_present)
            this.background.put(ATTENDANCE_ABSENT_ID, R.drawable.style_attendance_absent)
            this.background.put(ATTENDANCE_HALF_DAY_ID, R.drawable.style_attendance_half_day)
            this.background.put(ATTENDANCE_HOLIDAY_ID, R.drawable.style_attendance_holiday)
            this.background.put(ATTENDANCE_LEAVE_ID, R.drawable.style_attendance_leave)

            this.status.put(ATTENDANCE_PRESENT_ID, R.drawable.style_attendance_present_status)
            this.status.put(ATTENDANCE_ABSENT_ID, R.drawable.style_attendance_absent_status)
            this.status.put(ATTENDANCE_HALF_DAY_ID, R.drawable.style_attendance_half_day_status)
            this.status.put(ATTENDANCE_HOLIDAY_ID, R.drawable.style_attendance_holiday_status)
            this.status.put(ATTENDANCE_LEAVE_ID, R.drawable.style_attendance_leave_status)

            this.color.put(ATTENDANCE_PRESENT_ID, R.color.attendanceStatusPresentDark)
            this.color.put(ATTENDANCE_ABSENT_ID, R.color.attendanceStatusAbsentDark)
            this.color.put(ATTENDANCE_HALF_DAY_ID, R.color.attendanceStatusHalfDayDark)
            this.color.put(ATTENDANCE_HOLIDAY_ID, R.color.attendanceStatusHolidayDark)
            this.color.put(ATTENDANCE_LEAVE_ID, R.color.attendanceStatusLeaveDark)
        }
    }
}