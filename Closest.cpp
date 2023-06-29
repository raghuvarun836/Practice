#include<iostream>
using namespace std;
int closest(int ar[],int n,int k)
{
    int cn=ar[0];
    int min=abs(k-ar[0]);
    for(int i=0;i<n;i++)
    {
        int curmin=abs(k-ar[i]);
        if(curmin<min)
        {
            min=curmin;
            cn=ar[i];
        }
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
    int res=closest(ar,n,k);
    cout<<res<<endl;
}