#include<iostream>
using namespace std;

void rotate(int ar[],int l,int r)
{
    while(l<r)
    {
        int tmp=ar[l];
        ar[l]=ar[r];
        ar[r]=tmp;

        l++;
        r--;
    }
}
int main()
{
    int n,k;
    cin >> n;
    int ar[n];
    for(int i=0;i<n;i++)
        cin >> ar[i];
    cin >> k;
    k=k%n;
    
    rotate(ar,0,k-1);
    rotate(ar,k,n-1);
    rotate(ar,0,n-1);

    for(int i=0;i<n;i++)
        cout<<ar[i]<<" ";
}