package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Kings_Landing_Castle implements Castle
{
    static final String DESCRIPTION = "维斯特洛东海岸,港口城市，人口大约为50万，标志性建筑红堡";
    @Override
    public String Description()
    {
        return DESCRIPTION;
    }
}
