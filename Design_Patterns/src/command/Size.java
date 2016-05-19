package command;

/**
 * Created by Administrator on 2016/5/20 0020.
 */
public enum Size
{
    SMALL("small"), NORMAL("normal"), LARGE("large"), UNDEFINED("");

    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
