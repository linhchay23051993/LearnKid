package com.linhchay.learnkid.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.linhchay.learnkid.R;
import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.entity.LearnObject;
import com.linhchay.learnkid.entity.ListLearnObject;
import com.linhchay.learnkid.listener.SingleTapListenerImpl;
import com.linhchay.learnkid.viewpaper.CustomViewPaper;
import com.linhchay.learnkid.viewpaper.ViewPaperTransformer;

import java.util.ArrayList;
import java.util.List;

public class LearnActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager mViewPager;
    private CustomViewPaper mCustomViewPaper;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    MediaPlayer mMediaPlayer;

    List<LearnObject> mLearnObjectList;

    ImageView previewImg_1, previewImg_2, previewImg_3, previewImg_4, previewImg_5;
    TextView previewText_1, previewText_2, previewText_4, previewText_5;

    TextView titleText, countObjectText;

    ImageView nextBtn, backBtn, playMusicBtn;
    ImageView backScreenBtn;

    private Bitmap mbitmap;
    private Bitmap imageRounded;
    private Canvas canvas;
    private Paint mpaint;


    int language;
    double sizeScreen;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sizeScreen = getSizeScreen();
        if (sizeScreen > 5) {
            setContentView(R.layout.learn_layout_big);
        } else {
            setContentView(R.layout.learn_layout_small);
        }
        initView();
        createLearnLayout();
    }

    private void createLearnLayout() {
        getDataLearn();
        setUpViewPaper();
    }

    private void setUpViewPaper() {
        mCustomViewPaper = new CustomViewPaper(this, mLearnObjectList, mViewPager, sizeScreen);
        mViewPager.setPageTransformer(true, new ViewPaperTransformer());
        mViewPager.setAdapter(mCustomViewPaper);
        // set preview image
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {
                countObjectText.setText((position + 1) + "/" + mLearnObjectList.size());
                if (language == 0) {
                    playMusic(mMediaPlayer, mLearnObjectList.get(position).getmSoundVN());
                } else {
                    playMusic(mMediaPlayer, mLearnObjectList.get(position).getmSoundENG());
                }

                int idPreview1, idPreview2, idPreview3, idPreview4, idPreview5;
                if (position == 0) {
                    previewImg_1.setVisibility(View.GONE);
                    previewImg_2.setVisibility(View.GONE);
                    previewText_1.setVisibility(View.GONE);
                    previewText_2.setVisibility(View.GONE);
                    idPreview3 = getResources().getIdentifier(mLearnObjectList.get(position).getmImage(),
                            "drawable", getPackageName());
                    idPreview4 = getResources().getIdentifier(mLearnObjectList.get(position + 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview5 = getResources().getIdentifier(mLearnObjectList.get(position + 2).getmImage(),
                            "drawable", getPackageName());
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setImageResource(idPreview4);
                    previewImg_5.setImageResource(idPreview5);
                } else if (position == 1) {
                    previewImg_1.setVisibility(View.GONE);
                    previewText_1.setVisibility(View.GONE);
                    idPreview2 = getResources().getIdentifier(mLearnObjectList.get(position - 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview3 = getResources().getIdentifier(mLearnObjectList.get(position).getmImage(),
                            "drawable", getPackageName());
                    idPreview4 = getResources().getIdentifier(mLearnObjectList.get(position + 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview5 = getResources().getIdentifier(mLearnObjectList.get(position + 2).getmImage(),
                            "drawable", getPackageName());
                    previewImg_2.setImageResource(idPreview2);
                    previewImg_2.setVisibility(View.VISIBLE);
                    previewText_2.setVisibility(View.VISIBLE);
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setImageResource(idPreview4);
                    previewImg_5.setImageResource(idPreview5);
                } else if (position < mLearnObjectList.size() - 2) {
                    previewImg_1.setVisibility(View.VISIBLE);
                    previewImg_2.setVisibility(View.VISIBLE);
                    previewImg_4.setVisibility(View.VISIBLE);
                    previewImg_5.setVisibility(View.VISIBLE);
                    previewText_1.setVisibility(View.VISIBLE);
                    previewText_2.setVisibility(View.VISIBLE);
                    previewText_4.setVisibility(View.VISIBLE);
                    previewText_5.setVisibility(View.VISIBLE);

                    idPreview1 = getResources().getIdentifier(mLearnObjectList.get(position - 2).getmImage(),
                            "drawable", getPackageName());
                    idPreview2 = getResources().getIdentifier(mLearnObjectList.get(position - 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview3 = getResources().getIdentifier(mLearnObjectList.get(position).getmImage(),
                            "drawable", getPackageName());
                    idPreview4 = getResources().getIdentifier(mLearnObjectList.get(position + 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview5 = getResources().getIdentifier(mLearnObjectList.get(position + 2).getmImage(),
                            "drawable", getPackageName());
                    previewImg_1.setImageResource(idPreview1);
                    previewImg_2.setImageResource(idPreview2);
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setImageResource(idPreview4);
                    previewImg_5.setImageResource(idPreview5);
                } else if (position < mLearnObjectList.size() - 1) {
                    idPreview1 = getResources().getIdentifier(mLearnObjectList.get(position - 2).getmImage(),
                            "drawable", getPackageName());
                    idPreview2 = getResources().getIdentifier(mLearnObjectList.get(position - 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview3 = getResources().getIdentifier(mLearnObjectList.get(position).getmImage(),
                            "drawable", getPackageName());
                    idPreview4 = getResources().getIdentifier(mLearnObjectList.get(position + 1).getmImage(),
                            "drawable", getPackageName());
                    previewImg_1.setImageResource(idPreview1);
                    previewImg_2.setImageResource(idPreview2);
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setVisibility(View.VISIBLE);
                    previewText_4.setVisibility(View.VISIBLE);
                    previewImg_4.setImageResource(idPreview4);
                    previewImg_5.setVisibility(View.GONE);
                    previewText_5.setVisibility(View.GONE);
                } else {
                    idPreview1 = getResources().getIdentifier(mLearnObjectList.get(position - 2).getmImage(),
                            "drawable", getPackageName());
                    idPreview2 = getResources().getIdentifier(mLearnObjectList.get(position - 1).getmImage(),
                            "drawable", getPackageName());
                    idPreview3 = getResources().getIdentifier(mLearnObjectList.get(position).getmImage(),
                            "drawable", getPackageName());
                    previewImg_1.setImageResource(idPreview1);
                    previewImg_2.setImageResource(idPreview2);
                    previewImg_3.setImageResource(idPreview3);
                    previewImg_4.setVisibility(View.GONE);
                    previewImg_5.setVisibility(View.GONE);
                    previewText_4.setVisibility(View.GONE);
                    previewText_5.setVisibility(View.GONE);
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
                mLearnObjectList = ListLearnObject.getInstance().getAnimalsList();
                titleText.setText(language == 0 ? R.string.vn_animals : R.string.eng_animals);
                break;
            case Constant.OBJECT_VALUE:
                mLearnObjectList = ListLearnObject.getInstance().getObjectList();
                titleText.setText(language == 0 ? R.string.vn_object : R.string.eng_object);
                break;
            case Constant.NUMBER_VALUE:
                mLearnObjectList = ListLearnObject.getInstance().getNumbersList();
                titleText.setText(language == 0 ? R.string.vn_number : R.string.eng_number);
                break;
            case Constant.ALPHABET_VALUE:
                if (language == 0) {
                    mLearnObjectList = ListLearnObject.getInstance().getAlphabetListVN();
                    titleText.setText(R.string.vn_alphabet);
                } else {
                    mLearnObjectList = ListLearnObject.getInstance().getAlphabetListENG();
                    titleText.setText(R.string.eng_alphabet);
                }
                break;
            case Constant.FRUIT_VALUE:
                mLearnObjectList = ListLearnObject.getInstance().getFruitList();
                titleText.setText(language == 0 ? R.string.vn_fruit : R.string.eng_fruit);
                break;
            case Constant.BODY_VALUE:
                mLearnObjectList = ListLearnObject.getInstance().getBodyList();
                titleText.setText(language == 0 ? R.string.vn_body : R.string.eng_body);
                break;
            case Constant.COLOR_VALUE:
                mLearnObjectList = ListLearnObject.getInstance().getColorList();
                titleText.setText(language == 0 ? R.string.vn_color : R.string.eng_color);
                break;
            case Constant.SHAPE_VALUE:
                mLearnObjectList = ListLearnObject.getInstance().getShapeList();
                titleText.setText(language == 0 ? R.string.vn_shapes : R.string.eng_shapes);
                break;
            default:
                break;
        }
        countObjectText.setText("1" + "/" + mLearnObjectList.size());
        if (language == 0) {
            playMusic(mMediaPlayer, mLearnObjectList.get(0).getmSoundVN());
        } else {
            playMusic(mMediaPlayer, mLearnObjectList.get(0).getmSoundENG());
        }
        int idPreview3 = getResources().getIdentifier(mLearnObjectList.get(0).getmImage(),
                "drawable", getPackageName());
        int idPreview4 = getResources().getIdentifier(mLearnObjectList.get(1).getmImage(),
                "drawable", getPackageName());
        int idPreview5 = getResources().getIdentifier(mLearnObjectList.get(2).getmImage(),
                "drawable", getPackageName());
        previewImg_3.setImageResource(idPreview3);
        previewImg_4.setImageResource(idPreview4);
        previewImg_5.setImageResource(idPreview5);
        previewText_1.setVisibility(View.GONE);
        previewText_2.setVisibility(View.GONE);

    }

    private void initView() {
        mLearnObjectList = new ArrayList<>();
        mViewPager = findViewById(R.id.viewpager);

        previewImg_1 = findViewById(R.id.preview_1_img);
        previewImg_2 = findViewById(R.id.preview_2_img);
        previewImg_3 = findViewById(R.id.preview_3_img);
        previewImg_4 = findViewById(R.id.preview_4_img);
        previewImg_5 = findViewById(R.id.preview_5_img);

        previewText_1 = findViewById(R.id.preview_1_text);
        previewText_2 = findViewById(R.id.preview_2_text);
        previewText_4 = findViewById(R.id.preview_4_text);
        previewText_5 = findViewById(R.id.preview_5_text);

        titleText = findViewById(R.id.title_text);
        countObjectText = findViewById(R.id.count_object_text);

        nextBtn = findViewById(R.id.next_btn);
        backBtn = findViewById(R.id.back_btn);
        playMusicBtn = findViewById(R.id.play_music_btn);
        backScreenBtn = findViewById(R.id.back_srceen_study_btn);

        nextBtn.setOnClickListener(new SingleTapListenerImpl(this));
        backBtn.setOnClickListener(new SingleTapListenerImpl(this));
        playMusicBtn.setOnClickListener(new SingleTapListenerImpl(this));
        backScreenBtn.setOnClickListener(new SingleTapListenerImpl(this));

        sharedPreferences = getSharedPreferences(Constant.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);

        connerImage(R.mipmap.previous_btn_1, nextBtn);
        connerImage(R.mipmap.sound_btn, playMusicBtn);
        connerImage(R.mipmap.next_btn_1, backBtn);
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
                    playMusic(mMediaPlayer, mLearnObjectList.get(mViewPager.getCurrentItem()).getmSoundVN());
                } else {
                    playMusic(mMediaPlayer, mLearnObjectList.get(mViewPager.getCurrentItem()).getmSoundENG());
                }
                break;
            case R.id.back_srceen_study_btn:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void connerImage(int idImage, ImageView mImage) {
        mbitmap = ((BitmapDrawable) getResources().getDrawable(idImage)).getBitmap();
        imageRounded = Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
        canvas = new Canvas(imageRounded);
        mpaint = new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), 86, 86, mpaint); // Round Image Corner 100 100 100 100
        mImage.setImageBitmap(imageRounded);
    }

    private double getSizeScreen() {
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        double x = Math.pow(dm.widthPixels / dm.xdpi, 2);
        double y = Math.pow(dm.heightPixels / dm.ydpi, 2);
        return Math.sqrt(x + y);
    }
}
