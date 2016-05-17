package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Kings_Landing_Army implements Army
{
    static final String DESCRIPTION = "主要是都城守备军，金袍子";
    @Override
    public int Number()
    {
        return 1000;
    }
    @Override
    public String Description()
    {
        return DESCRIPTION;
    }
}
