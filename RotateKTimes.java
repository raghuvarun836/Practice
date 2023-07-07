class RotateKTimes
{
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        int k=7;
        k=k%ar.length;
        rotateK(ar,0,k-1);
        rotateK(ar,k,ar.length-1);
        rotateK(ar,0,ar.length-1);

        for(int i:ar)
            System.out.print(i+" ");
    }
    public static void rotateK(int ar[],int i,int j)
    {
        while(i<=j)
        {
            int tmp=ar[i];
            ar[i]=ar[j];
            ar[j]=tmp;
            i++;
            j--;
        }
    }
}