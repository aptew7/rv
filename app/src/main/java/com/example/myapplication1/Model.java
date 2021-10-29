package com.example.myapplication1;

public class Model {

    private String text;
    private boolean isSelected = false;
    private int image;

    public Model(String text, int image) {
        this.text = text;
        this.image = image;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }
}