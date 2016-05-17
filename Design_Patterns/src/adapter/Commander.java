package adapter;

/**
 * Created by Administrator on 2016/5/15 0015.
 */

/**
 * 总司令需要守夜人有荣誉
 * Commander相当于设计模式中的client
 */
public class Commander implements NightsWatch
{
    private NightsWatch nightsWatch;
    public Commander()
    {
    }

    public Commander(NightsWatch nightsWatch)//通过适配，最后New_Nights_Watch能传进来
    {
        this.nightsWatch = nightsWatch;
    }

    @Override
    public void fight()
    {
        nightsWatch.fight();
    }

    @Override
    public void honor()
    {
        nightsWatch.honor();
    }
}
