package com.techreturners.cats;

abstract class AbstractCat implements Cat{

    private boolean sleeping = false;
    private String setting;
    private int averageHeight;

    public AbstractCat(String setting, int averageHeight){
        this.setting = setting;
        this.averageHeight = averageHeight;
    }

    public boolean isAsleep() {
        return this.sleeping;
    }

    public boolean goToSleep() {
        this.sleeping = true;
        return this.sleeping;
    }

    public boolean wakeUp() {
        this.sleeping = false;
        return this.sleeping;
    }

    public String getSetting() {
        return this.setting;
    }

    public int getAverageHeight() {
        return this.averageHeight;
    }

    abstract public String eat();

}