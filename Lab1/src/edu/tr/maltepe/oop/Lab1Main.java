package edu.tr.maltepe.oop;

public class Lab1Main {
    public static void main(String[] args){
        Professor p1 = new Professor("ensar", "gul", "oop");
        Professor p2 = new Professor("hamit", "topuz", "statistics");
        Student s1 = new Student("bilal ozgen", 5009);
        Student s2 = new Student("baran yeni", 1111);

        String s2Name = "s2's name is " + s2.getName();
        int s2Id = s2.getId();
        System.out.println(p1.getName());
        System.out.println(p1.getLecture());
        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s2Name);
        System.out.println(s2Id);
        System.out.println(p2.getName());
        System.out.println(p2.getLecture());
    }
}
