import java.util.*;
public class IsInZigZag
{
	public static void main(String[] args)
	{
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt(),arr[]=new int[n];
	    for(int i=0;i<n;i++)
	        arr[i]=obj.nextInt();
	    System.out.print(helper(arr,n));
	}
	public static boolean helper(int arr[],int n)
	{
	    boolean b = true;
        for(int i=0;i<n-1;i++)
        {
            if(b)
            {
                if(arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            else
            {
                if(arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            b=!b;
        }
        return isinZigZag(arr,n);
    }
    public static boolean isinZigZag(int arr[],int n)
    {
        boolean b=true;
        for (int i=0;i<n-1;i++)
        {
            if(b)
                if(arr[i] >= arr[i+1]) return false;
            else
                if (arr[i] <= arr[i+1]) return false;
            b=!b;
        }
        return true;
	}
}
