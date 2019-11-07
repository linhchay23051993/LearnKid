
package com.linhchay.learnkid.listener;

import android.view.View;
import android.view.View.OnClickListener;

public class SingleTapListenerImpl implements OnClickListener {

    private static final int THRESHOLD = 300;

    private long timestamp = 0;

    private OnClickListener singleTapListener;


    public SingleTapListenerImpl(OnClickListener listener) {
        this.singleTapListener = listener;
    }

    private boolean isOverThreashold(long now) {
        return now - timestamp > THRESHOLD;
    }

    @Override
    public void onClick(View v) {
        long now = System.currentTimeMillis();
        if (isOverThreashold(now)) {
            this.singleTapListener.onClick(v);
        }
        this.timestamp = now;
    }

}
