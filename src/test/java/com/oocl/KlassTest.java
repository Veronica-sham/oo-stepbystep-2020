package com.oocl;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KlassTest {

    @Test
    public void studentInKlass() {
        Klass class2 = new Klass(2);
        Student student1 = new Student(18,"John");
        Student student2 = new Student(22, "Bob");
        class2.appendStudent(student1);
        class2.appendStudent(student2);
        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        Assert.assertEquals(students, class2.returnStudentList());
    }


    @Test
    public void isLeaderOrNot() {
        Klass class2 = new Klass(2);
        Klass class3 = new Klass(3);
        Student student1 = new Student(18,"John");
        Student student2 = new Student(22, "Bob");
        class2.appendStudent(student1);
        class3.appendStudent(student2);
        class2.assignLeader(student1);
        Boolean isThisStudent = true;
        Assert.assertEquals(isThisStudent, class2.isLeader(student1));
    }

    @Test
    public void isTeacherOrNot() {
        Klass class2 = new Klass(2);
        Klass class3 = new Klass(3);

        Student student1 = new Student(18,"John");
        Student student2 = new Student(22, "Bob");
        Boolean isTheTeacher = true;
        Teacher teacher1 = new Teacher(35, "Miss Chan");
        class2.assignTeacher(teacher1);
        class3.assignTeacher(teacher1);
        Assert.assertEquals(isTheTeacher, class2.isTeacherOfKlass(teacher1));
    }

    @Test
    public void studentJoinKlass() {
        Klass class2 = new Klass(2);
        Student student1 = new Student(18,"John");
        Teacher teacher1 = new Teacher(35, "Miss Chan");
        class2.assignTeacher(teacher1);
        String welcome = "My Name is Miss Chan. I am 35 years old. Teaching for the future of world. Welcome John join Class 2";
        Assert.assertEquals(welcome, class2.appendStudent(student1));
    }

    @Test
    public void welcomeLeader() {
        Klass class2 = new Klass(2);
        Student student1 = new Student(18,"John");
        Teacher teacher1 = new Teacher(35, "Miss Chan");
        class2.assignTeacher(teacher1);
        String welcome = "My Name is Miss Chan. I am 35 years old. Teaching for the future of world. John is the leader of Class 2";
        Assert.assertEquals(welcome, class2.assignLeader(student1));
    }

    @Test
    public void studentJoinKlassWithStudentIntro() {
        Klass class2 = new Klass(2);
        Student student1 = new Student(18,"John");
        Student student2 = new Student(23,"Mary");
        Teacher teacher1 = new Teacher(35, "Miss Chan");
        class2.assignTeacher(teacher1);
        class2.appendStudent(student2);
        String welcome = "My Name is Miss Chan. I am 35 years old. Teaching for the future of world. Welcome John join Class 2\n" +
                "My Name is Mary. I am 23 years old. I am a student of class 2. Coding for the glory of OOCL. Welcome John join Class 2\n";
        Assert.assertEquals(welcome, class2.appendStudent(student1));
    }

    @Test
    public void assignLeaderWithStudentIntro() {
        Klass class2 = new Klass(2);
        Student student1 = new Student(18,"John");
        Student student2 = new Student(23,"Mary");
        Teacher teacher1 = new Teacher(35, "Miss Chan");
        class2.assignTeacher(teacher1);
        class2.appendStudent(student2);
        String welcome = "My Name is Miss Chan. I am 35 years old. Teaching for the future of world. John is the leader of Class 2. \n" +
                "My Name is Mary. I am 23 years old. I am a student of class 2. Coding for the glory of OOCL.John is the leader of Class 2.\n";
        Assert.assertEquals(welcome, class2.assignLeader(student1));
    }


}
