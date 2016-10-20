package com.example.android.miwok;

/**
 * Created by PaulnKimmy on 20/10/2016.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

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

}
