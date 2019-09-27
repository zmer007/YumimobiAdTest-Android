package com.yumimobi.sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Description:
 *
 * Created by lgd on 2019-09-27.
 */
class AppLinksSample : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_links)
        val appLinkInfo = findViewById<TextView>(R.id.appLinkInfo)

        appLinkInfo.text = "got these data: \n\"${intent?.data}\""
    }

}