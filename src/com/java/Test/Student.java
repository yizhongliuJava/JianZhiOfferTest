package com.java.Test;

/**
 * 子类
 *
 * @author liuyizhong
 * @date 2018/8/7 14:13
 */
public class Student extends Parent {
    // 静态变量
    public static String s_StaticField = "子类--静态变量";
    // 变量
    public String s_Field = "子类--变量";
    // 静态初始化块
    static {
        System.out.println(s_StaticField);
        System.out.println("子类--静态初始化块");
    }
    // 初始化块
    {
        System.out.println(s_Field);
        System.out.println("子类--初始化块");
    }

    // 构造器
    public Student() {
        System.out.println("子类--构造器");
    }

    public static void eat() {
        System.out.println("多态-静态方法调用-吃儿子的狗屎");
    }
    // 程序入口
    public static void main(String[] args) {
       //Student parent =  new Student();
       Parent parent1 = new Student();
       parent1.eat();
    }

}
