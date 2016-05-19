package command;

/**
 * Created by Administrator on 2016/5/10 0010.
 * 命令模式是含有不同的命令（含有接收者的请求）：做不同的事情；隐藏接收者执行细节。常见菜单事件，
 *而策略模式含有不同的算法，做相同的事情；
 *区别在于是否含有接收者。命令模式含有，策略模式不含有。
 * java.lang.Runable
 */

/**
 Command：
 定义命令的接口，声明执行的方法。
 ConcreteCommand：
 命令接口实现对象，是“虚”的实现；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 Receiver：
 接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。
 Invoker：
 要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 Client：
 创建具体的命令对象，并且设置命令对象的接收者。注意这个不是我们常规意义上的客户端，而是在组装命令对象和接收者，或许，把这个Client称为装配者会更好理解，因为真正使用命令的客户端是从Invoker来触发执行。[2]

 */
public class Test_Command
{
    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Goblin goblin = new Goblin();

        goblin.printStatus();

        wizard.castSpell(new ShrinkSpell(), goblin);
        goblin.printStatus();

        wizard.castSpell(new InvisibilitySpell(), goblin);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();
    }
}
