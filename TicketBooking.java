class TBA implements Runnable{
    int avt=5;
    public void run()
    {
        String name=Thread.currentThread().getName();
        synchronized(this)
        {
           System.out.println(name+"you are trying to book the ticket for Movie");
           if(avt>0)
           {
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                System.out.println(name+" "+e);
            }
            avt--;
            System.out.println(name+"Your ticket is booked for Movie");
           }
           else{
            System.out.println(name+"There is no availability of tickets");
           }
        }
    }
}
public class TicketBooking {
    public static void main(String args[])
    {
        TBA g=new TBA();
        Thread t1=new Thread(g,"hema");
        Thread t2=new Thread(g,"hema");
        Thread t3=new Thread(g,"hema");
        Thread t4=new Thread(g,"hema");
        Thread t5=new Thread(g,"hema");
        Thread t6=new Thread(g,"hema");
        Thread t7=new Thread(g,"hema");
        Thread t8=new Thread(g,"hema");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
