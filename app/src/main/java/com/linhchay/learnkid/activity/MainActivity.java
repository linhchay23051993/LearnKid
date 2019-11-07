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

import com.linhchay.learnkid.R;
import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.listener.SingleTapListenerImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout animalsBg, objectBg;
    TextView animalsText, objectText;
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
    }

    private void createHomeScreenENG() {
        animalsText.setText(R.string.eng_animals);
        objectText.setText(R.string.eng_object);
    }

    private void initView() {
        animalsBg = findViewById(R.id.animals_bg);
        objectBg = findViewById(R.id.object_bg);

        animalsText = findViewById(R.id.animals_text);
        objectText = findViewById(R.id.object_text);

        selectLanguageTmg = findViewById(R.id.select_language_img);

        animalsBg.setOnClickListener(new SingleTapListenerImpl(this));
        objectBg.setOnClickListener(new SingleTapListenerImpl(this));
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
