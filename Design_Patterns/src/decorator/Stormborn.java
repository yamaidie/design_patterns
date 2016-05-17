package decorator;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
public class Stormborn extends Titles
{
    Role role;

    public Stormborn(Role role)
    {
        this.role = role;
    }

    @Override
    public String getTitles()
    {
        return role.getTitles()+"  Stormborn";
    }
}
