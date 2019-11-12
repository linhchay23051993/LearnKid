package com.linhchay.learnkid.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
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
    private DatabaseOpenHelper mDatabaseOpenHelper;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    MediaPlayer mMediaPlayer;

    List<LearnObject> mLearnObject;

    ImageView previewImg_1, previewImg_2, previewImg_3, previewImg_4, previewImg_5;

    TextView titleText, countObjectText;

    Button nextBtn, backBtn, playMusicBtn;

    int language;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_layout_small);
        initView();
        createLearnLayout();
    }

    private void createLearnLayout() {
        getDataLearn();
        setUpViewPaper();
    }

    private void setUpViewPaper() {
        mCustomViewPaper = new CustomViewPaper(this, mLearnObject, mViewPager);
        mViewPager.setPageTransformer(true, new ViewPaperTransformer());
        mViewPager.setAdapter(mCustomViewPaper);
        // set preview image
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {
                countObjectText.setText((position + 1) + "/" + mLearnObject.size());
                if (language == 0) {
                    playMusic(mMediaPlayer, mLearnObject.get(position).getmSoundVN());
                } else {
                    playMusic(mMediaPlayer, mLearnObject.get(position).getmSoundENG());
                }

                int idPreview1, idPreview2, idPreview3, idPreview4, idPreview5;
                if (position == 0) {
                    previewImg_1.setImageResource(R.drawable.flag_vn);
                    previewImg_1.setVisibility(View.GONE);
                    previewImg_2.setImageResource(R.drawable.flag_vn);
                    previewImg_2.setVisibility(View.GONE);
                    idPreview3 = getResources().getIdentifier(mLearnObject.get(position).getmImage(),
                            "drawable", getPackageName());
                    idPreview4 = getResources().getIdentifier(mLearnObject.get(position + 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview5 = getResources().getIdentifier(mLearnObject.get(position + 2).getmImage(),
                            "drawable", getPackageName());
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setImageResource(idPreview4);
                    previewImg_5.setImageResource(idPreview5);
                } else if (position == 1) {
                    previewImg_1.setImageResource(R.drawable.flag_vn);
                    previewImg_1.setVisibility(View.GONE);
                    idPreview2 = getResources().getIdentifier(mLearnObject.get(position - 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview3 = getResources().getIdentifier(mLearnObject.get(position).getmImage(),
                            "drawable", getPackageName());
                    idPreview4 = getResources().getIdentifier(mLearnObject.get(position + 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview5 = getResources().getIdentifier(mLearnObject.get(position + 2).getmImage(),
                            "drawable", getPackageName());
                    previewImg_2.setImageResource(idPreview2);
                    previewImg_2.setVisibility(View.VISIBLE);
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setImageResource(idPreview4);
                    previewImg_5.setImageResource(idPreview5);
                } else if (position < mLearnObject.size() - 2) {
                    previewImg_1.setVisibility(View.VISIBLE);
                    previewImg_2.setVisibility(View.VISIBLE);
                    previewImg_4.setVisibility(View.VISIBLE);
                    previewImg_5.setVisibility(View.VISIBLE);
                    idPreview1 = getResources().getIdentifier(mLearnObject.get(position - 2).getmImage(),
                            "drawable", getPackageName());
                    idPreview2 = getResources().getIdentifier(mLearnObject.get(position - 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview3 = getResources().getIdentifier(mLearnObject.get(position).getmImage(),
                            "drawable", getPackageName());
                    idPreview4 = getResources().getIdentifier(mLearnObject.get(position + 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview5 = getResources().getIdentifier(mLearnObject.get(position + 2).getmImage(),
                            "drawable", getPackageName());
                    previewImg_1.setImageResource(idPreview1);
                    previewImg_2.setImageResource(idPreview2);
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setImageResource(idPreview4);
                    previewImg_5.setImageResource(idPreview5);
                } else if (position < mLearnObject.size() - 1) {
                    idPreview1 = getResources().getIdentifier(mLearnObject.get(position - 2).getmImage(),
                            "drawable", getPackageName());
                    idPreview2 = getResources().getIdentifier(mLearnObject.get(position - 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview3 = getResources().getIdentifier(mLearnObject.get(position).getmImage(),
                            "drawable", getPackageName());
                    idPreview4 = getResources().getIdentifier(mLearnObject.get(position + 1).getmImage(),
                            "drawable", getPackageName());
                    previewImg_1.setImageResource(idPreview1);
                    previewImg_2.setImageResource(idPreview2);
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setVisibility(View.VISIBLE);
                    previewImg_4.setImageResource(idPreview4);
                    previewImg_5.setVisibility(View.GONE);
                    previewImg_5.setImageResource(R.drawable.flag_vn);
                } else {
                    idPreview1 = getResources().getIdentifier(mLearnObject.get(position - 2).getmImage(),
                            "drawable", getPackageName());
                    idPreview2 = getResources().getIdentifier(mLearnObject.get(position - 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview3 = getResources().getIdentifier(mLearnObject.get(position).getmImage(),
                            "drawable", getPackageName());
                    previewImg_1.setImageResource(idPreview1);
                    previewImg_2.setImageResource(idPreview2);
                    previewImg_3.setImageResource(idPreview3);
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

    private void playMusic(MediaPlayer mediaPlayer, String rawId) {
        int idSound = getResources().getIdentifier(rawId,
                "raw", getPackageName());
        mediaPlayer = MediaPlayer.create(this, idSound);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });
    }

    private void getDataLearn() {
        Intent intentType = getIntent();
        int typeLearnValue = intentType.getIntExtra(Constant.LEARN_TYPE, -1);
        switch (typeLearnValue) {
            case Constant.ANIMALS_VALUE:
                mLearnObject = mDatabaseOpenHelper.getAnimals();
                titleText.setText(language == 0 ? R.string.vn_animals : R.string.eng_animals);
                break;
            case Constant.OBJECT_VALUE:
                titleText.setText(language == 0 ? R.string.vn_object : R.string.eng_object);
                break;
            default:
                break;
        }
        countObjectText.setText("1" + "/" + mLearnObject.size());
        if (language == 0) {
            playMusic(mMediaPlayer, mLearnObject.get(0).getmSoundVN());
        } else {
            playMusic(mMediaPlayer, mLearnObject.get(0).getmSoundENG());
        }

    }

    private void initView() {
        mLearnObject = new ArrayList<>();
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
        sharedPreferences = getSharedPreferences(Constant.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);
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
            case R.id.play_music_btn:
                if (language == 0) {
                    playMusic(mMediaPlayer, mLearnObject.get(mViewPager.getCurrentItem()).getmSoundVN());
                } else {
                    playMusic(mMediaPlayer, mLearnObject.get(mViewPager.getCurrentItem()).getmSoundENG());
                }
                break;
            default:
                break;
        }
    }
}
