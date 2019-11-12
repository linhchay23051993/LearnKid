package com.linhchay.learnkid.viewpaper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.linhchay.learnkid.R;

import java.util.List;

public class CustomViewpaperInterVIew extends PagerAdapter {
    private Context mContext;
    private List<Integer> mListNumber;
    private LayoutInflater mLayoutInflater;
    private ViewPager mViewPager;
    private ImageView mItemImageView;

    public CustomViewpaperInterVIew(Context mContext, List<Integer> mListNumber, ViewPager viewPager) {
        this.mContext = mContext;
        this.mListNumber = mListNumber;
        this.mViewPager = viewPager;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mListNumber.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view = mLayoutInflater.inflate(R.layout.interview_item_viewpaper, container, false);
        mItemImageView = view.findViewById(R.id.item_viewpaper);
        mItemImageView.setImageResource(mListNumber.get(position));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

}
