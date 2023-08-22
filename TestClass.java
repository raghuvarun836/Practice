import java.util.*;
public class TestClass
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		obj.close();
		helper(n);
	}
	public static void helper(int n)
	{
	    for(int i=0;i<n;i++)
	    {
            for(int j=0;j<i;j++)
                System.out.print(" ");
	        for(int j=i;j<n;j++)
	            System.out.print("*");
	        System.out.println();
	    }
	}
}