package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Winterfell_Army implements Army
{
    static final String DESCRIPTION = "没有军队，守卫十几人，战时需要通过封臣召集，五王之战召集了1w8，当然灰水望和白港没有加入";
    @Override
    public int Number()
    {
        return 20;
    }

    @Override
    public String Description()
    {
        return DESCRIPTION;
    }
}
