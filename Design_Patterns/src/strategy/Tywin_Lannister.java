package strategy;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
public class Tywin_Lannister
{
    private IStrategy strategy;

    public Tywin_Lannister(IStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.execute();
    }
}
