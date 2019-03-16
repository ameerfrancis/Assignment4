package com.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class compositionBirthdayTest {

    //compositionPerson person;
    compositionBirthday bd = new compositionBirthday(23, 7, 1995);

    @Before
    public void setUp() throws Exception {

        //person = new compositionPerson("Ameer", bd );
    }

    @Test
    public void toStringTest() {

        String result = bd.toString();

        Assert.assertEquals(result,"23/7/1995", bd);

    }
}