package edu.tr.maltepe.oop;

import java.util.ArrayList;

public class SportsCenter {
    private String name;
    private String footballField;
    private String swimmingPool;

    SportsCenter(String name_, String footballField_, String swimmingPool_){
        name = name_;
        footballField = footballField_;
        swimmingPool = swimmingPool_;
    }
    /* GETTER AND SETTER METHODS*/
    public String getFootballField() {
        return footballField;
    }
    public void setFootballField(String footballField) {
        this.footballField = footballField;
    }
    public String getSwimmingPool() {
        return swimmingPool;
    }
    public void setSwimmingPool(String swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    /* END OF GETTER AND SETTER METHODS */
}
