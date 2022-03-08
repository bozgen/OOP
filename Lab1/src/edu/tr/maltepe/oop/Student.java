package edu.tr.maltepe.oop;

public class Student {
    private String name;
    private int id;

    Student( String name_, int id_){
        name = name_;
        id = id_;
    }

    public String getName() {
        return this.name;
    }
    public int getId(){
        return this.id;
    }
}
