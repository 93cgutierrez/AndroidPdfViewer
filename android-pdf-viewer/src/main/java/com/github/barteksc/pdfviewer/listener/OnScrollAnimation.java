package com.github.barteksc.pdfviewer.listener;

import android.animation.Animator;

public interface OnScrollAnimation {

    /**
     * Called when the user has a scroll gesture, before processing scroll handle toggling
     *
     * @param animation the animation that will be started
     * @param scrollMoveDirection the direction of the scroll NONE = 0, HORIZONTAL = 1, VERTICAL = 2
     * @return true if the single tap was handled, false to toggle scroll handle
     */
    boolean onScrollAnimation(Animator animation, int scrollMoveDirection);
}
