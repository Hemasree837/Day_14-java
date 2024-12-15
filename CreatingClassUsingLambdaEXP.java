public class CreatingClassUsingLambdaEXP
{
    public static void main(String args[])
    {
        Runnable r=()->System.out.println("I AM NEW FROM JAVA8 VERSION");
        Thread t =new Thread(r);
        t.start();
    }
}
/*I AM NEW FROM JAVA8 VERSION*/