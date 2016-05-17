package Singleton;

/**
 * Created by Administrator on 2016/5/14 0014.
 * 单例常用于model层，get,set方法，有饿汉式（在静态内部类中），懒汉式（用得最多了，在多线程中可能创建多个实例，所以不是线程安全的，一般用synchronized线程同步）以及双重锁式
 *
 */
public class Test_Singleton
{
//一个单例跟着三步，最简单有效的设计模式
    public static void main(String[] args){
        //饿汉式
        Eagerly_The_Others eagerly_the_others1=Eagerly_The_Others.getInstance();//尸鬼1
        Eagerly_The_Others eagerly_the_others2=Eagerly_The_Others.getInstance();//尸鬼2
        System.out.print("Wights:"+eagerly_the_others1+"\n");
        System.out.print("Wights:"+eagerly_the_others2+"\n");

        //懒汉式
        Lazy_The_Others lazy_the_others1=Lazy_The_Others.getInstance();
        Lazy_The_Others lazy_the_others2=Lazy_The_Others.getInstance();
        System.out.print("Wights:"+lazy_the_others1+"\n");
        System.out.print("Wights:"+lazy_the_others2+"\n");

        //双重锁式
        DoubleCheckLocking_The_Others doubleCheckLocking_the_others1=DoubleCheckLocking_The_Others.getInstance();
        DoubleCheckLocking_The_Others doubleCheckLocking_the_others2=DoubleCheckLocking_The_Others.getInstance();
        System.out.print("Wights:"+doubleCheckLocking_the_others1+"\n");
        System.out.print("Wights:"+doubleCheckLocking_the_others2);
    }

}
