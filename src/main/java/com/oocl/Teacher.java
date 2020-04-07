package com.oocl;

public class Teacher extends Person{

   /* private int age;
    private String name; */

    public Teacher(int age, String name) {
        super(age, name);
    }

    public String introduce(){
        return ("My Name is "+ this.getName() +". I am "+ this.getAge()+" years old. Teaching for the future of world.");
    }
}
