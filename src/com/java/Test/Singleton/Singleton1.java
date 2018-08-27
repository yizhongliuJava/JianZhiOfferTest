package com.java.Test.Singleton;

/**
 * 单例模式 饿汉式
 *
 * @author liuyizhong
 * @date 2018/8/14 16:38
 */
public class Singleton1 {

    //构造器私有  Singleton通过将构造方法限定为private避免了类在外部被实例化
    private Singleton1() {
    }

    ;
    //实例化对象 懒加载方式
    private static Singleton1 singleton = null;

    //同步防止多线程出现多个实例  一方面在获取单例的时候，要保证不能产生多个实例对象
    // 静态工厂方法
    synchronized public static Singleton1 getSingleton() {

        if (singleton == null) {
            singleton = new Singleton1();
            return singleton;
        }
        return singleton;
    }
 /*   单件模式用途：
    单件模式属于工厂模式的特例，只是它不需要输入参数并且始终返回同一对象的引用。
    单件模式能够保证某一类型对象在系统中的唯一性，即某类在系统中只有一个实例。
    它的用途十分广泛，打个比方，我们开发了一个简单的留言板，
    用户的每一次留言都要将留言信息写入到数据库中，最直观的方法是每次写入都建立一个数据库的链接。
    这是个简单的方法，在不考虑并发的时候这也是个不错的选择。
    但实际上，一个网站是并发的，并且有可能是存在大量并发操作的。
    如果我们对每次写入都创建一个数据库连接，那么很容易的系统会出现瓶颈，
    系统的精力将会很多的放在维护链接上而非直接查询操作上。这显然是不可取的。
    如果我们能够保证系统中自始至终只有唯一一个数据库连接对象，
    显然我们会节省很多内存开销和cpu利用率。
    这就是单件模式的用途。当然单件模式不仅仅只用于这样的情况。*/
}
