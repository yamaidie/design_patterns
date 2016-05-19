package proxy;

/**
 * Created by Administrator on 2016/5/19 0019.
 */

/**
 * 真实角色
 */
public class Tywin implements King_Work
{
    @Override
    public void manage()
    {
        System.out.print("Tywin管理七国");
    }
}
