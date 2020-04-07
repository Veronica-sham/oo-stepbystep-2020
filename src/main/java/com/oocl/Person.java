package com.oocl;

public class Person {
    public String name;
    public int age;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String introduce(){
        return ("My Name is "+ this.name +". I am "+ this.age+" years old.");
    }
}
