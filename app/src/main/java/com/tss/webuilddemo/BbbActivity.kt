package com.tss.webuilddemo

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bb.*

class BbbActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bb)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_back.setOnClickListener {
            startActivity(Intent(this@BbbActivity, BbActivity::class.java))
            this@BbbActivity.finish()
        }
        btn_next.setOnClickListener {
            startActivity(Intent(this@BbbActivity, BbbbActivity::class.java))
            this@BbbActivity.finish()
        }
    }
}