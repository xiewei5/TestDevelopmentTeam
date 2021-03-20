package com.aym.week3;

import java.util.*;

public class StringExercises13 {
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        List<String> strList = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            int randomLenth = random.nextInt(10) + 1;
            StringBuffer sb=new StringBuffer();
            for (int j = 0; j <randomLenth ; j++) {
                int number=random.nextInt(62);
                sb.append(str.charAt(number));
            }
            strList.add(sb.toString());
        }
        Collections.sort(strList);
        for (String s : strList) {
            System.out.println(s);

        }

    }
}
