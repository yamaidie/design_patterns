package Singleton;

/**
 * Created by Administrator on 2016/5/14 0014.
 * 没有在类加载的时候就创建对象，而是在真正要使用到这个对象的时候再去获取，优点在于如果这个创建对象过程很费时，那么一开始就创建会浪费较多时间
 */

/**
 * 懒汉式：用得最多了，在多线程中可能创建多个实例，所以不是线程安全的，一般用synchronized线程同步
 */
public final class Lazy_The_Others
{
    private static Lazy_The_Others instance;//1.私有静态声明

    private Lazy_The_Others()//2.私有构造方法，保证了实例化对象只有一个
    {
    }
    public static synchronized Lazy_The_Others getInstance(){//3.synchronized线程同步,阻止使用过程被其它线程使用
        if (instance == null) {
            instance = new Lazy_The_Others();
        }
        return instance;
    }

    //第二种写法：利用静态内部类的特性实现静态内部类
    //感觉这样就是饿汉式，写代码不这样写。
/*    private static class Nested{
        private static Lazy_The_Others lazy_the_others=new Lazy_The_Others();
    }
    public static Lazy_The_Others getInstance(){
        return Nested.lazy_the_others;
    }*/
}
