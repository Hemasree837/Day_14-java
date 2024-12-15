public class Greetings{
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("GOOD MORNING");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("GOOD AFTERNOON");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("GOOD EVENING");
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("GOOD NIGHT");
            try{
                Thread.sleep(4000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}