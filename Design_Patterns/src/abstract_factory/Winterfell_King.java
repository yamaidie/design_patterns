package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Winterfell_King implements King
{
    static final String NAME= "Eddard Stark";

    @Override
    public String Name()
    {
        return NAME;
    }
}
