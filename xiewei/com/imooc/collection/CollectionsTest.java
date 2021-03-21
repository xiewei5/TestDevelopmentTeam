package com.imooc.collection;

import java.util.*;

public class CollectionsTest {
    public void testSort1(){
        List<Integer> i_list=new ArrayList<Integer>();
        Random rd=new Random();
        Integer k;
        for(int i=0;i<10;i++){
            do{
                k=rd.nextInt(100);
            }while (i_list.contains(k));
            i_list.add(k);
            System.out.println("添加整数"+k);
        }
        System.out.println("---------排序前-----------");
        for(Integer i:i_list){
            System.out.println(i);
        }
        Collections.sort(i_list);
        System.out.println("---------排序后-----------");
        for(Integer i:i_list){
            System.out.println(i);
        }
    }
    public void testSort2(){
        List<String> s_list=new ArrayList<String>();
        s_list.add("xxxx");
        s_list.add("wwww");
        s_list.add("yyyy");
        System.out.println("---------排序前-----------");
        for(String s:s_list){
            System.out.println(s);
        }
        Collections.sort(s_list);
        System.out.println("---------排序后-----------");
        for(String s:s_list){
            System.out.println(s);
        }
    }

    public void testSort3(){
        List<Student> studentList=new ArrayList<Student>();
        Random rnd=new Random();
        studentList.add(new Student(rnd.nextInt(100)+"","jack"));
        studentList.add(new Student(rnd.nextInt(100)+"","tom"));
        studentList.add(new Student(rnd.nextInt(100)+"","bob"));
        System.out.println("-----------排序前---------------");
        for(Student s:studentList){
            System.out.println("学生："+s.id+":"+s.name);
        }
        Collections.sort(studentList);
        System.out.println("-----------排序后-------------");
        for(Student s:studentList) {
            System.out.println("学生：" + s.id + ":" + s.name);
        }
        Collections.sort(studentList,new StudentComparator());
        System.out.println("---------按姓名排序后------------------");
        for(Student s:studentList) {
            System.out.println("学生：" + s.id + ":" + s.name);
        }
    }
    public static void main(String[] args) {
        CollectionsTest ct=new CollectionsTest();
        //ct.testSort1();
        //ct.testSort2();
        ct.testSort3();
    }
}
