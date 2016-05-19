package command;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public abstract class Command
{
    public abstract void execute(Target target);

    public abstract void undo();

    public abstract void redo();

    @Override
    public abstract String toString();
}
