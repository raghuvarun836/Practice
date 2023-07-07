#include<iostream>
#include<string>
using namespace std;

int countVowels(string s)
{
    int c=0;
    for(int i=0;i<s.length();i++)
    {
        if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
            c++;
    }
    return c;
}
int main()
{
    string s;
    getline(cin,s);
    int l=s.length();
    int res=countVowels(s);
    cout<<res<<endl;
}