package strategy;

/**
 * Created by Administrator on 2016/5/10 0010.
 * 命令模式是含有不同的命令（含有接收者的请求）：做不同的事情；隐藏接收者执行细节。常见菜单事件，
 *而策略模式含有不同的算法，做相同的事情；
 *区别在于是否含有接收者。命令模式含有，策略模式不含有。
 */
public class Test_Strategy
{
    public static void main(String[] args)
    {
        Tywin_Lannister tywin_lannister;
        System.out.print("策略一：稳定君临的局势");
        System.out.print("\n");
        tywin_lannister=new Tywin_Lannister(new Tyrion_Lannister());
        tywin_lannister.execute();
        System.out.print("\n");
        System.out.print("策略二：联合高庭，击溃史丹尼斯，保证君临的安危");
        System.out.print("\n");
        tywin_lannister=new Tywin_Lannister(new Battle_of_the_Blackwater());
        tywin_lannister.execute();
        System.out.print("\n");
        System.out.print("策略三:策划红色婚礼：有的胜利靠宝剑和长矛赢取，有的胜利则要靠纸笔和乌鸦");
        System.out.print("\n");
        tywin_lannister=new Tywin_Lannister(new Red_Wedding());
        tywin_lannister.execute();


    }
}
