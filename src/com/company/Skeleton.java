package com.company;

public class Skeleton extends Boss {
    private int strely;

    public int strely() {
        return strely;
    }
    public void strely(int strely) {
        this.strely = strely;
    }
    public String info()   {
        return super.info() + " " + strely;
    }
}