package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student>{
    public String id;
    public String name;
    public Set<Course> courses;
    public Student(String id,String name){
        this.id=id;
        this.name=name;
        this.courses=new HashSet<Course>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
