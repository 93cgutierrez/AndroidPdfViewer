package com.github.barteksc.pdfviewer.listener;

import android.animation.Animator;

public interface OnDoubleTapListener {

        /**
        * Called when the user has a tap gesture, before processing scroll handle toggling
        *
        * @param animation the animation that will be started
        * @param oldZoom the old zoom level
        * @param newZoom the new zoom level
        * @return true if the single tap was handled, false to toggle scroll handle
        */
        boolean onDoubleTap(Animator animation, float oldZoom, float newZoom);
}
