package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 * 里氏替换原则，任何接受父类型的地方，都应当能够接受子类型.
 * 工厂方法模式针对的是一个产品等级结构；而抽象工厂模式针对的是多个产品等级结构。
 * /
 /**
 * King's Landing：七国的首都，以及七国最大的城市，必然有军队，城堡，国王
 * Winterfell：北境的政治中心，同样有军队，城堡，领主
 * 鹿家：Ours Is the Fury
 * 狮家：Hear Me Roar!
 * 狼家：Winter Is Coming
 */
public class Test_abstract_factory
{
    private King king;
    private Castle castle;
    private Army army;

    King getKing(final KingdomFactory factory) {
        return factory.createKing();
    }

    public King getKing()
    {
        return king;
    }

    public void setKing(King king)
    {
        this.king = king;
    }

    Castle getCastle(final KingdomFactory factory) {
        return factory.createCastle();
    }

    public Castle getCastle()
    {
        return castle;
    }

    public void setCastle(Castle castle)
    {
        this.castle = castle;
    }

    Army getArmy(final KingdomFactory factory) {
        return factory.createArmy();
    }

    public Army getArmy()
    {
        return army;
    }

    public void setArmy(Army army)
    {
        this.army = army;
    }

    public void createKingdom(final KingdomFactory factory) {
        setKing(factory.createKing());
        setCastle(factory.createCastle());
        setArmy(factory.createArmy());
    }

    public static void main(String[] args){
        Test_abstract_factory test_abstract_factory=new Test_abstract_factory();

        test_abstract_factory.createKingdom(new Kings_Landing_KingdomFactory());
        System.out.println("军队数量:"+test_abstract_factory.getArmy().Number()+"\n"+"组成:"+test_abstract_factory.getArmy()
                .Description());
        System.out.println("都城介绍:"+test_abstract_factory.getCastle().Description());
        System.out.println("国王:"+test_abstract_factory.getKing().Name());

        System.out.println("\n");

        test_abstract_factory.createKingdom(new Winterfell_KingdomFactory());
        System.out.println("军队数量:"+test_abstract_factory.getArmy().Number()+"\n"+"组成:"+test_abstract_factory.getArmy()
                .Description());
        System.out.println("都城介绍:"+test_abstract_factory.getCastle().Description());
        System.out.println("国王:"+test_abstract_factory.getKing().Name());
    }
}
