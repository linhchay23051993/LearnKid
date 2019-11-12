package com.linhchay.learnkid.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.linhchay.learnkid.R;
import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.database.DatabaseOpenHelper;
import com.linhchay.learnkid.entity.LearnObject;
import com.linhchay.learnkid.listener.SingleTapListenerImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeActivity extends AppCompatActivity implements View.OnClickListener {
    TextView titleText;
    ImageView answerA, answerB, answerC, answerD;

    private DatabaseOpenHelper mDatabaseOpenHelper;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    MediaPlayer mMediaPlayer;
    int language = 0;
    int questionNumber = 0;

    List<LearnObject> learnObjectsList;
    List<LearnObject> learnObjectsListTemp;
    List<LearnObject> listAnswer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_layout_small);
        initView();
        createQuestion();
    }

    private void createQuestion() {
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

        Collections.shuffle(listAnswer);
        int idImageAnswerA = getResources().getIdentifier(listAnswer.get(0).getmImage(),
                "drawable", getPackageName());
        int idImageAnswerB = getResources().getIdentifier(listAnswer.get(1).getmImage(),
                "drawable", getPackageName());
        int idImageAnswerC = getResources().getIdentifier(listAnswer.get(2).getmImage(),
                "drawable", getPackageName());
        int idImageAnswerD = getResources().getIdentifier(listAnswer.get(3).getmImage(),
                "drawable", getPackageName());

        answerA.setImageResource(idImageAnswerA);
        answerB.setImageResource(idImageAnswerB);
        answerC.setImageResource(idImageAnswerC);
        answerD.setImageResource(idImageAnswerD);
    }

    private void initView() {
        titleText = findViewById(R.id.title_text);

        answerA = findViewById(R.id.answer_a_img);
        answerB = findViewById(R.id.answer_b_img);
        answerC = findViewById(R.id.answer_c_img);
        answerD = findViewById(R.id.answer_d_img);

        answerA.setOnClickListener(new SingleTapListenerImpl(this));
        answerB.setOnClickListener(new SingleTapListenerImpl(this));
        answerC.setOnClickListener(new SingleTapListenerImpl(this));
        answerD.setOnClickListener(new SingleTapListenerImpl(this));

        learnObjectsList = new ArrayList<>();

        try {
            mDatabaseOpenHelper = new DatabaseOpenHelper(this);
            learnObjectsList = mDatabaseOpenHelper.getAnimals();
            Collections.shuffle(learnObjectsList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        sharedPreferences = getSharedPreferences(Constant.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);

    }

    @Override
    public void onClick(View view) {

    }
}
