package com.techreturners.cats;

public abstract class Abstract implements Cat {

    private boolean sleeping;
    private int averageHeight;
    private String setting;
    private String eatNoise;
    
public Abstract(String eatNoise,int averageHeight, String setting){
    this.eatNoise = eatNoise;
    this.averageHeight =averageHeight;
    this.setting = setting;
}
    
    public boolean isAsleep() { return this.sleeping;}
    
    public boolean goToSleep() { return this.sleeping = true;}
    
    public boolean wakeUp() { return this.sleeping = false; }
    
    public String getSetting() {  return this.setting;  }
    
    public int getAverageHeight() { return this.averageHeight; }
    
    public String eat() { return this.eatNoise;}
    
}