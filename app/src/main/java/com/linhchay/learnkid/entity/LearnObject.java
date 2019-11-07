package com.linhchay.learnkid.entity;

public class LearnObject {
    private String mImage;
    private String mNameVN;
    private String mNameENG;
    private String mSoundVN;
    private String mSoundENG;

    public LearnObject(String mImage, String mNameVN, String mNameENG, String mSoundVN, String mSoundENG) {
        this.mImage = mImage;
        this.mNameVN = mNameVN;
        this.mNameENG = mNameENG;
        this.mSoundVN = mSoundVN;
        this.mSoundENG = mSoundENG;
    }

    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public String getmNameVN() {
        return mNameVN;
    }

    public void setmNameVN(String mNameVN) {
        this.mNameVN = mNameVN;
    }

    public String getmNameENG() {
        return mNameENG;
    }

    public void setmNameENG(String mNameENG) {
        this.mNameENG = mNameENG;
    }

    public String getmSoundVN() {
        return mSoundVN;
    }

    public void setmSoundVN(String mSoundVN) {
        this.mSoundVN = mSoundVN;
    }

    public String getmSoundENG() {
        return mSoundENG;
    }

    public void setmSoundENG(String mSoundENG) {
        this.mSoundENG = mSoundENG;
    }
}