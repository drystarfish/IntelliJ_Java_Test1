
package com.xiaoqiang;

import java.util.HashMap;

/**
 * Created by dryst on 2016/11/21.
 */
public class Test {
    public static void main(String []args)
    {
        HashMap hm=new HashMap();

        Dog d1=new Dog();
        System.out.println(d1.a);
    }
}

class Dog{
    public int a;
    protected String name;
    String color;
    private float price;

    public void ab1()
    {
        System.out.println(this.a);
    }
}
