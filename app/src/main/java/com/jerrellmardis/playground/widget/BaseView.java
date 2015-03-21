package com.jerrellmardis.playground.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

abstract class BaseView extends FrameLayout {

    public BaseView(final Context context) {
        this(context, null);
    }

    public BaseView(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        removeAllViews();
        initView();
        onViewInitialized();
    }

    protected abstract void initView();

    protected abstract void onViewInitialized();
}