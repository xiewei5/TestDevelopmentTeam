package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    public List<Course> coursesToSelect;

    private Scanner scan;

    public Student student;

    public SetTest(){
        coursesToSelect=new ArrayList<Course>();
        scan=new Scanner(System.in);
    }
    public void testAdd(){
        Course cr1=new Course("1","英语");
        coursesToSelect.add(cr1);
        Course tmp=(Course)coursesToSelect.get(0);
        //System.out.println("添加了课程\n"+tmp.id+":"+tmp.name);

        Course cr2=new Course("2","数学");
        coursesToSelect.add(0,cr2);
        Course tmp2=(Course) coursesToSelect.get(1);
        //System.out.println("添加了课程\n"+tmp2.id+":"+tmp2.name);


        //Course cr1_1=new Course("1","英语");
        //coursesToSelect.add(cr1_1);
        //Course tmp_1=(Course)coursesToSelect.get(2);
        //System.out.println("添加了课程\n"+tmp_1.id+":"+tmp_1.name);

        //Course cr3=new Course("3","物理");
        //coursesToSelect.add(4,cr3);

        Course[] crs={new Course("3","物理"),new Course("4","化学")};
        coursesToSelect.addAll(Arrays.asList(crs));
        Course tmp3=(Course) coursesToSelect.get(3);
        Course tmp4=(Course) coursesToSelect.get(4);
        //System.out.println("添加了两门课\n"+tmp3.id+":"+tmp3.name+"\n"+tmp4.id+":"+tmp4.name);

        Course[] crs2={new Course("5","生物"),new Course("6","语文")};
        coursesToSelect.addAll(2,Arrays.asList(crs2));
        Course tmp5=(Course) coursesToSelect.get(2);
        Course tmp6=(Course) coursesToSelect.get(3);
        //System.out.println("添加了两门课\n"+tmp3.id+":"+tmp5.name+"\n"+tmp6.id+":"+tmp4.name);

    }
    public void testForEach(){
        System.out.println("当前课程有(forEach)：");
        for(Object obj:coursesToSelect){
            Course cr=(Course) obj;
            System.out.println("课程:"+cr.id+":"+cr.name);
        }
    }
    public void testForEachForSet(Student student){
        System.out.println("共选择"+student.courses.size());
        for(Course cr:student.courses){
            System.out.println("选择了课程:"+cr.id+"-"+cr.name);
        }
    }
    public void testListContains(){
        Course cr=coursesToSelect.get(0);
        System.out.println("取得课程："+cr.name);
        System.out.println("备选课程中是否包含课程:"+cr.name+","+coursesToSelect.contains(cr));
        System.out.println("请输入课程名称");
        String name=scan.next().trim();
        Course cr2=new Course();
        cr2.name=name;
        System.out.println("新课程"+cr2.name+","+coursesToSelect.contains(cr2));
    }
    public void createStudentAndSelect(){
        Student s=new Student("1","jim");
        System.out.println("welcome:"+s.name);
        Scanner scan=new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println("请输入课程id:");
            String cid=scan.next();
            for(Course cr:coursesToSelect){
                if(cr.id.equals(cid)){
                    s.courses.add(cr);
                    //s.courses.add(cr);
                }
            }

            }
            testForEachForSet(s);
    }

    public void testSetContains(){
        System.out.println("请输入学生已选的课程名称");
        String name=scan.next();
        Course cr2=new Course();
        cr2.name=name;
        System.out.println("新课程"+cr2.name+","+student.courses.contains(cr2));
        if(coursesToSelect.contains(cr2)){
            System.out.println("课程："+cr2.name+"索引位置为："+coursesToSelect.indexOf(cr2));
        }
    }
    public static void main(String[] args) {
        SetTest st=new SetTest();
        st.testAdd();
        st.testListContains();
        //st.testForEach();
        //Student s=new Student("1","jim");
        //System.out.println("welcome:"+s.name);
        //Scanner scan=new Scanner(System.in);
//
        //for(int i=0;i<3;i++){
        //    System.out.println("请输入课程id:");
        //    String cid=scan.next();
        //    for(Course cr:st.coursesToSelect){
        //        if(cr.id.equals(cid)){
        //            s.courses.add(cr);
        //            //s.courses.add(cr);
        //        }
        //    }
//
        //    }
        //    st.testForEachForSet(s);
        //st.createStudentAndSelect();
        //st.testSetContains();
    }

    }

