package com.kidgeneration.school.kg.base.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.kidgeneration.school.kg.R
import com.kidgeneration.school.kg.base.utility.extension.UIText

abstract class BaseActivity(val layoutResourceId: Int) : AppCompatActivity() {
    abstract fun className(): String

    val TAG = className()

    fun getAppName(): Int = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("this is the test view for ext")
        }
    }

    @Composable
    private fun test() {
       Text("Show this UI ")
    }

}