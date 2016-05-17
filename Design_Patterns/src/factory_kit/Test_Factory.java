package factory_kit;

/**
 * Created by Administrator on 2016/5/13 0013.
 * 基本的lambda表达式，
 * 背景是五王之战时期，罗柏.史塔克挥师南下，白港负责货币，兵器以及船队的建造
 */
public class Test_Factory
{
    public static void main(String[] args) {
        WeaponFactory factory = WeaponFactory.factory(builder -> {//接收builder类型返回后面
            builder.add(WeaponType.SWORD, Sword::new);//白港的工厂添加刀剑的产品线。Sword::new就是创建一个Sword类的构造函数的引用。
            // ::关键字获取方法或者构造函数的的引用
            builder.add(WeaponType.AXE, Axe::new);//白港的工厂添加斧子的产品线
            builder.add(WeaponType.BOW, Bow::new);//白港的工厂添加弓箭的产品线
        });
        Weapon axe = factory.create(WeaponType.AXE);//制造斧子
        System.out.println(axe);
    }
}
