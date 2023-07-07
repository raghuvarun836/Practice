#include<iostream>
#include<string>
using namespace std;
string IntToBin(int n)
{
    string res;
    while(n!=0)
    {
        if(n%2==1)
            res='1'+res;
        else
            res='0'+res;
        //res=to_string(n%2)+res;
        n/=2;
    }
    return res;
}
int main()
{
    int n;
    cin>>n;
    string res=IntToBin(n);
    cout<<res<<endl;
}