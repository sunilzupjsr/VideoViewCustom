package com.eagle.offline.music.player.videoviewcustom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ui.PlayerView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerView: PlayerView = findViewById(R.id.playerView)

        MediaPlayer.initialize(applicationContext)
        MediaPlayer.exoPlayer?.preparePlayer(playerView, true)
        MediaPlayer.exoPlayer?.setSource(applicationContext,"android.resource://" + getPackageName() + "/" + R.raw.telugu)
        MediaPlayer.startPlayer()

    }

    public override fun onPause() {
        super.onPause()
        MediaPlayer.pausePlayer()
    }

    public override fun onDestroy() {
        MediaPlayer.stopPlayer()
        super.onDestroy()
    }
}