package factory_kit;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by Administrator on 2016/5/13 0013.
 */
public interface WeaponFactory
{
    Weapon create(WeaponType name);

    static WeaponFactory factory(Consumer<Builder> consumer) {//Consumer是java8中的java.util.function包
        HashMap<WeaponType, Supplier<Weapon>> map = new HashMap<>();
        consumer.accept(map::put);
        return name -> map.get(name).get();
    }
}
