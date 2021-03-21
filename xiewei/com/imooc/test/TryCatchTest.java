package com.imooc.test;

public class TryCatchTest{
    public int test(){
        int divider=10;
        int result=100;
        try{
            while(divider>-1){
                divider--;
                result=result+100/divider;
            }
            return result;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("循环跑出异常了");
            return -1;
        }
    }
    public int test2(){
        int divider=10;
        int result=100;
        try{
            while(divider>-1){
                divider--;
                result=result+100/divider;
            }
            return result;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("循环跑出异常了");
            return 999;
        }finally{
            System.out.println("这是finally"+result);
        }
    }
    public int test3(){
        int divider=10;
        int result=100;
        try{
            while(divider>-1){
                divider--;
                result=result+100/divider;
            }
            return result;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("循环跑出异常了");
        }finally{
            System.out.println("这是finally"+result);
        }
        System.out.println("test3()运行完毕");
        return 1111;
    }


    public static void main(String[] args){
        TryCatchTest tct=new TryCatchTest();
        int result=tct.test();
        System.out.println("test()方法，执行完毕！返回值为："+result);
        int result2=tct.test2();
        System.out.println("test2()方法");
        int result3=tct.test3();
        System.out.println("test3()方法");
    }
}