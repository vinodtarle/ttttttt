package com.kidgeneration.school.kg.attendance.view

import com.kidgeneration.school.kg.attendance.constant.Constant

class UI {
    var update: Boolean = false

    companion object {
        fun attendanceId(index: String): Int? {
            return Constant.attendanceId[index]
        }

        fun background(index: Int): Int {
            return Constant.background[index]
        }

        fun status(index: Int): Int {
            return Constant.status[index]
        }

        fun color(index: Int): Int {
            return Constant.color[index]
        }
    }
}
