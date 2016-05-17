package abstract_factory;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class Winterfell_Castle implements Castle
{
    static final String DESCRIPTION = "北境的首府,环绕一座古老的神木林和一眼温泉之上而建,热水通过管道在墙壁间输送，以温暖各个房间，使得临冬城在严酷的北境冬天时比其他城堡更加舒适。";
    @Override
    public String Description()
    {
        return DESCRIPTION;
    }
}
