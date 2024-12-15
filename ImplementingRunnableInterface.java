import java.util.*;
//Implementing runnable interface 
class a implements  Runnable{
    public void run()
    {
        System.out.println("HELLO I'M THREAD");
    }
}
public class ImplementingRunnableInterface
{
    public static void main(String args[])
    {
        a r=new a();
        Thread s= new Thread(r);
        s.start();
        s.run();
    }
}
/*HELLO I'M THREAD*/