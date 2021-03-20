package com.aym.week3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringExercises10  {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now= new Date();
        System.out.println(sdf1.format(now));
        System.out.println(sdf2.format(now));
        System.out.println(sdf3.format(now));
        String d = "2021-3-16 11:05:36";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(d);
        System.out.println(date);

    }
}
