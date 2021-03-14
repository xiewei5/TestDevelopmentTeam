package com.impooc.objectproject.sample4;

public class Hulk extends Mark1 {
    private  void repair(){
        System.out.println("弹射备件替换战损组件");

    }
    public static void main(String[] args) {
         Hulk  hulk=new Hulk();
         hulk.title="反浩克装甲";
         hulk.color="红色";
         hulk.movie="复仇者3";
         hulk.description();
         //hulk.fire();
         hulk.repair();
    }


}
