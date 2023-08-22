public class SingleTon
{
    private static SingleTon sd;
    private SingleTon()
    {
    }

    private static SingleTon getInstance() {
        if(sd==null)
            sd=new SingleTon();
        return sd;
    }
    public static void main(String[] args)
    {
        SingleTon s=SingleTon.getInstance();
        System.out.println("Singleton class Done "+s);
    }
}