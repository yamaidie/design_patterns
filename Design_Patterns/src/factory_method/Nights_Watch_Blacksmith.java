package factory_method;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Nights_Watch_Blacksmith implements Blacksmith
{
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType)
    {
        return new Nights_Watch_Weapon(weaponType);
    }
}
