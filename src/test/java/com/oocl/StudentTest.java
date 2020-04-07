package com.oocl;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void shouldIntroduce() {
        String intro = "My Name is John. I am 18 years old. Coding for the glory of OOCL.";
        Student student1 = new Student(18, "John");
        Assert.assertEquals(intro, student1.introduce());
    }
}
