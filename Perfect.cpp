#include<iostream>
using namespace std;

bool isPerfect(int n)
{
    int sum=0;
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
            sum+=i;
    }
    return sum==n;
}
int main()
{
    int n;
    cin >> n;
    bool res=isPerfect(n);
    if(res)
        cout<<"Perfect"<<endl;
    else
        cout<<"not Perfect"<<endl;
}