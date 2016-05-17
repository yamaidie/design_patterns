package factory_method;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Free_Folk_Blacksmith implements Blacksmith
{
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType)
    {
        return new Free_Folk_Weapon(weaponType);
    }
}
