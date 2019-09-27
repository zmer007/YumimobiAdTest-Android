package com.yumimobi.sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Description:
 *
 * Created by lgd on 2019-09-27.
 */
class DeepLinksSample : AppCompatActivity() {

    private lateinit var deepLinkInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deep_links)

        deepLinkInfo = findViewById(R.id.deepLinkInfo)

        deepLinkInfo.text = "got these data: \n\"${intent?.data}\""

    }
}