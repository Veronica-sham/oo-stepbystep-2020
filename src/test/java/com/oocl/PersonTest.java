package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void shouldIntroduce() {
        String intro = "My Name is John. I am 18 years old.";
        Person normalPerson = new Person(18, "John");
        Assert.assertEquals(intro, normalPerson.introduce());
    }
}
