package com.assignment;

public class compositionMain {

    public static void main( String[] args )
    {
        compositionBirthday birthday = new compositionBirthday(23,7,1995);
        compositionPerson person = new compositionPerson("Ameer",birthday);

        System.out.println(person);
    }
}
