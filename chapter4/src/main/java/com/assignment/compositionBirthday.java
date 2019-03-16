package com.assignment;

public class compositionBirthday {

    private int day;
    private int month;
    private int year;

    public compositionBirthday(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public String toString(){

        return String.format("%d/%d/%d", day, month, year);
    }
}
