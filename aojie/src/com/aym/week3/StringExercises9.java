package com.aym.week3;

public class StringExercises9 {
    public static void main(String[] args) {
        double m = 78.5;
        String str1 = Double.toString(m);
        System.out.println("m 转换为String型后与整数20的求和结果为： "+(str1+20));
        String str = "180.20";
        Double a = Double.parseDouble(str);
        System.out.println("str 转换为double型后与整数20的求和结果为： "+(a+20));
    }
}
