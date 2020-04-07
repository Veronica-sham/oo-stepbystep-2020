package com.oocl;

public class Student extends Person{
    public Student(int age, String name) {
        super(age, name);
    }

    public String introduce(){
        return ("My Name is "+ this.name +". I am "+ this.age+" years old. Coding for the glory of OOCL.");
    }
}
