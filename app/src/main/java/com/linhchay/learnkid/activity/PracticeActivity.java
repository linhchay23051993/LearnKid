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
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.linhchay.learnkid.R;
import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.entity.LearnObject;
import com.linhchay.learnkid.entity.ListLearnObject;
import com.linhchay.learnkid.listener.SingleTapListenerImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeActivity extends AppCompatActivity implements View.OnClickListener {
    TextView titleText, questionText;
    ImageView answerA, answerB, answerC, answerD;
    TextView checkAnswerA, checkAnswerB, checkAnswerC, checkAnswerD;
    Button playMusicBtn, nextQuestionBtn;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    MediaPlayer mMediaPlayer;

    private Bitmap mbitmap;
    private Bitmap imageRounded;
    private Canvas canvas;
    private Paint mpaint;

    int language = 0;
    int questionNumber = 0;
    boolean checkWronged;
    String answerA_Text, answerB_Text, answerC_Text, answerD_Text;

    List<LearnObject> learnObjectsList;
    List<LearnObject> learnObjectsListTemp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_layout_small);
        initView();
        createQuestion();
    }

    private void createQuestion() {
        checkWronged = true;
        setVisibleAndEnable();

        learnObjectsListTemp = new ArrayList<>();
        for (int i = 0; i < learnObjectsList.size(); i++) {
            learnObjectsListTemp.add(learnObjectsList.get(i));
        }
        learnObjectsListTemp.remove(questionNumber);
        Collections.shuffle(learnObjectsListTemp);

        List<LearnObject> listAnswer = new ArrayList<>();
        listAnswer.add(learnObjectsList.get(questionNumber));
        listAnswer.add(learnObjectsListTemp.get(0));
        listAnswer.add(learnObjectsListTemp.get(1));
        listAnswer.add(learnObjectsListTemp.get(2));

        questionText.setText(language == 0 ? learnObjectsList.get(questionNumber).getmNameVN() : learnObjectsList.get(questionNumber).getmNameENG());

        Collections.shuffle(listAnswer);
        int idImageAnswerA = getResources().getIdentifier(listAnswer.get(0).getmImage(),
                "drawable", getPackageName());
        int idImageAnswerB = getResources().getIdentifier(listAnswer.get(1).getmImage(),
                "drawable", getPackageName());
        int idImageAnswerC = getResources().getIdentifier(listAnswer.get(2).getmImage(),
                "drawable", getPackageName());
        int idImageAnswerD = getResources().getIdentifier(listAnswer.get(3).getmImage(),
                "drawable", getPackageName());

        Animation animationFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        Animation animationFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);

        connerImage(idImageAnswerA, answerA);
        connerImage(idImageAnswerB, answerB);
        connerImage(idImageAnswerC, answerC);
        connerImage(idImageAnswerD, answerD);

        answerA.startAnimation(animationFadeOut);
        answerB.startAnimation(animationFadeIn);
        answerC.startAnimation(animationFadeOut);
        answerD.startAnimation(animationFadeIn);

        if (language == 0) {
            answerA_Text = listAnswer.get(0).getmNameVN();
            answerB_Text = listAnswer.get(1).getmNameVN();
            answerC_Text = listAnswer.get(2).getmNameVN();
            answerD_Text = listAnswer.get(3).getmNameVN();
        } else {
            answerA_Text = listAnswer.get(0).getmNameENG();
            answerB_Text = listAnswer.get(1).getmNameENG();
            answerC_Text = listAnswer.get(2).getmNameENG();
            answerD_Text = listAnswer.get(3).getmNameENG();
        }
    }

    private void setVisibleAndEnable() {
        answerA.clearAnimation();
        answerB.clearAnimation();
        answerC.clearAnimation();
        answerD.clearAnimation();

        checkAnswerA.clearAnimation();
        checkAnswerB.clearAnimation();
        checkAnswerC.clearAnimation();
        checkAnswerD.clearAnimation();

        checkAnswerA.setVisibility(View.GONE);
        checkAnswerB.setVisibility(View.GONE);
        checkAnswerC.setVisibility(View.GONE);
        checkAnswerD.setVisibility(View.GONE);

        answerA.setEnabled(true);
        answerB.setEnabled(true);
        answerC.setEnabled(true);
        answerD.setEnabled(true);

    }

    private void initView() {
        titleText = findViewById(R.id.title_text);
        questionText = findViewById(R.id.question_text);

        playMusicBtn = findViewById(R.id.play_music_btn);
        nextQuestionBtn = findViewById(R.id.next_question_btn);

        answerA = findViewById(R.id.answer_a_img);
        answerB = findViewById(R.id.answer_b_img);
        answerC = findViewById(R.id.answer_c_img);
        answerD = findViewById(R.id.answer_d_img);

        checkAnswerA = findViewById(R.id.check_answer_a_img);
        checkAnswerB = findViewById(R.id.check_answer_b_img);
        checkAnswerC = findViewById(R.id.check_answer_c_img);
        checkAnswerD = findViewById(R.id.check_answer_d_img);

        answerA.setOnClickListener(new SingleTapListenerImpl(this));
        answerB.setOnClickListener(new SingleTapListenerImpl(this));
        answerC.setOnClickListener(new SingleTapListenerImpl(this));
        answerD.setOnClickListener(new SingleTapListenerImpl(this));
        playMusicBtn.setOnClickListener(new SingleTapListenerImpl(this));
        nextQuestionBtn.setOnClickListener(new SingleTapListenerImpl(this));
        nextQuestionBtn.setEnabled(false);

        learnObjectsList = new ArrayList<>();
        checkTypeLearn();
        sharedPreferences = getSharedPreferences(Constant.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);

    }

    private void checkTypeLearn() {
        Intent intent = getIntent();
        int typeLern = intent.getIntExtra(Constant.LEARN_TYPE, Constant.ANIMALS_VALUE);
        switch (typeLern) {
            case Constant.ANIMALS_VALUE:
                learnObjectsList = ListLearnObject.getInstance().getAnimalsList();
                Collections.shuffle(learnObjectsList);
                titleText.setText(language == 0 ? R.string.vn_animals : R.string.eng_animals);
                break;
            case Constant.OBJECT_VALUE:
                break;
            default:
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.answer_a_img:
                checkAnswer(R.id.answer_a_img);
                break;
            case R.id.answer_b_img:
                checkAnswer(R.id.answer_b_img);
                break;
            case R.id.answer_c_img:
                checkAnswer(R.id.answer_c_img);
                break;
            case R.id.answer_d_img:
                checkAnswer(R.id.answer_d_img);
                break;
            case R.id.play_music_btn:
                int idSound;
                if (language == 0) {
                    idSound = getResources().getIdentifier(learnObjectsList.get(questionNumber).getmSoundVN(),
                            "raw", getPackageName());
                } else {
                    idSound = getResources().getIdentifier(learnObjectsList.get(questionNumber).getmSoundENG(),
                            "raw", getPackageName());
                }
                mMediaPlayer = MediaPlayer.create(this, idSound);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;
            case R.id.next_question_btn:
                questionNumber++;
                if (questionNumber <= learnObjectsList.size() - 1) {
                    createQuestion();
                    nextQuestionBtn.setEnabled(false);
                    nextQuestionBtn.clearAnimation();
                }


                break;
            default:
                break;
        }
    }

    private void checkAnswer(int answerId) {
        Animation animationCorrecrt = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.correct_answer_anim);
        Animation animationInCorrecrt = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.select_wrong);
        Animation animationAnswerWrong = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.compare_zoom_in);
        Animation animationNextQuestion = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.nhap_nhay);
        if (language == 0) {
            String answerText = learnObjectsList.get(questionNumber).getmNameVN();
            switch (answerId) {
                case R.id.answer_a_img:
                    if (TextUtils.equals(answerText, answerA_Text)) {
                        answerA.startAnimation(animationCorrecrt);
                        checkAnswerA.setVisibility(View.VISIBLE);
                        checkAnswerA.setBackgroundResource(R.drawable.practice_shape_rectangle_true);
                        showToastAndPlayMusic(true);

                        answerB.setEnabled(false);
                        answerC.setEnabled(false);
                        answerD.setEnabled(false);

                        nextQuestionBtn.setEnabled(true);
                        nextQuestionBtn.startAnimation(animationNextQuestion);

                        checkAnswerD.setVisibility(View.VISIBLE);
                        checkAnswerB.setVisibility(View.VISIBLE);
                        checkAnswerC.setVisibility(View.VISIBLE);

                        checkAnswerD.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        checkAnswerB.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        checkAnswerC.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                    } else {
                        checkWronged = false;
                        showToastAndPlayMusic(false);
                        checkAnswerA.startAnimation(animationInCorrecrt);
                        checkAnswerA.setVisibility(View.VISIBLE);
                        checkAnswerA.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        answerA.setEnabled(false);
                        answerA.startAnimation(animationInCorrecrt);
                    }
                    break;
                case R.id.answer_b_img:
                    if (TextUtils.equals(answerText, answerB_Text)) {
                        answerB.startAnimation(animationCorrecrt);
                        checkAnswerB.setVisibility(View.VISIBLE);
                        checkAnswerB.setBackgroundResource(R.drawable.practice_shape_rectangle_true);
                        showToastAndPlayMusic(true);

                        answerA.setEnabled(false);
                        answerC.setEnabled(false);
                        answerD.setEnabled(false);

                        nextQuestionBtn.setEnabled(true);
                        nextQuestionBtn.startAnimation(animationNextQuestion);

                        checkAnswerA.setVisibility(View.VISIBLE);
                        checkAnswerD.setVisibility(View.VISIBLE);
                        checkAnswerC.setVisibility(View.VISIBLE);
                        checkAnswerA.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        checkAnswerD.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        checkAnswerC.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                    } else {
                        checkWronged = false;
                        showToastAndPlayMusic(false);
                        checkAnswerB.startAnimation(animationInCorrecrt);
                        checkAnswerB.setVisibility(View.VISIBLE);
                        checkAnswerB.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        answerB.setEnabled(false);
                        answerB.startAnimation(animationInCorrecrt);
                    }
                    break;
                case R.id.answer_c_img:
                    if (TextUtils.equals(answerText, answerC_Text)) {
                        answerC.startAnimation(animationCorrecrt);
                        checkAnswerC.setVisibility(View.VISIBLE);
                        checkAnswerC.setBackgroundResource(R.drawable.practice_shape_rectangle_true);
                        showToastAndPlayMusic(true);

                        answerB.setEnabled(false);
                        answerA.setEnabled(false);
                        answerD.setEnabled(false);

                        nextQuestionBtn.setEnabled(true);
                        nextQuestionBtn.startAnimation(animationNextQuestion);

                        checkAnswerA.setVisibility(View.VISIBLE);
                        checkAnswerB.setVisibility(View.VISIBLE);
                        checkAnswerD.setVisibility(View.VISIBLE);
                        checkAnswerA.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        checkAnswerB.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        checkAnswerD.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                    } else {
                        checkWronged = false;
                        showToastAndPlayMusic(false);
                        checkAnswerC.startAnimation(animationInCorrecrt);
                        checkAnswerC.setVisibility(View.VISIBLE);
                        checkAnswerC.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        answerC.setEnabled(false);
                        answerC.startAnimation(animationInCorrecrt);
                    }
                    break;
                case R.id.answer_d_img:
                    if (TextUtils.equals(answerText, answerD_Text)) {
                        answerD.startAnimation(animationCorrecrt);
                        checkAnswerD.setVisibility(View.VISIBLE);
                        checkAnswerD.setBackgroundResource(R.drawable.practice_shape_rectangle_true);
                        showToastAndPlayMusic(true);

                        answerB.setEnabled(false);
                        answerC.setEnabled(false);
                        answerA.setEnabled(false);

                        nextQuestionBtn.setEnabled(true);
                        nextQuestionBtn.startAnimation(animationNextQuestion);

                        checkAnswerA.setVisibility(View.VISIBLE);
                        checkAnswerB.setVisibility(View.VISIBLE);
                        checkAnswerC.setVisibility(View.VISIBLE);
                        checkAnswerA.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        checkAnswerB.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        checkAnswerC.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                    } else {
                        checkWronged = false;
                        showToastAndPlayMusic(false);
                        checkAnswerD.startAnimation(animationInCorrecrt);
                        checkAnswerD.setVisibility(View.VISIBLE);
                        checkAnswerD.setBackgroundResource(R.drawable.practice_shape_rectangle_false);
                        answerD.setEnabled(false);
                        answerD.startAnimation(animationInCorrecrt);
                    }
                    break;
            }
        } else {

        }
    }

    private void showToastAndPlayMusic(boolean check) {
        if (check) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.practice_correct_mucsic);
            mMediaPlayer.start();
            mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
        } else {
            mMediaPlayer = MediaPlayer.create(this, R.raw.practice_incorrect_mucsic);
            mMediaPlayer.start();
            mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
        }
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
}
