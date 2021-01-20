package com.tss.webuilddemo

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bbbb.*

class BbbbbbActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bbbb)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_back.setOnClickListener {
            startActivity(Intent(this@BbbbbbActivity, BbbbActivity::class.java))
            this@BbbbbbActivity.finish()
        }
        btn_next.setOnClickListener {
            startActivity(Intent(this@BbbbbbActivity, BbbbbActivity::class.java))
            this@BbbbbbActivity.finish()
        }
    }
}