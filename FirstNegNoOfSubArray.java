import java.util.*;

public class FirstNegNoOfSubArray
{
    public static void main(String[] args) {
        int ar[]={7,-3,-5,9,-15,-6,7,-13,-9,9,-1};
        int k=3;
        int i=0,j=0;
        List<Integer> l=new ArrayList<>();
        while(j<ar.length)
        {
            if(ar[j]<0)
                l.add(ar[j]);
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
                if(l.isEmpty())
                    System.out.print(0+" ");
                else
                {
                    System.out.print(l.get(0)+" ");
                    if(ar[i]==l.get(0))
                        l.remove(0);
                }
                i++;
                j++;
            }
        }
    }
}