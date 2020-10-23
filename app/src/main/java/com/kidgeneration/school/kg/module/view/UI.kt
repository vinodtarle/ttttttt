package com.kidgeneration.school.kg.module.view

import android.util.SparseArray
import com.kidgeneration.school.kg.module.constant.Constant

class UI {
    companion object {
        fun background(moduleNumber: Int): Int {
            return Constant.moduleBackground[moduleNumber]
        }

        fun selectedBackground(moduleNumber: Int): Int {
            return Constant.moduleSelected[moduleNumber]
        }

        fun icon(moduleNumber: Int): Int {
            return Constant.moduleIcon[moduleNumber]
        }

        fun iconColor(moduleNumber: Int): Int {
            return Constant.moduleIconColor[moduleNumber]
        }

        fun moduleName(moduleNumber: Int): String {
            return Constant.modules[moduleNumber]
        }

        fun modules(): SparseArray<String> {
            return Constant.modules
        }
    }
}