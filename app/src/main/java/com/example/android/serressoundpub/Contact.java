package com.example.android.serressoundpub;

/**
 * Created by George on 22/1/2017.
 */

public class Contact {

    private int mText1;
    private int mText2;
    private int mImage1;

    public Contact(int text1, int text2, int image1) {
        mText1 = text1;
        mText2 = text2;
        mImage1 = image1;
    }

    public int getText1() {
        return mText1;
    }

    public int getText2() {
        return mText2;
    }

    public int getImage1() {
        return mImage1;
    }

}
