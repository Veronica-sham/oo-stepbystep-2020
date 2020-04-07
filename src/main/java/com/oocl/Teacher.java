package com.oocl;

public class Teacher extends Person{

    public Teacher(int age, String name) {
        super(age, name);
    }

    public String introduce(){
        return ("My Name is "+ this.name +". I am "+ this.age+" years old. Teaching for the future of world.");
    }
}
