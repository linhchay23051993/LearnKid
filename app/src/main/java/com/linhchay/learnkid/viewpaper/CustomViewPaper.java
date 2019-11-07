package com.linhchay.learnkid.viewpaper;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.linhchay.learnkid.constant.Constant;
import com.linhchay.learnkid.entity.LearnObject;

import java.util.List;

import com.linhchay.learnkid.R;

public class CustomViewPaper extends PagerAdapter {
    private Context mContext;
    private List<LearnObject> mLearnObject;
    private LayoutInflater mLayoutInflater;
    private ViewPager mViewPager;
    private ImageView mImage;
    private TextView mName;
    private MediaPlayer mMediaPlayer;

    private Bitmap mbitmap;
    private Bitmap imageRounded;
    private Canvas canvas;
    private Paint mpaint;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    public CustomViewPaper(Context mContext, List<LearnObject> mLearnObject, ViewPager mViewPager) {
        this.mContext = mContext;
        this.mLearnObject = mLearnObject;
        this.mViewPager = mViewPager;
        mLayoutInflater = LayoutInflater.from(mContext);
        sharedPreferences = mContext.getSharedPreferences(Constant.SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    @Override
    public int getCount() {
        return mLearnObject.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view = mLayoutInflater.inflate(R.layout.item_viewpaper_small, container, false);
        mImage = view.findViewById(R.id.object_img);
        mName = view.findViewById(R.id.object_text);

        int idImage = mContext.getResources().getIdentifier(mLearnObject.get(position).getmImage(),
                "drawable", mContext.getPackageName());

        mbitmap = ((BitmapDrawable) mContext.getResources().getDrawable(idImage)).getBitmap();
        imageRounded = Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
        canvas = new Canvas(imageRounded);
        mpaint = new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), 70, 70, mpaint); // Round Image Corner 100 100 100 100
        mImage.setImageBitmap(imageRounded);

        int language = sharedPreferences.getInt(Constant.SHARED_PREFERENCES_LANGUAGE_KEY, 0);
        if (language == 0) {
            mName.setText(mLearnObject.get(position).getmNameVN());
        } else {
            mName.setText(mLearnObject.get(position).getmNameENG());
        }


//        mItemImageView.setImageResource(mListNumber.get(position).getmNumberA());
//
//        mItemImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                playMusic(mMediaPlayer, mListNumber.get(position).getmNumberB());
//            }
//        });
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

//    private void playMusic(MediaPlayer mediaPlayer, int rawId) {
//        mSharedPreferences = mContext.getSharedPreferences(SHARED_PREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
//        mSoundValue = mSharedPreferences.getInt(SHARED_PREFERENCES_SOUND_KEY, 1);
//        if (mSoundValue == 1) {
//            mediaPlayer = MediaPlayer.create(mContext, rawId);
//            mediaPlayer.start();
//            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                public void onCompletion(MediaPlayer mp) {
//                    mp.release();
//                }
//            });
//        }
//    }
}
