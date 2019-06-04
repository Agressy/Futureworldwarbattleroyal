package com.bortnikov.artem.futureworldwarbattleroyal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        initUI()
    }

    private fun initUI() {
        GreenButton.setOnClickListener {
            GreenButton.visibility = View.INVISIBLE
            GameTextView.visibility = View.VISIBLE
            ShareButton.visibility = View.VISIBLE
        }

        ShareButton.setOnClickListener {
            val shareRecordIntent = Intent(Intent.ACTION_SEND)
            shareRecordIntent.type = "text/plain"
            shareRecordIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.share_pattern))
            startActivity(Intent.createChooser(shareRecordIntent, getString(R.string.share_via)))
        }
    }
}
