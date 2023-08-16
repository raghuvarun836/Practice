
public class Spiral
{
	public static void main(String[] args) {
	    
	    int ar[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    spiral(ar);
	}
	public static void spiral(int ar[][])
	{
	    int row=ar.length;
	    int col=ar[0].length;
	    int l=0,t=0,r=col-1,b=row-1;
	    
	    while(l<=r && t<=b)
	    {
	        for(int i=l;i<=r;i++)
	            System.out.print(ar[t][i]+" ");
	        t++;
	        
	        for(int i=t;i<=b;i++)
	            System.out.print(ar[i][r]+" ");
	        r--;
	        
	        if(t<=b)
	        {
	            for(int i=r;i>=l;i--)
	                System.out.print(ar[b][i]+" ");
	            b--;
	        }
	        
	        if(l<=r)
	        {
	            for(int i=b;i>=t;i--)
	                System.out.print(ar[i][l]+" ");
	            l++;
	        }
	    }
	}
}
