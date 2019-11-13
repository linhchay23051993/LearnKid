package com.linhchay.learnkid.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.linhchay.learnkid.R;
import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.listener.SingleTapListenerImpl;
import com.linhchay.learnkid.viewpaper.CustomViewpaperInterVIew;

import java.util.ArrayList;
import java.util.List;

public class InterviewActivity extends AppCompatActivity implements View.OnClickListener {
    TextView indicator1, indicator2, indicator3;
    Button startLearnBtn;
    private ViewPager mViewPager;
    private CustomViewpaperInterVIew mCustomViewPaper;
    private List<Integer> mListImageInterview;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreferences = getSharedPreferences(Constant.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        int interview = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_SETTING_INTERVIEW_KEY, -1);

        if (interview == -1) {
            setContentView(R.layout.interview_layout_small);
            initView();
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }


    }

    private void initView() {
        mViewPager = findViewById(R.id.viewpager_interview);

        indicator1 = findViewById(R.id.indicator_1);
        indicator2 = findViewById(R.id.indicator_2);
        indicator3 = findViewById(R.id.indicator_3);

        startLearnBtn = findViewById(R.id.start_learn_btn);
        startLearnBtn.setOnClickListener(new SingleTapListenerImpl(this));

        mListImageInterview = new ArrayList<>();
        mListImageInterview.add(R.drawable.conbo);
        mListImageInterview.add(R.drawable.conchim);
        mListImageInterview.add(R.drawable.concho);

        indicator1.setBackground(getResources().getDrawable(R.drawable.indicator_selected));
        indicator2.setBackground(getResources().getDrawable(R.drawable.indicator_not_selected));
        indicator3.setBackground(getResources().getDrawable(R.drawable.indicator_not_selected));

        mCustomViewPaper = new CustomViewpaperInterVIew(this, mListImageInterview, mViewPager);
        mViewPager.setAdapter(mCustomViewPaper);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    indicator1.setBackground(getResources().getDrawable(R.drawable.indicator_selected));
                    indicator2.setBackground(getResources().getDrawable(R.drawable.indicator_not_selected));
                    indicator3.setBackground(getResources().getDrawable(R.drawable.indicator_not_selected));
                } else if (position == 1) {
                    indicator2.setBackground(getResources().getDrawable(R.drawable.indicator_selected));
                    indicator1.setBackground(getResources().getDrawable(R.drawable.indicator_not_selected));
                    indicator3.setBackground(getResources().getDrawable(R.drawable.indicator_not_selected));
                } else {
                    indicator3.setBackground(getResources().getDrawable(R.drawable.indicator_selected));
                    indicator1.setBackground(getResources().getDrawable(R.drawable.indicator_not_selected));
                    indicator2.setBackground(getResources().getDrawable(R.drawable.indicator_not_selected));
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        editor.putInt(Constant.SHARED_PREFERENCES_SETTING_INTERVIEW_KEY, 0);
        editor.commit();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
