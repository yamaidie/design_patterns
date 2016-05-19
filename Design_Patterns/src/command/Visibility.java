package command;

/**
 * Created by Administrator on 2016/5/20 0020.
 */
public enum Visibility
{
    VISIBLE("visible"), INVISIBLE("invisible"), UNDEFINED("");

    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
