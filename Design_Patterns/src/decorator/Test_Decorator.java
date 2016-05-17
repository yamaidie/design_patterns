package decorator;

/**
 * Created by Administrator on 2016/5/10 0010.
 * IO操作用的就是这种模式，一层一层的装饰，叠加
 */
public class Test_Decorator
{
    public static void main(String[] args)
    {
        Role role=new Daenerys();
        System.out.print(role.getTitles());
        System.out.print("\n");
        Stormborn stormborn=new Stormborn(role);
        System.out.print(stormborn.getTitles());
        System.out.print("\n");
        Unburnt unburnt=new Unburnt(role);
        System.out.print(unburnt.getTitles());
        System.out.print("\n");
        Unburnt unburnt1=new Unburnt(stormborn);
        System.out.print(unburnt1.getTitles());
        System.out.print("\n");
        Mother_of_Dragons mother_of_dragons=new Mother_of_Dragons(unburnt1);
        System.out.print(mother_of_dragons.getTitles());

    }
}
