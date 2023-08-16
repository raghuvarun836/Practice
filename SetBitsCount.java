public class SetBitsCount
{
	public static void main(String[] args) {
	    int n=31;
	    int res1=noofSetBits(n);
	    System.out.println(res1);

		int a=10;
		int b=20;
	    int res2=noofFlips(a,b);
	    System.out.println(res2);
	}
	static int noofSetBits(int n)
	{
	    int c=0;
	    while(n!=0)
	    {
	        c+=((n&1)!=0) ? 1 : 0 ;
	        n=n>>1;
	    }
	    return c;
	}
	static int noofFlips(int a,int b)
	{
	    return noofSetBits(a^b);
	}
}
