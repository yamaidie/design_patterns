package factory_method;

/**
 * Created by Administrator on 2016/5/14 0014.
 * 工厂方法定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中
 */
public class Test_factory_method
{
    private final Blacksmith blacksmith;

    public Test_factory_method(Blacksmith blacksmith)
    {
        this.blacksmith = blacksmith;
    }

    public static void main(String[] args){
        Test_factory_method test_factory_method;
        /*test_factory_method=new Test_factory_method(new Blacksmith()
        {
            @Override
            public Weapon manufactureWeapon(WeaponType weaponType)
            {
                return null;
            }
        });*/
        test_factory_method=new Test_factory_method(new Nights_Watch_Blacksmith());//具体实现，传参到构造函数
        test_factory_method.manufactureWeapons();
        System.out.println("\n");
        test_factory_method=new Test_factory_method(new Free_Folk_Blacksmith());
        test_factory_method.manufactureWeapons();
    }

    private void manufactureWeapons(){
        Weapon weapon;
        weapon = blacksmith.manufactureWeapon(WeaponType.SWORD);
        System.out.println(weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon);
        weapon=blacksmith.manufactureWeapon(WeaponType.Bow);
        System.out.print(weapon);
    }
}
