## ExoPlayer Inline Demo

This repo creates a simple Exoplayer instance that plays a video "inline" above some other content on the screen.
It demos a "problem" (or at least something I can't figure out how to setup correctly) in which displaying the
video controls causes the video to take over the entire screen, covering up the content below.

This "problem" manifests itself in 2 ways:

1. When the app first launches, the video takes over the entire screen. It starts playing and shows the
controls. After a few seconds, the controls go away, but the video continues to fill the screen. Then
after a few more seconds, the video "snaps" into place above the other screen content.
2. If you then click on the video to display the controls, it again takes over the entire screen,
covering up the other content.

the desire is for the video to ONLY take up the space it requires (hence the `layout_height=wrap_content` in defining the video view),
and not cover up the other screen content, even when displaying controls.

A video showing the problem:

<img src="screenshots/demo.gif" width="400" />



