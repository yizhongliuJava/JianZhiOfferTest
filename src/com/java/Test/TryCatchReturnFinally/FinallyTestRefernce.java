package com.java.Test.TryCatchReturnFinally;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * return和finally  返回的是list，map，自定义类、引用类型等
 *
 * @author liuyizhong
 * @date 2018/8/20 19:03
 */
public class FinallyTestRefernce {



    public static List<String> test() {
                  //test();
        List<String> strlist = new ArrayList<String>();
        strlist.add("zs");
        strlist.add("ls");
        strlist.add("ww");
        strlist.add("mz");
        try {
            strlist.add("wq");
            return strlist;
        } finally {
            strlist.add("yyy");
        }
    }
    public static void main(String[] args) {

        try {
            int nowTime=(int)(System.currentTimeMillis()/1000);

            System.out.println(new SimpleDateFormat("MM-dd HH:mm:ss").format(new Date(1535102265*1000)));
            FinallyTestRefernce finallyTestRefernce = new FinallyTestRefernce();
            System.out.println("返回的是List集合"+finallyTestRefernce.test());
        } catch (Exception e) {
            e.printStackTrace();
        }
      /*  while(true){
       new FinallyTestRefernce().test();
        }*/
    }
}
