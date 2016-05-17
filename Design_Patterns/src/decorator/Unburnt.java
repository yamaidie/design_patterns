package decorator;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
public class Unburnt extends Titles
{
    Role role;

    public Unburnt(Role role)
    {
        this.role = role;
    }

    @Override
    public String getTitles()
    {
        return role.getTitles()+"  Unburnt";
    }
}
