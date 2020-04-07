package com.oocl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Klass {
    private int number;
    private List<Student> students;
    private Student leader;
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList<Student>();
    }

    public void assignTeacher(Teacher teacher) {
        if (teacher.getCountClassNo() < 5) {
            this.teacher = teacher;
            teacher.addKlassNo();
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public boolean isTeacherOfKlass(Teacher teacher) {
        return (this.teacher == teacher);
    }

    public boolean isLeader(Student student) {
        return (leader == student);
    }

    public boolean haveThisStudent(Student student) {
        return (student.haveThisStudent(student));
    }

    public String appendStudent(final Student student) {
        String welSpeech = "";
        String studentWelSpeech = "";

        for (Student temp : this.students){
            studentWelSpeech = studentWelSpeech + temp.introduce()+ " Welcome " + student.getName() + " join Class " + this.number + "\n";
        }

        if (student.getClassNo() != number) {
            this.students.add(student);
            student.setClassNo(this.number);

            if (this.teacher != null) {
                welSpeech = this.teacher.introduce() + " Welcome " + student.getName() + " join Class " + this.number+"\n"+studentWelSpeech;

            }
            if (this.teacher == null) {
                welSpeech = " Welcome " + student.getName() + " join Class " + this.number+"\n"+studentWelSpeech;
            }
        }

        return (welSpeech);
    }

    public String assignLeader(Student student) {
        String announceLeader = "";
        String studentAnnounce = "";

        for (Student temp : this.students){
            studentAnnounce = studentAnnounce + temp.introduce()+ student.getName() + " is the leader of Class " + this.number+"."+"\n";
        }

        if (student.getClassNo() == this.number) {
            this.leader = student;
        }
        if (this.teacher != null) {
            announceLeader = this.teacher.introduce() + " " + student.getName() + " is the leader of Class " + this.number+". "+"\n"+ studentAnnounce;
        }
        if (this.teacher == null) {
            announceLeader = student.getName() + " is the leader of Class " + this.number+". "+"\n"+ studentAnnounce;
        }
        return announceLeader;
    }

    public List<Student> returnStudentList() {
        return this.students;
    }



}
