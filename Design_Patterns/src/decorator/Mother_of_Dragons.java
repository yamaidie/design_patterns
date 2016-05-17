package decorator;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
public class Mother_of_Dragons extends Titles
{
    Role role;

    public Mother_of_Dragons(Role role)
    {
        this.role = role;
    }

    @Override
    public String getTitles()
    {
        return role.getTitles()+"  Mother of Dragons";
    }
}
