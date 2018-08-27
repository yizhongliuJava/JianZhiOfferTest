package com.java.Test;

import java.util.Stack;


/**
 * 栈的使用
 *
 * @author liuyizhong
 * @date 2018/8/12 13:38
 */
public class TestStack {




    public static void main(String []args){
        Stack st = new Stack();//构建Stack对象
        TestStack tt = new TestStack();
        System.out.println(st.push(23));
        System.out.println(st.push(24));
        System.out.println(st.push(23));
        System.out.println(st.push(25));
        System.out.println(st.search(24));
        System.out.println(st);
        System.out.println("------------------先进后出");
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.empty());
    }





}
