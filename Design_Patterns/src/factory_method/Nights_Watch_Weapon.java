package factory_method;

/**
 * Created by Administrator on 2016/5/14 0014.
 */

/*
长夜将至，我从今开始守望，至死方休。
我将不娶妻、不封地、不生子。我将不戴宝冠，不争荣宠。
我将尽忠职守，生死于斯。
我是黑暗中的利剑，长城上的守卫，抵御寒冷的烈焰，破晓时分的光线，唤醒眠者的号角，守护王国的坚盾。
我将生命与荣耀献给守夜人，今夜如此，夜夜皆然。
Night gathers, and now my watch begins. It shall not end until my death.
I shall take no wife, hold no lands, father no children. I shall wear no crowns and win no glory.
I shall live and die at my post.
I am the sword in the darkness. I am the watcher on the walls. I am the fire that burns against the cold, the light that brings the dawn, the horn that wakes the sleepers, the shield that guards the realms of men.
I pledge my life and honor to the Night's Watch, for this night and all the nights to come."）
*/

public class Nights_Watch_Weapon implements Weapon
{
    private WeaponType weaponType;

    public Nights_Watch_Weapon(WeaponType weaponType)
    {
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Nights_Watch制造了" + weaponType;
    }

    @Override
    public WeaponType getWeaponType() {
        return weaponType;
    }
}
