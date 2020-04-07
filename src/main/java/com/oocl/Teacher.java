package com.oocl;

public class Teacher extends Person{

    private int countClassNo;

    public Teacher(int age, String name) {
        super(age, name);
    }

    public void addKlassNo(){
        countClassNo++;
    }

    public int getCountClassNo(){
        return this.countClassNo;
    }

    public String introduce(){
        return ("My Name is "+ this.getName() +". I am "+ this.getAge()+" years old. Teaching for the future of world.");
    }
}
