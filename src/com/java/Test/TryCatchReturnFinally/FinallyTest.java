package com.java.Test.TryCatchReturnFinally;

/**
 * return和finally测试返回结果  返回的是基本数据类型
 *
 * @author liuyizhong
 * @date 2018/8/20 19:02
 */
public class FinallyTest {


    /*在try语句中，try要把返回的结果放置到不同的局部变量当中，
    执行finaly之后，从中取出返回结果，因此，即使finaly中对变量进行了改变，
    但是不会影响返回结果，因为使用栈保存返回值，即使在finaly当中进行数值操作，
    但是影响不到之前保存下来的具体的值，所以return影响不了基本类型的值，这里使用的栈保存返回值。
    而如果修改list，map，自定义类等引用类型时，在进入了finaly之前保存了引用的地址，
    所以在finaly中引用地址指向的内容改变了，影响了返回值*/

    /*总结：
         1.影响返回结果的前提是在 非 finally 语句块中有 return 且非基本类型
         2.不影响返回结果 的前提是 非 finally 块中有return 且为基本类型
   究其本质 基本类型在栈中存储,返回的是真实的值,而引用类型返回的是其浅拷贝堆地址.所以才会改变。
        return的若是对象，则先把对象的副本保存起来，
        也就是说保存的是指向对象的地址。
        若对原来的对象进行修改。对象的地址仍然不变，return的副本仍然是指向这个对象，所用finally中对对象的修改仍然有作用。
        而基本数据类型保存的是原原本本的数据，return保存副本后，在finally中修改都是修改原来的数据。副本中的数据还是不变，
        所以finally中修改对return无影响。*/
    public static void main(String[] args) {
        System.out.println(new FinallyTest().test());;
    }
    static int test()
    {
        int x = 1;
        try
        {
            x++;
            return x;
        }
        finally
        {
            ++x;//因为x基本数据类型,所以保存在栈中的值不变,所以返回结果不会变
        }
    }

}
