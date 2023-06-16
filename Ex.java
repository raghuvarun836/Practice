class Test
{
    int c;
    public void increament()
    {
        c++;
    }
}
public class Ex extends Thread {
    public static void main(String[] args)throws Exception
    {
        Test t=new Test();
        Thread t1=new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                    t.increament();
            }
        });
        Thread t2=new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                    t.increament();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t.c);
    }
}