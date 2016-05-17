package adapter;

/**
 * Created by Administrator on 2016/5/15 0015.
 * 装饰模式是对核心对象或者功能的扩展，适配器模式是把对象或者功能放到一个新对象中引用
 * 书有线装版，有精装版，有日文版，有英文版，其中线装版和精装版就是装饰模式，日文版和英文版就是适配器模式
 */

/**
 * 背景：野人经常进攻，需要合格的守夜人进行战斗，但是我们只有总司令和罪犯（以前有荣誉感的骑士会加入。现在大部分是罪犯）
 * 总司令只能指挥有荣誉感和可以战斗的守夜人，罪犯虽然可以战斗，但是没有荣誉感。需要把罪犯改造成守夜人。
 */

/**
 * 1 目标接口（Target）：客户所期待的接口。目标可以是具体的或抽象的类，也可以是接口。
 * 2 需要适配的类（Adaptee）：需要适配的类或适配者类。
 * 3 适配器（Adapter）：通过包装一个需要适配的对象，把原接口转换成目标接口。
 */
public class Test_Adapter
{
    public static void main(String[] args) {
        Commander commander=new Commander(new New_Nights_Watch());//New_Nights_Watch能满足Commander的Nights_Watch要求
        commander.fight();//能指挥他们战斗
        System.out.print("\n");
        commander.honor();//使他们变得有责任感
    }
}
