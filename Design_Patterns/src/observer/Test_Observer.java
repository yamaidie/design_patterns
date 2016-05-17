package observer;

/**
 * Created by Administrator on 2016/5/11 0011.
 * 点击事件就是一个常用的观察者模式
 */
public class Test_Observer
{
    public static void main(String[] args){
        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

    }
}
