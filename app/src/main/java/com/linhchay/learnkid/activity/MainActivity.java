package com.linhchay.learnkid.activity;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.linhchay.learnkid.R;
import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.listener.SingleTapListenerImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout animalsBg, objectBg, numberBg, alphabetBg, fruitBg, foodBg, colorBg, shapeBg;
    TextView animalsText, objectText, numberText, alphabetText, fruitText, foodText, colorText, shapeText;
    TextView titleText;
    ImageView selectLanguageTmg, rateIconImg, feedbakIconImg;

    ImageView animalsImg, objectImg, numberImg, alphabetImg, fruitImg, colorImg;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    private Bitmap mbitmap;
    private Bitmap imageRounded;
    private Canvas canvas;
    private Paint mpaint;

    int language = 0;
    double sizeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sizeScreen = getSizeScreen();
        if (sizeScreen > 5) {
            setContentView(R.layout.activity_main_big);
        } else {
            setContentView(R.layout.activity_main_small);
        }
        initView();
        getSelectedLangauge();
    }

    private void getSelectedLangauge() {
        language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, -1);

        if (language == -1) {
            editor.putInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);
            editor.commit();
            createHomeScreenVN();
        } else if (language == 0) {
            createHomeScreenVN();
        } else {
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

        titleText.setText("Bài học");
        connerImage(R.mipmap.flag_vn, selectLanguageTmg, 25, 25);
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

        titleText.setText("Lesson");
        connerImage(R.mipmap.flag_eng, selectLanguageTmg, 25, 25);
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

        animalsImg = findViewById(R.id.main_animals_img);
        objectImg = findViewById(R.id.main_object_img);
        numberImg = findViewById(R.id.main_number_img);
        alphabetImg = findViewById(R.id.main_alphabet_img);
        fruitImg = findViewById(R.id.main_fruit_img);
        colorImg = findViewById(R.id.main_color_img);

        animalsText = findViewById(R.id.animals_text);
        objectText = findViewById(R.id.object_text);
        numberText = findViewById(R.id.number_text);
        alphabetText = findViewById(R.id.alphabet_text);
        fruitText = findViewById(R.id.fruit_text);
        foodText = findViewById(R.id.food_text);
        colorText = findViewById(R.id.color_text);
        shapeText = findViewById(R.id.shape_text);

        titleText = findViewById(R.id.title_text);

        selectLanguageTmg = findViewById(R.id.select_language_img);
        rateIconImg = findViewById(R.id.rate_icon_img);
        feedbakIconImg = findViewById(R.id.feedback_icon_img);

        animalsBg.setOnClickListener(new SingleTapListenerImpl(this));
        objectBg.setOnClickListener(new SingleTapListenerImpl(this));
        numberBg.setOnClickListener(new SingleTapListenerImpl(this));
        alphabetBg.setOnClickListener(new SingleTapListenerImpl(this));
        fruitBg.setOnClickListener(new SingleTapListenerImpl(this));
        foodBg.setOnClickListener(new SingleTapListenerImpl(this));
        colorBg.setOnClickListener(new SingleTapListenerImpl(this));
        shapeBg.setOnClickListener(new SingleTapListenerImpl(this));
        selectLanguageTmg.setOnClickListener(new SingleTapListenerImpl(this));
        rateIconImg.setOnClickListener(new SingleTapListenerImpl(this));
        feedbakIconImg.setOnClickListener(new SingleTapListenerImpl(this));
        sharedPreferences = getSharedPreferences(Constant.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        connerImage(R.mipmap.rate_icon, rateIconImg, 25, 25);
        connerImage(R.mipmap.feedback_icon, feedbakIconImg, 25, 25);
        connerImage(R.drawable.main_animals, animalsImg, 65, 65);
        connerImage(R.drawable.main_object, objectImg, 65, 65);
        connerImage(R.drawable.main_number, numberImg, 65, 65);
        connerImage(R.drawable.main_alphabet, alphabetImg, 65, 65);
        connerImage(R.drawable.main_fruit, fruitImg, 65, 65);
        connerImage(R.drawable.main_color, colorImg, 65, 65);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.select_language_img:
                changeLanguageOnClick();
                break;
            case R.id.rate_icon_img:
                rateButton();
                break;
            case R.id.feedback_icon_img:
                feedbackButton();
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

    private void rateButton() {
        Uri uri = Uri.parse("market://details?id=" + getApplicationContext().getPackageName());
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        try {
            startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName())));
        }
    }

    private void feedbackButton() {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", "nguyenvanlinh23051993@gmail.com", null));
        intent.putExtra(Intent.EXTRA_SUBJECT, "[APP] Feedback on the application");
        intent.putExtra(Intent.EXTRA_TEXT, "Please write your feedback. Thank you!");
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));
    }

    private void showConfirmStudyDialog(final int type) {
        language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, -1);
        final AppCompatDialog mDialog = new AppCompatDialog(this);
        if (sizeScreen > 5) {
            mDialog.setContentView(R.layout.dialog_study_practice_big);
        } else {
            mDialog.setContentView(R.layout.dialog_study_practice_small);
        }
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
                        finish();
                        break;
                    case Constant.OBJECT_VALUE:
                        Intent objectIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        objectIntent.putExtra(Constant.LEARN_TYPE, Constant.OBJECT_VALUE);
                        startActivity(objectIntent);
                        finish();
                        break;
                    case Constant.NUMBER_VALUE:
                        Intent numberIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        numberIntent.putExtra(Constant.LEARN_TYPE, Constant.NUMBER_VALUE);
                        startActivity(numberIntent);
                        finish();
                        break;
                    case Constant.ALPHABET_VALUE:
                        Intent alphabetIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        alphabetIntent.putExtra(Constant.LEARN_TYPE, Constant.ALPHABET_VALUE);
                        startActivity(alphabetIntent);
                        finish();
                        break;
                    case Constant.FRUIT_VALUE:
                        Intent fruitIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        fruitIntent.putExtra(Constant.LEARN_TYPE, Constant.FRUIT_VALUE);
                        startActivity(fruitIntent);
                        finish();
                        break;
                    case Constant.COLOR_VALUE:
                        Intent colorIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        colorIntent.putExtra(Constant.LEARN_TYPE, Constant.COLOR_VALUE);
                        startActivity(colorIntent);
                        finish();
                        break;
                    case Constant.BODY_VALUE:
                        Intent foodIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        foodIntent.putExtra(Constant.LEARN_TYPE, Constant.BODY_VALUE);
                        startActivity(foodIntent);
                        finish();
                        break;
                    case Constant.SHAPE_VALUE:
                        Intent shapeIntent = new Intent(getApplicationContext(), LearnActivity.class);
                        shapeIntent.putExtra(Constant.LEARN_TYPE, Constant.SHAPE_VALUE);
                        startActivity(shapeIntent);
                        finish();
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

    private void connerImage(int idImage, ImageView mImage, int connerX, int connerY) {
        mbitmap = ((BitmapDrawable) getResources().getDrawable(idImage)).getBitmap();
        imageRounded = Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
        canvas = new Canvas(imageRounded);
        mpaint = new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), connerX, connerY, mpaint); // Round Image Corner 100 100 100 100
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
