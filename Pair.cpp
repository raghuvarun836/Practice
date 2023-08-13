#include <iostream>

using namespace std;

pair<int,int> findK(int ar[][10],int m,int n,int k)
{
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(ar[i][j]==k)
                return make_pair(i,j);
        }
    }
    return make_pair(-1,-1);
}
int main()
{
    int m,n,k;
    cin>>m>>n>>k;
    
    int ar[10][10];
    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            cin>>ar[i][j];
        }
    }
    
    pair<int,int> p=findK(ar,n,m,k);
    cout<<p.first<<","<<p.second<<endl;
    return 0;
}