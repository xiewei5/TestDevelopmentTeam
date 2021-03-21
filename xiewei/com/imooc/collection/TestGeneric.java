package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

    public List<Course> coures;

    public TestGeneric(){
        this.coures=new ArrayList<Course>();
    }

    public void testAdd(){
        Course cr1=new Course("1","语文");
        coures.add(cr1);
        //coures.add("sss");
        Course cr2=new Course("2","数学");
        coures.add(cr2);
    }
    public  void testForEach(){
        for(Course cr:coures){
            System.out.println(cr.id+":"+cr.name);
        }
    }

    public void testChild(){
        ChildCourse ccr=new ChildCourse();
        ccr.id="3";
        ccr.name="子类课程实例";
        coures.add(ccr);
    }

    public void testBasicType(){
        List<Integer> lt=new ArrayList<Integer>();
        lt.add(1);
        System.out.println("基本类型必须使用包装类作为泛型"+lt.get(0));
    }

    public static void main(String[] args) {
        TestGeneric tg=new TestGeneric();
        tg.testAdd();
        tg.testForEach();
        tg.testChild();
        tg.testForEach();
    }
}
