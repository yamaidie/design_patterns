package command;

/**
 * Created by Administrator on 2016/5/20 0020.
 */
public class Goblin extends Target
{
    public Goblin() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
