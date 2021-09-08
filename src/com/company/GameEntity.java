package com.company;

public class GameEntity{
    String Boss, Hero;
    private String Health;
    private String Damage;
    private String Power;

    public String getBoss() {
        return Boss;
    }

    public void setBoss(String boss) {
        Boss = boss;
    }

    public String getHero() {
        return Hero;
    }

    public void setHero(String hero) {
        Hero = hero;
    }

    public String getHealth() {
        return Health;
    }

    public void setHealth(String health) {
        Health = health;
    }

    public String getDamage() {
        return Damage;
    }

    public void setDamage(String damage) {
        Damage = damage;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }
}
