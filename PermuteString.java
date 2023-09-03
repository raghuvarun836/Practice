import java.util.*;
public class PermuteString
{
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(2,"ABC");
		map.put(3,"DEF");
		map.put(4,"GHI");
		map.put(5,"JKL");
		map.put(6,"MNO");
		map.put(7,"PQRS");
		map.put(8,"TUV");
		map.put(9,"WXYZ");
        Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
        obj.close();
		List<String> str=new ArrayList<>();
		while(n!=0)
		{
		    int rem=n%10;
		    str.add(0,map.get(rem));
		    n/=10;
		}
		List<String> res=helper(str);
		System.out.println(res);
	}
	public static List<String> helper(List<String> str)
	{
	    List<String> res=new ArrayList<>();
	    Permute(str,0,"",res);
	    return res;
	}
	public static void Permute(List<String> str,int ind,String tmp,List<String> res)
	{
	    if(ind==str.size())
	    {
	        res.add(tmp);
	        return;
	    }
	    else
	    {
	        String curr=str.get(ind);
	        for(int i=0;i<curr.length();i++)
	            Permute(str,ind+1,tmp+curr.charAt(i),res);
	    }
	}
}