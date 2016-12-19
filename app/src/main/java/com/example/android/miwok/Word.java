package com.example.android.miwok;

/**
 * Created by PaulnKimmy on 20/10/2016.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgSrc;
    private int mAudioSrc;

    public Word(String d, String m, int audioID) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
        mAudioSrc = audioID;
    }

    public Word(String d, String m) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
    }

    public Word(String d, String m, int imgID, int audioID) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
        mImgSrc = imgID;
        mAudioSrc = audioID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {return mImgSrc;}

    public int getAudioResourceId() {return mAudioSrc;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImgSrc=" + mImgSrc +
                ", mAudioSrc=" + mAudioSrc +
                '}';
    }

}
