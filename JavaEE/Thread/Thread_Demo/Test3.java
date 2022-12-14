package JavaEE.Thread.Thread_Demo;

/*
 * 需求：简单的卖票程序2
 * 多个窗口同时买票。
 *
 * 创建线程的第二种方式，实现Runnable接口
 * 步骤：
 * 1.定义类实现Runnable接口
 * 2.覆盖Runnable接口中的run方法
 *   将线程要运行的代码存放在该run方法中
 * 3.通过Thread类建立线程对象。
 * 4.将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数
 *   为什么要将Runnable接口的子类对象传递给Thread的构造函数。
 *   因为，自定义的run方法所属的对象是Runnable接口的子类对象。
 *   所以要让线程去指定指定对象的run方法，就必须明确该run方法所属的对象。
 * 5.调用Thread类的start方法开启线程并调用Runnable接口子类run方法。
 */
public class Test3 {
    public static void main(String[] args) {
        Ticket t=new Ticket();

        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);
        Thread t4=new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
class Ticket extends Thread
{
    private static int tick=100;//static 让四个线程共享一个数据
    /*
    * 问题: 为什么线程可以共享static变量
    * */

    public void run()
    {
        while(true)
        {
            if(tick>0)System.out.println(currentThread().getName()+"...sale"+tick--);
        }
    }
}

