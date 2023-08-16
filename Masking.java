public class Masking
{
	public static void main(String[] args) {
		int a=13;
		int k=3;
		boolean res1=checkBit(a,k);
		int res2=setBit(a,k);
		int res3=clearBit(a,k);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		
		a=7;
		k=3;
		int res4=updateBit(a,k);
		System.out.println(res4);
	}
	public static boolean checkBit(int a,int k)
	{
        return (a & (1<<k))!=0 ;
	}
	public static int setBit(int a,int k)
	{
	    return (a | (1<<k));
	}
	public static int clearBit(int a,int k)
	{
	    int mask=~(1<<k);
	    return (a & mask);
	}
	public static int updateBit(int a,int k)
	{
	    a=clearBit(a,k);
	    return setBit(a,k);
	}
}