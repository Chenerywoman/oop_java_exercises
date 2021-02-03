package com.techreturners.cats;

abstract class AbstractCat implements Cat{

    private Boolean sleeping = false;

    public Boolean isAsleep() {
        return this.sleeping;
    }

    public Boolean goToSleep() {
        this.sleeping = true;
        return this.sleeping;
    }

    public Boolean wakeUp() {
        this.sleeping = false;
        return this.sleeping;
    }

    abstract public String getSetting();

    abstract public int getAverageHeight();

    abstract public String eat();

}