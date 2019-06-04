package com.bortnikov.artem.futureworldwarbattleroyal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_menu.*

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        initUI()
    }

    private fun initUI() {
        NewGameButton
            .setOnClickListener {
                val intent = Intent(this, GameActivity::class.java)
                startActivity(intent)
            }
        SettingsButton
            .setOnClickListener {
                Toast.makeText(this, "Open settings", Toast.LENGTH_LONG).show()
                TODO("add settings")
            }
        ShopButton
            .setOnClickListener {
                Toast.makeText(this, "Open game shop", Toast.LENGTH_LONG).show()
                TODO("add the most urgent game part")
            }
    }

}
