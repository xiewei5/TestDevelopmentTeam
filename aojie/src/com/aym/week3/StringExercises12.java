package com.aym.week3;

public class StringExercises12 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int num : nums) {
            num = (int) (Math.random() * 10);
            System.out.println(num);
        }
    }
}
