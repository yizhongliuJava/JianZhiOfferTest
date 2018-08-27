package com.java.Test;

/**
 * 父类
 *
 * @author liuyizhong
 * @date 2018/8/7 14:13
 */
public class Parent {
    // 静态变量
    public static String p_StaticField = "父类--静态变量";
    // 变量
    public String p_Field = "父类--变量";

    // 静态初始化块
    static {
        System.out.println(p_StaticField);
        System.out.println("父类--静态初始化块");
    }

    // 初始化块
    {
        System.out.println(p_Field);
        System.out.println("父类--初始化块");
    }

    // 构造器
    public Parent() {
        System.out.println("父类--构造器");
    }

    public static void eat() {
        System.out.println("多态-静态方法调用-吃父亲的狗屎");
    }
}
