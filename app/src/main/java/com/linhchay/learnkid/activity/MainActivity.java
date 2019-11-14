package com.linhchay.learnkid.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
        foodText.setText(R.string.vn_food);
        colorText.setText(R.string.vn_color);
        shapeText.setText(R.string.vn_shapes);
    }

    private void createHomeScreenENG() {
        animalsText.setText(R.string.eng_animals);
        objectText.setText(R.string.eng_object);
        numberText.setText(R.string.eng_number);
        alphabetText.setText(R.string.eng_alphabet);
        fruitText.setText(R.string.eng_fruit);
        foodText.setText(R.string.eng_food);
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
                Intent animalsIntent = new Intent(this, LearnActivity.class);
                animalsIntent.putExtra(Constant.LEARN_TYPE, Constant.ANIMALS_VALUE);
                startActivity(animalsIntent);
                break;
            case R.id.object_bg:
                Intent objectIntent = new Intent(this, LearnActivity.class);
                objectIntent.putExtra(Constant.LEARN_TYPE, Constant.OBJECT_VALUE);
                startActivity(objectIntent);
                break;
            case R.id.number_bg:
                Intent numberIntent = new Intent(this, LearnActivity.class);
                numberIntent.putExtra(Constant.LEARN_TYPE, Constant.NUMBER_VALUE);
                startActivity(numberIntent);
                break;
            case R.id.alphabet_bg:
                Intent alphabetIntent = new Intent(this, LearnActivity.class);
                alphabetIntent.putExtra(Constant.LEARN_TYPE, Constant.ALPHABET_VALUE);
                startActivity(alphabetIntent);
                break;
            case R.id.fruit_bg:
                Intent fruitIntent = new Intent(this, LearnActivity.class);
                fruitIntent.putExtra(Constant.LEARN_TYPE, Constant.FRUIT_VALUE);
                startActivity(fruitIntent);
                break;
            case R.id.food_bg:
                Intent foodIntent = new Intent(this, LearnActivity.class);
                foodIntent.putExtra(Constant.LEARN_TYPE, Constant.FOOD_VALUE);
                startActivity(foodIntent);
                break;
            case R.id.color_bg:
                Intent colorIntent = new Intent(this, LearnActivity.class);
                colorIntent.putExtra(Constant.LEARN_TYPE, Constant.COLOR_VALUE);
                startActivity(colorIntent);
                break;
            case R.id.shape_bg:
                Intent shapeIntent = new Intent(this, LearnActivity.class);
                shapeIntent.putExtra(Constant.LEARN_TYPE, Constant.SHAPE_VALUE);
                startActivity(shapeIntent);
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
}
