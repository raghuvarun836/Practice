#include<iostream>
#include<algorithm>
using namespace std;
int closest(int ar[],int n,int k)
{
    int l=0;
    int r=n-1;
    int cn=ar[l];
    while (l<=r)
    {
        int mid=(r+l)/2;
        if(ar[mid]==k)
            return ar[mid];
        if(abs(k-ar[mid])<abs(k-cn))
            cn=ar[mid];
        if(k<ar[mid])
            r=mid-1;
        else
            l=mid+1;
    }
    return cn;
    
}
int main()
{
    int n,k;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    cin>>k;
    sort(ar,ar+n);
    int res=closest(ar,n,k);
    cout<<res<<endl;
}