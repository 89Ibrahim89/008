package com.company;

public class Boss extends GameEntity{
    public String getInfo() {
        System.out.println("Был вызван weapon getInfo()");
        return "Тип оружия: "+ getInfo() +"Названия оружия: "+ getInfo();
    }

}
