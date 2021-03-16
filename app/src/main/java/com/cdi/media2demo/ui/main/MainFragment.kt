package com.cdi.media2demo.ui.main

import android.media.browse.MediaBrowser
import android.net.Uri
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cdi.media2demo.R
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.StyledPlayerView
import kotlinx.coroutines.launch

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel


    private lateinit var videoView: StyledPlayerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)

        videoView = view.findViewById(R.id.video_view)

        setupVideo()

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }


    private fun setupVideo() {

        val player = SimpleExoPlayer.Builder(requireContext()).build()

        videoView.setPlayer(player)

            val videoUrl = "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8"
            player.setMediaItem(com.google.android.exoplayer2.MediaItem.fromUri(videoUrl))
            player.prepare()
            player.play()
    }

}