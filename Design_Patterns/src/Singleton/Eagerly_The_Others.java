package Singleton;

/**
 * Created by Administrator on 2016/5/14 0014.
 * 异鬼把死去的野人变成亡者大军真是惊心动魄
 */

/**
 * 饿汉式 优点：线程安全，缺点：类一加载就实例化，提前占用系统资源,jvm类加载：加载(装载)、验证、准备、初始化。
 * wiki:Eagerly(热切地) initialized static instance guarantees thread safety
 */
public final class Eagerly_The_Others
{
    private static final Eagerly_The_Others instance=new Eagerly_The_Others();

    private Eagerly_The_Others()//Private constructor so nobody can instantiate the class.保证了实例化对象只有一个
    {
    }
    public static Eagerly_The_Others getInstance() {
        return instance;
    }

    //第二种写法：利用静态内部类,由于内部静态类只会被加载一次，故该实现方式时线程安全的！
    // 觉得冗余，不知道为什么要这么写,认为相对上面的写法来讲不会在类加载的时候就完成实例化，要通过getInstance()完成。但是这样又变成了懒汉式。
    //懒汉式实现线程安全和饿汉式加快加载速度殊途同归。
   /* static class Nested{
        private static final Eagerly_The_Others instance=new Eagerly_The_Others();
    }

    public static Eagerly_The_Others getInstance() {
        return Nested.instance;
    }
*/

}
