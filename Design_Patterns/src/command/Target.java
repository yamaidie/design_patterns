package command;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public abstract class Target
{
    private Size size;

    private Visibility visibility;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public abstract String toString();

    /**
     * Print status
     */
    public void printStatus() {
        System.out.println(String.format("%s, [size=%s] [visibility=%s]", this, getSize(),
                getVisibility()));
        System.out.println();
    }
}
