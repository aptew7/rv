package com.example.rv;

public class Line {
    private String mText;
    private int mImage;

    public Line(String text, int image) {
        mText = text;
        mImage = image;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }
}
