package factory_kit;

import java.util.function.Supplier;

/**
 * Created by Administrator on 2016/5/13 0013.
 */
public interface Builder
{
    void add(WeaponType name, Supplier<Weapon> supplier);//supplier提供Weapon对象
}
