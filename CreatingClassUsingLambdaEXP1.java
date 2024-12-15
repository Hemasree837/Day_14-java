public class CreatingClassUsingLambdaEXP1
{
    public static void main(String args[])
    {
        Runnable r=()->System.out.println("I AM NEW FROM JAVA8 VERSION");
        Thread t =new Thread(r);
        t.start();
        System.out.println(t.isAlive());
    }
}
/*true
I AM NEW FROM JAVA8 VERSION*/