package com.oocl;

public class Person {
    private String name;
    private int age;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String setName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int setAge(){
        return this.age;
    }

    public String introduce(){
        return ("My Name is "+ this.getName() +". I am "+ this.getAge()+" years old.");
    }
}
