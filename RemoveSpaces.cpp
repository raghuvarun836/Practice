#include<iostream>
#include<string>
using namespace std;
int main()
{
    string s;
    getline(cin,s);
    char prev=s[0];
    for(int i=0;i<s.length();i++)
    {
        if(s[i]==' ' && prev==' '){}
        else
            cout<<s[i];
        prev=s[i];
    }
    return 0;
}