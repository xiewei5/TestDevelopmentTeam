package com.impooc.objectproject.sample1;

import com.impooc.objectproject.sample2.PackageSample02;

public class PackageSample03 {
    public static void main(String[] args) {
        //同一个包下的类无需import导入
        PackageSample01 packageSample01=new PackageSample01();
        PackageSample02 packageSample02=new PackageSample02();
        packageSample01.name="lily";
        packageSample01.sayGoodbye();
    }
}
