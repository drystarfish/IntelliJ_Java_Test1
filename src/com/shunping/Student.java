package com.shunping;

/**
 * Created by dryst on 2016/11/22.
 */

//将学生共有属性提出，做一个父类
public class Student {
    public int age;
    public String name;
    protected float fee;

    public void printName()
    {
        System.out.println("Name = "+this.name);
    }
}
