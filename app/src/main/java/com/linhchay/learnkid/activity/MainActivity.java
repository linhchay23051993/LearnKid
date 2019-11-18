package com.linhchay.learnkid.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.linhchay.learnkid.R;
import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.listener.SingleTapListenerImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout animalsBg, objectBg, numberBg, alphabetBg, fruitBg, foodBg, colorBg, shapeBg;
    TextView animalsText, objectText, numberText, alphabetText, fruitText, foodText, colorText, shapeText;
    ImageView selectLanguageTmg;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        DisplayMetrics dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//        double x = Math.pow(dm.widthPixels / dm.xdpi, 2);
//        double y = Math.pow(dm.heightPixels / dm.ydpi, 2);
//        double screenInches = Math.sqrt(x + y);
//        Log.d("LinhChay", "Screen inches : " + screenInches);
        setContentView(R.layout.activity_main_small);
        initView();
        getSelectedLangauge();
    }

    private void getSelectedLangauge() {
        int language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, -1);

        if (language == -1) {
            editor.putInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);
            editor.commit();

            selectLanguageTmg.setImageResource(R.drawable.flag_vn);
            createHomeScreenVN();
        } else if (language == 0) {
            selectLanguageTmg.setImageResource(R.drawable.flag_vn);
            createHomeScreenVN();
        } else {
            selectLanguageTmg.setImageResource(R.drawable.flag_eng);
            createHomeScreenENG();
        }
    }

    private void createHomeScreenVN() {
        animalsText.setText(R.string.vn_animals);
        objectText.setText(R.string.vn_object);
        numberText.setText(R.string.vn_number);
        alphabetText.setText(R.string.vn_alphabet);
        fruitText.setText(R.string.vn_fruit);
        foodText.setText(R.string.vn_body);
        colorText.setText(R.string.vn_color);
        shapeText.setText(R.string.vn_shapes);
    }

    private void createHomeScreenENG() {
        animalsText.setText(R.string.eng_animals);
        objectText.setText(R.string.eng_object);
        numberText.setText(R.string.eng_number);
        alphabetText.setText(R.string.eng_alphabet);
        fruitText.setText(R.string.eng_fruit);
        foodText.setText(R.string.eng_body);
        colorText.setText(R.string.eng_color);
        shapeText.setText(R.string.eng_shapes);
    }

    private void initView() {
        animalsBg = findViewById(R.id.animals_bg);
        objectBg = findViewById(R.id.object_bg);
        numberBg = findViewById(R.id.number_bg);
        alphabetBg = findViewById(R.id.alphabet_bg);
        fruitBg = findViewById(R.id.fruit_bg);
        foodBg = findViewById(R.id.food_bg);
        colorBg = findViewById(R.id.color_bg);
        shapeBg = findViewById(R.id.shape_bg);

        animalsText = findViewById(R.id.animals_text);
        objectText = findViewById(R.id.object_text);
        numberText = findViewById(R.id.number_text);
        alphabetText = findViewById(R.id.alphabet_text);
        fruitText = findViewById(R.id.fruit_text);
        foodText = findViewById(R.id.food_text);
        colorText = findViewById(R.id.color_text);
        shapeText = findViewById(R.id.shape_text);

        selectLanguageTmg = findViewById(R.id.select_language_img);

        animalsBg.setOnClickListener(new SingleTapListenerImpl(this));
        objectBg.setOnClickListener(new SingleTapListenerImpl(this));
        numberBg.setOnClickListener(new SingleTapListenerImpl(this));
        alphabetBg.setOnClickListener(new SingleTapListenerImpl(this));
        fruitBg.setOnClickListener(new SingleTapListenerImpl(this));
        foodBg.setOnClickListener(new SingleTapListenerImpl(this));
        colorBg.setOnClickListener(new SingleTapListenerImpl(this));
        shapeBg.setOnClickListener(new SingleTapListenerImpl(this));
        selectLanguageTmg.setOnClickListener(new SingleTapListenerImpl(this));

        sharedPreferences = getSharedPreferences(Constant.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.select_language_img:
                changeLanguageOnClick();
                break;
            case R.id.animals_bg:
                showConfirmStudyDialog(Constant.ANIMALS_VALUE);
                break;
            case R.id.object_bg:
                showConfirmStudyDialog(Constant.OBJECT_VALUE);
                break;
            case R.id.number_bg:
                showConfirmStudyDialog(Constant.NUMBER_VALUE);
                break;
            case R.id.alphabet_bg:
                showConfirmStudyDialog(Constant.ALPHABET_VALUE);
                break;
            case R.id.fruit_bg:
                showConfirmStudyDialog(Constant.FRUIT_VALUE);
                break;
            case R.id.food_bg:
                showConfirmStudyDialog(Constant.BODY_VALUE);
                break;
            case R.id.color_bg:
                showConfirmStudyDialog(Constant.COLOR_VALUE);
                break;
            case R.id.shape_bg:
                showConfirmStudyDialog(Constant.SHAPE_VALUE);
                break;
            default:
                break;
        }

    }

    private void changeLanguageOnClick() {
        int language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);
        if (language == 0) {
            editor.putInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 1);
            editor.commit();
        } else {
            editor.putInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);
            editor.commit();
        }
        getSelectedLangauge();
    }

    private void showConfirmStudyDialog(final int type) {
        int language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, -1);
        final AppCompatDialog mDialog = new AppCompatDialog(this);
        mDialog.setContentView(R.layout.dialog_study_practice);
        Window window = mDialog.getWindow();
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        TextView studyButton = mDialog.findViewById(R.id.study_btn);
        TextView practiceButton = mDialog.findViewById(R.id.practice_btn);
        studyButton.setText(language == 0 ? "Học" : "Study");
        practiceButton.setText(language == 0 ? "Luyện tập" : "Practice");
        studyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
                switch (type) {
                    case Constant.ANIMALS_VALUE:
                        Intent animalsIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        animalsIntent.putExtra(Constant.LEARN_TYPE, Constant.ANIMALS_VALUE);
                        startActivity(animalsIntent);
                        break;
                    case Constant.OBJECT_VALUE:
                        Intent objectIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        objectIntent.putExtra(Constant.LEARN_TYPE, Constant.OBJECT_VALUE);
                        startActivity(objectIntent);
                        break;
                    case Constant.NUMBER_VALUE:
                        Intent numberIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        numberIntent.putExtra(Constant.LEARN_TYPE, Constant.NUMBER_VALUE);
                        startActivity(numberIntent);
                        break;
                    case Constant.ALPHABET_VALUE:
                        Intent alphabetIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        alphabetIntent.putExtra(Constant.LEARN_TYPE, Constant.ALPHABET_VALUE);
                        startActivity(alphabetIntent);
                        break;
                    case Constant.FRUIT_VALUE:
                        Intent fruitIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        fruitIntent.putExtra(Constant.LEARN_TYPE, Constant.FRUIT_VALUE);
                        startActivity(fruitIntent);
                        break;
                    case Constant.COLOR_VALUE:
                        Intent colorIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        colorIntent.putExtra(Constant.LEARN_TYPE, Constant.COLOR_VALUE);
                        startActivity(colorIntent);
                        break;
                    case Constant.BODY_VALUE:
                        Intent foodIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        foodIntent.putExtra(Constant.LEARN_TYPE, Constant.BODY_VALUE);
                        startActivity(foodIntent);
                        break;
                    case Constant.SHAPE_VALUE:
                        Intent shapeIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        shapeIntent.putExtra(Constant.LEARN_TYPE, Constant.SHAPE_VALUE);
                        startActivity(shapeIntent);
                        break;
                }
            }
        });
        practiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
                switch (type) {
                    case Constant.ANIMALS_VALUE:
                        Intent animalsIntent = new Intent(getApplicationContext(), PracticeActivity.class);
                        animalsIntent.putExtra(Constant.LEARN_TYPE, Constant.ANIMALS_VALUE);
                        startActivity(animalsIntent);
                        break;
                    case Constant.OBJECT_VALUE:
                        Intent objectIntent = new Intent(getApplicationContext(), PracticeActivity.class);
                        objectIntent.putExtra(Constant.LEARN_TYPE, Constant.OBJECT_VALUE);
                        startActivity(objectIntent);
                        break;
                    case Constant.NUMBER_VALUE:
                        Intent numberIntent = new Intent(getApplicationContext(), PracticeActivity.class);
                        numberIntent.putExtra(Constant.LEARN_TYPE, Constant.NUMBER_VALUE);
                        startActivity(numberIntent);
                        break;
                    case Constant.ALPHABET_VALUE:
                        Intent alphabetIntent = new Intent(getApplicationContext(), PracticeActivity.class);
                        alphabetIntent.putExtra(Constant.LEARN_TYPE, Constant.ALPHABET_VALUE);
                        startActivity(alphabetIntent);
                        break;
                    case Constant.FRUIT_VALUE:
                        Intent fruitIntent = new Intent(getApplicationContext(), PracticeActivity.class);
                        fruitIntent.putExtra(Constant.LEARN_TYPE, Constant.FRUIT_VALUE);
                        startActivity(fruitIntent);
                        break;
                    case Constant.COLOR_VALUE:
                        Intent colorIntent = new Intent(getApplicationContext(), PracticeActivity.class);
                        colorIntent.putExtra(Constant.LEARN_TYPE, Constant.COLOR_VALUE);
                        startActivity(colorIntent);
                        break;
                    case Constant.BODY_VALUE:
                        Intent foodIntent = new Intent(getApplicationContext(), PracticeActivity.class);
                        foodIntent.putExtra(Constant.LEARN_TYPE, Constant.BODY_VALUE);
                        startActivity(foodIntent);
                        break;
                    case Constant.SHAPE_VALUE:
                        Intent shapeIntent = new Intent(getApplicationContext(), PracticeActivity.class);
                        shapeIntent.putExtra(Constant.LEARN_TYPE, Constant.SHAPE_VALUE);
                        startActivity(shapeIntent);
                        break;
                }
            }
        });
        mDialog.show();
    }
}
