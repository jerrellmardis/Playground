package com.jerrellmardis.playground.presenter;

import com.jerrellmardis.playground.interfaces.Presenter;
import com.jerrellmardis.playground.widget.NameView;

/**
 * Created by Jerrell Mardis on 3/21/15.
 */
public class NameViewPresenter implements Presenter<NameView> {

    private NameView mView;

    @Override
    public void setView(NameView view) {
        mView = view;
        load();
    }

    private void load() {
        // the delay is deliberate to illustrate retrieving data from a WebService.
        // this is where you would want to grab any data from a Webservice and set values on the View.
        mView.postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.setName("Timmy Tester");
            }
        }, 5000);
    }
}
