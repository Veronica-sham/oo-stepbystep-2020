package com.oocl;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class KlassTest {

    @Test
    public void shouldIntroduce() {
        Klass class2 = new Klass(2);
        Klass class3 = new Klass(3);

        Student student1 = new Student(18,"John");
        Student student2 = new Student(22, "Bob");
        class2.appendStudent(student1);
        class3.appendStudent(student2);
        student1.setClassNo(2);
        class2.assignLeader(student1);
        Boolean isThisStudent = true;
       // List<Student> students = new ArrayList<Student>();
       // students.add(student1);
       // students.add(student2);
        Teacher teacher1 = new Teacher(35, "Miss Chan");
        class2.assignTeacher(teacher1);
        class3.assignTeacher(teacher1);
        Assert.assertEquals(isThisStudent, class2.isTeacherOfKlass(teacher1));
    }
}
