package com.oocl;
import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void shouldIntroduce() {
        String intro = "My Name is John. I am 18 years old. Teaching for the future of world. ";
        Teacher teacher1 = new Teacher(18, "John");
        Assert.assertEquals(intro, teacher1.introduce());
    }
}
