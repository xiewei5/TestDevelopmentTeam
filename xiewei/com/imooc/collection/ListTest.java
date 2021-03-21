package com.imooc.collection;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public List coursesToSelect;

    public ListTest() {
        this.coursesToSelect=new ArrayList();
    }

    public void testAdd(){
        Course cr1=new Course("1","英语");
        coursesToSelect.add(cr1);
        Course tmp=(Course)coursesToSelect.get(0);
        System.out.println("添加了课程\n"+tmp.id+":"+tmp.name);

        Course cr2=new Course("2","数学");
        coursesToSelect.add(0,cr2);
        Course tmp2=(Course) coursesToSelect.get(1);
        System.out.println("添加了课程\n"+tmp2.id+":"+tmp2.name);


        Course cr1_1=new Course("1","英语");
        coursesToSelect.add(cr1_1);
        Course tmp_1=(Course)coursesToSelect.get(2);
        System.out.println("添加了课程\n"+tmp_1.id+":"+tmp_1.name);

        //Course cr3=new Course("3","物理");
        //coursesToSelect.add(4,cr3);

        Course[] crs={new Course("3","物理"),new Course("4","化学")};
        coursesToSelect.addAll(Arrays.asList(crs));
        Course tmp3=(Course) coursesToSelect.get(3);
        Course tmp4=(Course) coursesToSelect.get(4);
        System.out.println("添加了两门课\n"+tmp3.id+":"+tmp3.name+"\n"+tmp4.id+":"+tmp4.name);

        Course[] crs2={new Course("5","生物"),new Course("6","语文")};
        coursesToSelect.addAll(2,Arrays.asList(crs2));
        Course tmp5=(Course) coursesToSelect.get(2);
        Course tmp6=(Course) coursesToSelect.get(3);
        System.out.println("添加了两门课\n"+tmp3.id+":"+tmp5.name+"\n"+tmp6.id+":"+tmp4.name);

    }

    public void testGet(){
        int size=coursesToSelect.size();
        System.out.println("当前课程有：");
        for(int i=0;i<size;i++){
            Course cr=(Course)coursesToSelect.get(i);
            System.out.println("课程:"+cr.id+":"+cr.name);
        }

    }

    public void testIterator(){
        Iterator it=coursesToSelect.iterator();
        System.out.println("当前课程有(迭代器)：");
        while(it.hasNext()){
            Course cr=(Course)it.next();
            System.out.println("课程:"+cr.id+":"+cr.name);
        }
    }
    public void testForEach(){
        System.out.println("当前课程有(forEach)：");
        for(Object obj:coursesToSelect){
            Course cr=(Course) obj;
            System.out.println("课程:"+cr.id+":"+cr.name);
        }
    }

    public void testModify(){
        coursesToSelect.set(4,new Course("7","政治"));
    }

    public void testRemove(){
        //Course cr=(Course)coursesToSelect.get(4);
        //System.out.println("待删除："+cr.id+":"+cr.name);
        //coursesToSelect.remove(cr);
        //System.out.println("即将删除4位置");
        System.out.println("即将删除4和5位置元素");
        Course[] coures={(Course)coursesToSelect.get(4),(Course)coursesToSelect.get(5)};
        //coursesToSelect.remove(4);
        coursesToSelect.removeAll(Arrays.asList(coures));
        System.out.println("删除成功");
        testForEach();
    }

    public void testType(){
        System.out.println("能否往List中添加奇怪的东西");
        coursesToSelect.add("我不是课程，我是字符串");
    }

    public static void main(String[] args) {
        ListTest lt=new ListTest();
        lt.testAdd();
        lt.testType();
        //lt.testGet();
        //lt.testIterator();
        //lt.testModify();
        lt.testForEach();
    }
}
