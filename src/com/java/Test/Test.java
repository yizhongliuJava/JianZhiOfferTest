package com.java.Test;

/**
 * 测试类
 *
 * @author liuyizhong
 * @date 2018/8/15 15:45
 */
public class Test {


    public static void main(String[] args) {

        //==号和equals()方法都是比较是否相等的方法，那它们有什么区别和联系呢？
        //首先，==号在比较基本数据类型时比较的是值，而用==号比较两个对象时比较的是两个对象的地址值：
        /*那equals()方法呢？
        我们可以通过查看源码知道，equals()方法存在于Object类中，
        因为Object类是所有类的直接或间接父类，也就是说所有的类中的equals()方法都继承自Object类，
        而通过源码我们发现，Object类中equals()方法底层依赖的是==号，那么，在所有没有重写equals()方法的类中，
        调用equals()方法其实和使用==号的效果一样，也是比较的地址值，
        然而，Java提供的所有类中，绝大多数类都重写了equals()方法，重写后的equals()方法一般都是比较两个对象的值：*/

        /*扩展*/
        /*根据上面所讲，第一个是true，第二个是false，确实如此，那继续看下面的例子：

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        这次的结果和上一个的是一样的吗？答案是：true true
        为什么第二个会是true呢？
        这就涉及到了内存中的常量池，
        常量池属于方法区的一部分，当运行到s1创建对象时，
        如果常量池中没有，就在常量池中创建一个对象”abc”,
        第二次创建的时候，就直接使用，所以两次创建的对象其实是同一个对象，它们的地址值相等。
        那上一个例子中的
        String str1 = new String("abc");
        是怎么回事呢？
        这里其实创建了两次对象，一次是在常量池中创建了对象”abc”，
        一次是在堆内存中创建了对象str1，所以str1和str2的地址值不相等*/
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("测试intern方法"+str2.intern());
        System.out.println(str1 +"    "+str2+"----");
        System.out.println("==比较"+str1 == str2);//比较对象的地址值
        System.out.println("equal比较"+str1.equals(str2));//因为重写了equals() ,所以比较了对象的  “  值  ”
        Integer a1 = 128;
        Integer b1 = 128;
        Integer a2 = -129;
        Integer b2 = -129;
        Integer c1 = 127;
        Integer c2 = 127;
        Integer d1 = -128;
        Integer d2 = -128;
        System.out.println(a1 ==b1);
        System.out.println(a1.equals(b1));
        System.out.println(c1.equals(c2));
        System.out.println(a2 ==b2);
        System.out.println(c1 ==c2);
        System.out.println(d1 ==d2);

        Object o = new Object();
        o = null ;
        System.out.println(o);
       /* String  str = "21654165315";
        byte[] sb = str.getBytes();
        System.out.println("5555"+sb);*/
        System.getProperty("sun.boot.class.path");
        String a = new String("ab"); // a 为一个引用
        System.out.println(a);
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        if (aa == bb) {
            System.out.println("aa==bb");
        }// true

        if (a == b) {
            System.out.println("a==b");
        } // false，非同一对象

        if (a.equals(b)) {
            System.out.println("aEQb");
        } // true

        if (42 == 42.0) { // true
            System.out.println("true");
        }

    }
}
