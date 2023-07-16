public class MaxSubArraySum {
    public static void main(String[] args) {
        int ar[]={-2,-4,2,0,-1,1,-3,2,1,3,-5,4};
        int k=3;
        int max=Integer.MIN_VALUE,sum=0;
        int i=0,j=0;
        while(j<ar.length)
        {
            sum+=ar[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1==k)
            {
                max=Math.max(max,sum);
                sum-=ar[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}