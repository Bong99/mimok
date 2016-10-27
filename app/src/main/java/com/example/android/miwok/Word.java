package com.example.android.miwok;

/**
 * Created by PaulnKimmy on 20/10/2016.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgSrc;

    public Word(String d, String m, int imgID) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
        mImgSrc = imgID;
    }

    public Word(String d, String m) {
        mDefaultTranslation = d;
        mMiwokTranslation = m;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {return mImgSrc;}

}
