package factory_method;


/**
 * Created by Administrator on 2016/5/14 0014.
 */

/**
 * 野人天性自由，认为向国王或者领主下跪是不自由。
 * 最美野人：火吻而生的耶哥蕊特
 */
public class Free_Folk_Weapon implements Weapon
{
    private WeaponType weaponType;

    public Free_Folk_Weapon(WeaponType weaponType)
    {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Free_Folk制造了" + weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }

}
