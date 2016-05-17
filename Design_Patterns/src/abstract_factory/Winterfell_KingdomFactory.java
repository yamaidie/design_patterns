package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Winterfell_KingdomFactory implements KingdomFactory
{
    @Override
    public Castle createCastle()
    {
        return new Winterfell_Castle();
    }

    @Override
    public King createKing()
    {
        return new Winterfell_King();
    }

    @Override
    public Army createArmy()
    {
        return new Winterfell_Army();
    }
}
