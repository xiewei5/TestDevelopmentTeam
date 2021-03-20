package com.aym.week3;

public class StringExercises7 {
    public static void main(String[] args) {
        int score1 = 86;
        Integer score2 = new Integer(score1);
        double score3 = score2.doubleValue();
        float score4 = score2.floatValue();
        int score5 = score2.intValue();
        System.out.println("Integer包装类" + score2);
        System.out.println("double类型：" + score3);
        System.out.println("float类型：" + score4);
        System.out.println("int类型：" + score5);
    }
}
