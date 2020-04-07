package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private List<Student> students;
    private Student leader;
    private Teacher teacher;

    public Klass(int number){
        this.number = number;
        this.students = new ArrayList<Student>();
    }

    public void assignTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }
    public Student getLeader(){
        return leader;
    }

    public boolean isTeacherOfKlass(Teacher teacher){
        return (this.teacher == teacher);
    }

    public boolean isLeader(Student student){
        return (leader == student);
    }

    public boolean haveThisStudent(Student student){
        return (student.haveThisStudent(student));
    }

    public void appendStudent(Student student){
        if (student.getClassNo() != number){
            this.students.add(student);
        }
    }

    public void assignLeader(Student student){
        if (student.getClassNo() == this.number){
            this.leader = student;
        }

    }

    public List<Student> returnStudentList(){
        return this.students;
    }

}
