package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Kings_Landing_KingdomFactory implements KingdomFactory
{
    @Override
    public Castle createCastle()
    {
        return new Kings_Landing_Castle();
    }

    @Override
    public King createKing()
    {
        return new Kings_Landing_King();
    }

    @Override
    public Army createArmy()
    {
        return new Kings_Landing_Army();
    }
}
