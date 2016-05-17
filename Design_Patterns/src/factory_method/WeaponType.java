package factory_method;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public enum WeaponType
{

    SWORD("sword"), Bow("bow"), AXE("axe");

    private String title;

    WeaponType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
