package com.techreturners.cats;

public class DomesticCat extends AbstractCat {
    private String setting = "domestic";
    private int averageHeight = 23;

    public DomesticCat(){
        super("domestic", 23);
    }

    public String eat(){

        double random = Math.random() * 1;
        if (random < 0.5){
            System.out.println(random);
            return "It will do I suppose";
        } else {
            return "Purrrrrrr";
        }
    }

}