public class SleepingState
{
    public static void main(String args[])
    {
        System.out.println("Thread Starting....");
        try
        {
            Thread.sleep(5000);
        }catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("Thread Resumed");
    }
}
/*Thread Starting....
Thread Resumed*/