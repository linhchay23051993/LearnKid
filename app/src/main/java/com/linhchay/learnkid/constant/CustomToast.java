package com.linhchay.learnkid.constant;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.linhchay.learnkid.R;

public class CustomToast extends Toast {
    public static int LONG = 5000;
    public static int SHORT = 3000;

    public CustomToast(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, boolean check, int duration) {
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_custom, null, false);

        TextView contentText = layout.findViewById(R.id.content_text);
        ImageView contentImage = layout.findViewById(R.id.content_img);
        if (check) {
            contentText.setText("Oh Yeah");
            contentImage.setImageResource(R.mipmap.practice_correct);
        } else {
            contentText.setText("Oh No");
            contentImage.setImageResource(R.mipmap.practice_incorrect);
        }
        toast.setView(layout);
        toast.setDuration(duration);
        toast.setGravity(Gravity.NO_GRAVITY, 0, 0);
        return toast;
    }
}
