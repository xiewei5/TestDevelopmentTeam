package com.aym.week3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringExercises11 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
