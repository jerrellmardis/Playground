package com.jerrellmardis.playground.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.jerrellmardis.playground.R;
import com.jerrellmardis.playground.presenter.NameViewPresenter;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class NameView extends BaseView {

    @InjectView(android.R.id.text1)  TextView mNameTextView;
    @InjectView(R.id.progress_container) View mProgressBar;

    public NameView(final Context context) {
        this(context, null);
    }

    public NameView(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NameView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void initView() {
        View view = inflate(getContext(), R.layout.name_view, this);
        ButterKnife.inject(this, view);
    }

    @Override
    protected void onViewInitialized() {
        NameViewPresenter presenter = new NameViewPresenter();
        presenter.setView(this);
    }

    public void setName(String name) {
        mProgressBar.setVisibility(View.GONE);
        mNameTextView.setText(name);
    }
}