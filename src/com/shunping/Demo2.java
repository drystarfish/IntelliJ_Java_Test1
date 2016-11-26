package com.shunping;

import javax.swing.*;
/**
 * Created by dryst on 2016/11/22.
 */
public class Demo2 extends JFrame{
    public static void main(String []args)
    {
        //Demo2 demo2=new Demo2();
        Abc abc1=new Abc();
        System.out.println(abc1.getMax(12, 4.5f));

    }

/*    public Demo2()
    {
        this.setVisible(true);
        this.setSize(200,200);
    }*/
}

class Abc
{
    //返回较大的整数
    public int getMax(int i, int j)
    {
        if(i>j)
        {
            return i;
        } else {
            return j;
        }
    }

    public float getMax(float a, float b)
    {
        if(a>b)
        {
            return a;
        }else{
            return b;
        }
    }
}
