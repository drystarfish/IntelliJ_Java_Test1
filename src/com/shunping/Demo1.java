package com.shunping;

/**
 * Created by dryst on 2016/11/22.
 * 说明继承
 */
public class Demo1 {

    public static void main(String []args)
    {
        Pupil p1=new Pupil();
    }
}


//小学生类
class Pupil extends Student
{
    //交学费
    public void pay(float fee)
    {
        this.fee=fee;
    }

}
//幼儿
class Kid extends Pupil{

}

//中学生类
class MiddleStu extends Student{

    //交学费
    public void pay(float fee)
    {
        this.fee=fee*0.8f;
    }

}

//大学生类
class ColStu{
    //定义成员属性
    private int age;
    private String name;
    private float fee;

    //交学费
    public void pay(float fee)
    {
        this.fee=fee*0.1f;
    }

}
