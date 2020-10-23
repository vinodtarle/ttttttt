package com.kidgeneration.school.kg.base.view

import android.content.Intent
import android.os.Bundle
import com.kidgeneration.school.kg.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
@ExperimentalCoroutinesApi
class ActivitySplash : BaseActivity(layoutResourceId = R.layout.activity_splash) {
    override fun className(): String = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        finishSplash()
    }

    private fun init() {
        supportActionBar?.hide()
    }

    private fun finishSplash() {
        CoroutineScope(Main).launch {
            delay(3000)
            startActivity(
                Intent(
                    this@ActivitySplash,
                    ActivityMain::class.java
                )
            )
            this@ActivitySplash.finish()
        }
    }
}
