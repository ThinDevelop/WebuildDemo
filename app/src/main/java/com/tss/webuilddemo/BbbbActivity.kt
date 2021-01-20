package com.tss.webuilddemo

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bbbb.*

class BbbbActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bbb)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_next.setOnClickListener {
            startActivity(Intent(this@BbbbActivity, BbbbbbActivity::class.java))
            this@BbbbActivity.finish()
        }
        btn_back.setOnClickListener {
            startActivity(Intent(this@BbbbActivity, BbbActivity::class.java))
            this@BbbbActivity.finish()
        }
    }
}