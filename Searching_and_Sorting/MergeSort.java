package Searching_and_Sorting;

public class MergeSort {
    public static void main(String[] args)
    {
        int ar[]={6,2,8,1,9,4,7,5,6,3,9};
        mergeSort(ar,0,ar.length-1);
        display(ar);
    }

    private static void mergeSort(int[] ar, int start, int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;

            mergeSort(ar, start, mid);
            mergeSort(ar, mid+1, end);
            merge(ar,start,mid,end);
        }
    }
    private static void merge(int ar[],int start,int mid,int end)
    {
        int i=start,j=mid+1,k=start;
        int tmp[]=new int[ar.length];

        while(i<=mid && j<=end)
        {
            if(ar[i]<ar[j])
                tmp[k++]=ar[i++];
            else
                tmp[k++]=ar[j++];
        }
        while(i<=mid)
            tmp[k++]=ar[i++];
        while(j<=end)
            tmp[k++]=ar[j++];
        
        int p=start;
        while(p<k)
        {
            ar[p]=tmp[p];
            p++;
        }
    }
    
    private static void display(int[] ar)
    {
        for(int i:ar)
            System.out.print(i+" ");
    }
}