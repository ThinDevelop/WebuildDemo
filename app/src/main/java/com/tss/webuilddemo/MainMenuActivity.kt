package com.tss.webuilddemo

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        a.setOnClickListener {startActivity(Intent(this@MainMenuActivity, AaActivity::class.java))}
        b.setOnClickListener {startActivity(Intent(this@MainMenuActivity, BbActivity::class.java))}
        c.setOnClickListener {startActivity(Intent(this@MainMenuActivity, CcActivity::class.java))}
        d.setOnClickListener {  startActivity(Intent(this@MainMenuActivity, DdActivity::class.java))}
        e.setOnClickListener {  startActivity(Intent(this@MainMenuActivity, EdActivity::class.java))}
        f.setOnClickListener {  startActivity(Intent(this@MainMenuActivity, FfActivity::class.java))}
    }
}