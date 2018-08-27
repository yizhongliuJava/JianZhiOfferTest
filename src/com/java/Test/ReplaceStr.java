package com.java.Test;

import java.util.Stack;

/**
 * 替换字符转中的空格
 *
 * @author liuyizhong
 * @date 2018/8/12 12:23
 */
public class ReplaceStr {
    public static void main(String [] args){

      System.out.println(new ReplaceStr().replaceSpace(new StringBuffer("We Are Happy")));
    }
    public String replaceSpace(StringBuffer str){
        if (str ==null){
            return null;
        }
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i <str.length();i++){
            /*charAt(int index)方法是一个能够用来检索特定索引下的“字符”的String实例的方法.
                    charAt()方法返回指定索引位置的char值。索引范围为0~length()-1.
            如: str.charAt(0)检索str中的第一个字符,str.charAt(str.length()-1)检索最后一个字符.*/
            //System.out.println("哈哈"+str.charAt(i));
            if (String.valueOf(str.charAt(i)).equals(" ")){
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }

        return String.valueOf(sb);
    }



}
