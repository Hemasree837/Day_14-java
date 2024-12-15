import java.util.*;
//Extending Thread class
class a extends Thread{
    public void r()
    {
        System.out.println("HELLO I'M THREAD");
    }
}
public class ExtendingThreadClass
{
    public static void main(String args[])
    {
        a g=new a();
        g.r();
        g.start();
    }
}
/*HELLO I'M THREAD*/