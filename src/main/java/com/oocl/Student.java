package com.oocl;

public class Student extends Person{

    private int classNo;

    public Student(int age, String name) {
        super(age, name);
    }

    public String introduce(){
        return ("My Name is "+ this.getName() +". I am "+ this.getAge()+" years old. I am a student of class "+this.getClassNo()+". Coding for the glory of OOCL.");
    }

    public boolean haveThisStudent(Student student) {
        return true;
    }

    public int getClassNo() {
        return this.classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }
}
