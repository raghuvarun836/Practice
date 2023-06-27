package Searching_and_Sorting;
import java.util.*;

public class Bsearch {
    public static void main(String[] args) {
        //int ar[]={5,3,9,4,7,1,8,2,6,10};
        int ar[]={5,3,2,3,2,3,2,3,2,2,2};
        Arrays.parallelSort(ar);
        int index=BinSearch(ar,3);
        System.out.println(index);
    }

    private static int BinSearch(int ar[],int k) {
        int l=0;
        int r=ar.length-1;
        int res=-1;
        while(r>=l)
        {
            int m=l+(r-l)/2;
            if(ar[m]==k)
            {
                res=m;
                r=m-1;
            }
            else if(k<ar[m])
                r=m-1;
            else
                l=m+1;
        }
        return res;
    }
}
