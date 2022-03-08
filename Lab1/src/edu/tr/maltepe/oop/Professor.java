package edu.tr.maltepe.oop;

public class Professor {
    private String firstName;
    private String lastName;
    private String lecture;

    Professor( String firstName_, String lastName_, String lecture_ ){
        firstName = firstName_;
        lastName = lastName_;
        lecture = lecture_;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }
    public String getLecture(){
        return this.lecture;
    }
}
