package com.techreturners.cats;

public class LionCat extends AbstractCat {
    private String setting = "wild";
    private int averageHeight = 1100;

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    public String eat(){
        return "Roar!!!!";
    }


}