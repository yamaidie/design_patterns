package Singleton;

/**
 * Created by Administrator on 2016/5/14 0014.
 */
public class DoubleCheckLocking_The_Others
{
    private static volatile DoubleCheckLocking_The_Others instance;//1,保证内存可见性，使得被别的线程观察到

    private DoubleCheckLocking_The_Others()//2
    {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }
    public static DoubleCheckLocking_The_Others getInstance(){//3
        DoubleCheckLocking_The_Others result = instance;
        if (result == null) {
            synchronized (DoubleCheckLocking_The_Others.class) {
                result = instance;
                if (result == null) {
                    instance = result = new DoubleCheckLocking_The_Others();
                }
            }
        }
        return result;
    }
}
