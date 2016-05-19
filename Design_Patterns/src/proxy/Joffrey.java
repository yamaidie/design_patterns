package proxy;

/**
 * Created by Administrator on 2016/5/19 0019.
 */

/**
 * 代理角色
 */
public class Joffrey implements King_Work
{
    private King_Work king_work;

    public Joffrey()
    {
        this.king_work = new Tywin();
    }

    @Override
    public void manage()
    {
        this.king_work.manage();
    }
}
