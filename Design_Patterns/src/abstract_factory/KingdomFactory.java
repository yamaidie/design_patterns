package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public interface KingdomFactory
{
    Castle createCastle();

    King createKing();

    Army createArmy();
}
