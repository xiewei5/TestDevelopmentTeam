package com.imooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    public Map<String,Student>students;

    private Scanner scan;

    public MapTest() {
        this.students=new HashMap<String,Student>();
        this.scan=new Scanner(System.in);
    }

    public void testPut(){
        Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<3){
            System.out.println("请输入学生ID：");
            String id=scan.next();
            Student st=students.get(id);
            if (st==null){
                System.out.println("请输入学生name:");
                String name=scan.next();
                Student newSt=new Student(id,name);
                students.put(id,newSt);
                System.out.println("成功添加学生:"+students.get(id).name);
                i++;
            }else{
                System.out.println("该学生ID被占用！");
                continue;
            }
        }
    }

    public  void testKeySet(){
        Set<String> keyset=students.keySet();
        System.out.println("共有："+keyset.size()+"个学生");
        for(String stid:keyset){
            Student st=students.get(stid);
            if(st!=null) {
                System.out.println("学生："+st.name);
            }
        }
    }

    public void testRemove(){

        Scanner scan=new Scanner(System.in);
        String id=scan.next();
        while(true){
            System.out.println("请输入要删除的学生Id：");
            Student st=students.get(id);
            if(st==null){
                System.out.println("输入的Id不存在，清重新输入：");
                continue;
            }
            students.remove(id);
            System.out.println("成功删除"+st.name);
            break;
        }

    }

    public void testEntrySet(){
        Set<Entry<String,Student>> entrySet=students.entrySet();
        for(Entry<String,Student> entry:entrySet){
            System.out.println("取得键:"+entry.getKey());
            System.out.println("值："+entry.getValue().name);
        }
    }

    public void testModify(){
        System.out.println("请输入要修改的学生Id:");
        Scanner scan=new Scanner(System.in);
        while(true){
            String id=scan.next();
            Student st=students.get(id);
            if (st==null){
                System.out.println("该Id不存在，请重新输入:");
                continue;
            }
            System.out.println("该学生为："+st.name);
            System.out.println("请输入新的姓名：");
            String name=scan.next();
            Student newst=new Student(id,name);
            students.put(id,newst);
            System.out.println("修改成功");
            break;
        }

    }

    public void testContainsKeyOrValue(){
        System.out.println("请输入Id:");
        String id=scan.next();
        System.out.println("输入的id："+id+"在学生映射表中是否存在"+students.containsKey(id));
        if (students.containsKey(id)){
            System.out.println("name为:"+students.get(id).name);
        }
        System.out.println("请输入name:");
        String name=scan.next();

        if (students.containsValue(new Student(null,name))){
            System.out.println("name为:"+name);

        }else{
            System.out.println("不存在");
        }
    }

    public static void main(String[] args) {
        MapTest mt=new MapTest();
        mt.testPut();
        mt.testKeySet();
        //mt.testRemove();
        //mt.testEntrySet();
        //mt.testModify();
        //mt.testEntrySet();
        mt.testContainsKeyOrValue();
    }
}
