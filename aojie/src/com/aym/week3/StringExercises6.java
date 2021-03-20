package com.aym.week3;

public class StringExercises6 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        // 追加字符串
        s.append("jaewkjldfxmopzdm");

        // 从后往前每隔三位插入逗号
        for(int i = s.length()-3;i>0;i=i-3)
        {
            s.insert(i,',');
        }

        // 将StringBuilder对象转换为String对象并输出
        System.out.print(s.toString());
    }


}
