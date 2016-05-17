package adapter;

/**
 * Created by Administrator on 2016/5/15 0015.
 */

/**
 * adapter class
 * 把罪犯改造成总司令希望的有荣誉感的守夜人
 */
public class New_Nights_Watch implements NightsWatch
{
    //类似于各种充电器，大体不变，只需要改变自己需要的部分
    private Criminal criminal;

    public New_Nights_Watch()
    {
        criminal=new Criminal();//类加载的时候实例化Criminal
    }

    @Override
    public void fight()
    {
        criminal.fight();//战斗不需要改变，还是用罪犯的fight
    }

    @Override
    public void honor()
    {
        System.out.print("变得有荣誉感");//这是要改造的，
    }
}
