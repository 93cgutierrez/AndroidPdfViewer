package com.github.barteksc.pdfviewer.listener;

import android.animation.Animator;

public interface OnPinchZoomListener {

    /**
     * Called when the user has a pinch gesture, before processing scroll handle toggling
     * @param animation the animation that will be used to animate the zoom
     * @param oldZoom the old zoom level
     * @param newZoom the new zoom level
     * @return true if the single tap was handled, false to toggle scroll handle
     */
    boolean onPinchZoom(Animator animation, float oldZoom, float newZoom);

}
