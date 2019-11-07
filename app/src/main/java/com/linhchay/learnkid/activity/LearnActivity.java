package com.linhchay.learnkid.activity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.linhchay.learnkid.R;
import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.database.DatabaseOpenHelper;
import com.linhchay.learnkid.entity.LearnObject;
import com.linhchay.learnkid.listener.SingleTapListenerImpl;
import com.linhchay.learnkid.viewpaper.CustomViewPaper;
import com.linhchay.learnkid.viewpaper.ViewPaperTransformer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LearnActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager mViewPager;
    private CustomViewPaper mCustomViewPaper;
    private SQLiteDatabase mWritableDatabase;
    private DatabaseOpenHelper mDatabaseOpenHelper;

    List<LearnObject> listLeanObject;

    ImageView previewImg_1, previewImg_2, previewImg_3, previewImg_4, previewImg_5;

    TextView titleText, countObjectText;

    Button nextBtn, backBtn, playMusicBtn;

    private int mCheckPosition = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_layout_small);
        initView();
        createLearnLayout();
        List<String> stringsList = new ArrayList<>();
        stringsList.add("conbo");
        stringsList.add("conchim");
        stringsList.add("concho");
        for (int i = 0; i < stringsList.size(); i++) {
            int idImage = getResources().getIdentifier(stringsList.get(i),
                    "drawable", getPackageName());
            Log.d("LinhChay", idImage + " --" + stringsList.get(i));
        }
    }

    private void createLearnLayout() {
        getDataLearn();
        setUpViewPaper();
    }

    private void setUpViewPaper() {
        mCustomViewPaper = new CustomViewPaper(this, listLeanObject, mViewPager);
        mViewPager.setPageTransformer(true, new ViewPaperTransformer());
        mViewPager.setAdapter(mCustomViewPaper);
        // set preview image
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {
                boolean check = true ? mCheckPosition < position : mCheckPosition > position;
                mCheckPosition = position;
                int preview_1 = 0;
                int preview_2 = 0;
                int preview_3 = 0;
                int preview_4 = 0;
                int preview_5 = 0;
                if (position == 0) {
                    previewImg_1.setImageResource(R.drawable.flag_vn);
                    previewImg_1.setVisibility(View.GONE);
                    previewImg_2.setImageResource(R.drawable.flag_vn);
                    previewImg_2.setVisibility(View.GONE);
//                    previewImg_3.setImageResource(listLeanObject.get(position));
//                    previewImg_4.setImageResource(listLeanObject.get(position + 1));
//                    previewImg_5.setImageResource(listLeanObject.get(position + 2));
                } else if (position == 1) {
                    previewImg_1.setImageResource(R.drawable.flag_vn);
                    previewImg_1.setVisibility(View.GONE);
//                    previewImg_2.setImageResource(listLeanObject.get(position - 1));
//                    previewImg_2.setVisibility(View.VISIBLE);
//                    previewImg_3.setImageResource(listLeanObject.get(position));
//                    previewImg_4.setImageResource(listLeanObject.get(position + 1));
//                    previewImg_5.setImageResource(listLeanObject.get(position + 2));
                } else if (position < listLeanObject.size() - 2) {
                    previewImg_1.setVisibility(View.VISIBLE);
                    previewImg_2.setVisibility(View.VISIBLE);
                    previewImg_4.setVisibility(View.VISIBLE);
                    previewImg_5.setVisibility(View.VISIBLE);
//                    previewImg_1.setImageResource(listLeanObject.get(position - 2));
//                    previewImg_2.setImageResource(listLeanObject.get(position - 1));
//                    previewImg_3.setImageResource(listLeanObject.get(position));
//                    previewImg_4.setImageResource(listLeanObject.get(position + 1));
//                    previewImg_5.setImageResource(listLeanObject.get(position + 2));
                } else if (position < listLeanObject.size() - 1) {
//                    previewImg_1.setImageResource(listLeanObject.get(position - 2));
//                    previewImg_2.setImageResource(listLeanObject.get(position - 1));
//                    previewImg_3.setImageResource(listLeanObject.get(position));
//                    previewImg_4.setVisibility(View.VISIBLE);
//                    previewImg_4.setImageResource(listLeanObject.get(position + 1));
                    previewImg_5.setVisibility(View.GONE);
                    previewImg_5.setImageResource(R.drawable.flag_vn);
                } else {
//                    previewImg_1.setImageResource(listLeanObject.get(position - 2));
//                    previewImg_2.setImageResource(listLeanObject.get(position - 1));
//                    previewImg_3.setImageResource(listLeanObject.get(position));
                    previewImg_4.setVisibility(View.GONE);
                    previewImg_4.setImageResource(R.drawable.flag_vn);
                    previewImg_5.setVisibility(View.GONE);
                    previewImg_5.setImageResource(R.drawable.flag_vn);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    private void getDataLearn() {
        Intent intentType = getIntent();
        int typeLearnValue = intentType.getIntExtra(Constant.LEARN_TYPE, -1);
        switch (typeLearnValue) {
            case Constant.ANIMALS_VALUE:
                listLeanObject = mDatabaseOpenHelper.getAnimals();
                break;
            case Constant.OBJECT_VALUE:
                break;
            default:
                break;
        }

    }

    private void initView() {
        listLeanObject = new ArrayList<>();
        mViewPager = findViewById(R.id.viewpager);

        previewImg_1 = findViewById(R.id.preview_1_img);
        previewImg_2 = findViewById(R.id.preview_2_img);
        previewImg_3 = findViewById(R.id.preview_3_img);
        previewImg_4 = findViewById(R.id.preview_4_img);
        previewImg_5 = findViewById(R.id.preview_5_img);

        titleText = findViewById(R.id.title_text);
        countObjectText = findViewById(R.id.count_object_text);

        nextBtn = findViewById(R.id.next_btn);
        backBtn = findViewById(R.id.back_btn);
        playMusicBtn = findViewById(R.id.play_music_btn);

        nextBtn.setOnClickListener(new SingleTapListenerImpl(this));
        backBtn.setOnClickListener(new SingleTapListenerImpl(this));
        playMusicBtn.setOnClickListener(new SingleTapListenerImpl(this));

        try {
            mDatabaseOpenHelper = new DatabaseOpenHelper(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mWritableDatabase = mDatabaseOpenHelper.getWritableDatabase();
    }

    private void setPreviewImage() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next_btn:
                mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1);
                break;
            case R.id.back_btn:
                mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1);
                break;
            default:
                break;
        }
    }
}
