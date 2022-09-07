package com.company;

public class GameUnity {
    private int HP;
    private int DM;

    public int getHP() {
        return HP;
    }

    public void setHealth(int hp) {
        this.HP = hp;
    }

    public int getDamage() {
        return DM;
    }

    public void setDamage(int dm) {
        this.DM = dm;
    }

    public String info(){
        return  HP + " " + DM;
    }
}