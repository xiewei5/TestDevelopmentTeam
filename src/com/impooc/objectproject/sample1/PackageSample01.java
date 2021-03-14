package com.impooc.objectproject.sample1;

public class PackageSample01 {
    public  String name;
    private  void sayhello(){
        System.out.println("hello world!");
    }
    void sayGoodbye(){
        System.out.println("Good bye!");
    }

    public static void main(String[] args) {
        PackageSample01 packageSample01=new PackageSample01();
        packageSample01.sayhello();
    }

}
