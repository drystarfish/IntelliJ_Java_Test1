package com.shunping;

/**
 * Created by dryst on 2016/11/23.
 */
public class Demo3 {

    public static void main(String []args)
    {
        Cat cat1 = new Cat();
        cat1.cry();
        Dog dog1 = new Dog();
        dog1.cry();
    }
}

//动物类
class Animal
{
    int age;
    String name;
    //都会叫
    public void cry()
    {
        System.out.println("I am a kind of animal, but i don't know how to cry!");
    }
}

//猫
class Cat extends Animal
{
    //覆盖父类
    public void cry()
    {
        System.out.println("Miao");
    }
}

//狗
class Dog extends Animal
{
    //覆盖父类
    public void cry()
    {
        System.out.println("Bark");
    }
}