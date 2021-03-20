package com.aym.week3;

public class StringExercises8 {
    public static void main(String[] args) {

        double a = 91.5;
        Double b = new Double(a);
        Double c = a;
        System.out.println("装箱后的结果为：" + b + "和" + c);
        Double d = new Double(87.0);
        double e = d.doubleValue()             ;
        double f = d               ;
        System.out.println("拆箱后的结果为：" + e + "和" + f);
    }

}
