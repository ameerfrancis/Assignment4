package com.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class compositionPersonTest {

    compositionPerson person;

    @Before
    public void setUp() throws Exception {
        compositionBirthday bd = new compositionBirthday(23, 7, 1995);
        person = new compositionPerson("Ameer", bd );
    }

    @Test
    public void toStringTest() {

        String result = person.toString();

        Assert.assertEquals(result,"My name is Ameer, my birthday is 23/7/1995", person);

    }
}