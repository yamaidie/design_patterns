package command;

/**
 * Created by Administrator on 2016/5/20 0020.
 */
public class InvisibilitySpell extends Command
{
    private Target target;

    @Override
    public void execute(Target target) {
        target.setVisibility(Visibility.INVISIBLE);
        this.target = target;
    }

    @Override
    public void undo() {
        if (target != null) {
            target.setVisibility(Visibility.VISIBLE);
        }
    }

    @Override
    public void redo() {
        if (target != null) {
            target.setVisibility(Visibility.INVISIBLE);
        }
    }

    @Override
    public String toString() {
        return "Invisibility spell";
    }
}
