package com.assignment;

public class compositionPerson {

    private String name;
    private compositionBirthday birthday;

    public compositionPerson(String n, compositionBirthday bd){
        name = n;
        birthday = bd;
    }

    public String toString(){
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }


}
