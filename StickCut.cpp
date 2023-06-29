#include<iostream>
#include<algorithm>
using namespace std;

int isGreaterOrEqual(int ar[],int n,int mid)
{
    int cnt=0;
    for(int i=0;i<n;i++)
        cnt+=ar[i]/mid;
    return cnt;
}
int cutsPossible(int ar[],int n,int k)
{
    int l=1;
    int r=*max_element(ar,ar + n);
    int maxh=0;
    while(l<r)
    {
        int mid=(l+r)/2;
        if(isGreaterOrEqual(ar,n,mid)>=k)
        {
            maxh=mid;
            l=mid+1;
        }
        else
            r=mid-1;
    }
    return maxh;
}
int main()
{
    int n,k;
    cin>>n;
    int ar[n];
    for(int i=0;i<n;i++)
        cin>>ar[i];
    cin>>k;
    int res=cutsPossible(ar,n,k);
    cout<<res<<endl;
    return 0;
}