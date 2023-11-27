import java.util.*;
public class Twilio
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		    ar[i]=obj.nextInt();
        
        int k=obj.nextInt();
		int res=helper(ar,k);
		System.out.println(res);
	}
	public static int helper(int ar[],int k)
	{
	    int cw = 0;
        int n = ar.length;

        while (cw < k)
        {
            if (ar[0] > ar[1])
            {
                int temp = ar[1];
                for (int i = 1; i < n - 1; i++)
                    ar[i] = ar[i + 1];

                ar[n - 1] = temp;
                cw++;
            }
            else
            {
            int temp = ar[0];
                for (int i = 0; i < n - 1; i++)
                    ar[i] = ar[i + 1];

                ar[n - 1] = temp;
                cw = 1;
            }
        }
        return ar[0];
	}
}