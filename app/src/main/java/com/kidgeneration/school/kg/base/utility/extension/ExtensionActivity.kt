package com.kidgeneration.school.kg.base.utility.extension

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.compose.runtime.Composable
import androidx.compose.ui.semantics.SemanticsProperties.Text

import androidx.compose.foundation.Text
import androidx.compose.ui.platform.setContent

fun Activity.hideKeyboard() {
    currentFocus?.let { focus ->
        val manager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        manager.hideSoftInputFromWindow(focus.windowToken, 0)
    }
}

@Composable
fun Activity.UIText(value: String) {
    Text(value)
}