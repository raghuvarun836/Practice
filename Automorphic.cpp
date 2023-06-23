#include<iostream>
using namespace std;

bool check(int n)
{
    int sq=n*n;
    while(n!=0)
    {
        if(n%10!=sq%10)
            return false;
        n/=10;
        sq/=10;
    }
    return true;
}
int main()
{
    int n;
    cin >> n;
    bool res=check(n);
    if(res)
        cout<<"Automorphic"<<endl;
    else
        cout<<"not Automorphic"<<endl;
}