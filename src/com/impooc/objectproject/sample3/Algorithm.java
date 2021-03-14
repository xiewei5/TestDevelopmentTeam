package com.impooc.objectproject.sample3;

public class Algorithm<sout> {
    public  void  sort(int a,int b,int c,int d,int e){
        //冒泡排序算法
        int[]  arr={a,b,c,d,e};
        System.out.println(arr.length);
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
