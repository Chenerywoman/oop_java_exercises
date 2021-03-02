package com.techreturners.cats;

public class LionCat extends AbstractCat {
    private String setting = "wild";
    private int averageHeight = 1100;

    public LionCat(){
        super("wild", 1100);
    }

    public String eat(){
        return "Roar!!!!";
    }


}