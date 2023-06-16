import java.util.*;
public class Demo
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int d=obj.nextInt();
        int b=obj.nextInt();
        String bi=obj.next();
        System.out.println(D2B(d));
        System.out.println(B2D(b));
        System.out.println(B2D(bi));
        obj.close();
    }
    public static String D2B(int d)
    {
        String b="";
        while(d!=0)
        {
            int rem=d%2;
            b=rem+b;
            d/=2;
        }
        return b;
    }
    public static int B2D(int b)
    {
        int d=0;
        int pow=1;
        while(b!=0)//1010
        {
            int rem=b%10;
            d+=pow*rem;
            pow*=2;
            b/=10;
        }
        return d;
    }
    public static int B2D(String b)
    {
        int d=0;
        int pow=1;
        for(int i=b.length()-1;i>=0;i--)
        {
            int rem = b.charAt(i) == '0' ? 0 : 1;
            d+=pow*rem;
            pow*=2;
        }
        return d;
    }
}