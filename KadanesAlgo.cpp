#include<stdio.h>
#include<iostream>
using namespace std;
int main()
{
    int ar[]={1,-5,-3,2,4,-1,2,-3,4};
    int max=INT_MIN;
    int cmax=ar[0];
    for(int i=0;i<9;i++)
    {
        cmax+=ar[i];
        if(cmax<ar[i])
            cmax=ar[i];
        if(cmax>max)
            max=cmax;
    }
    cout<<max<<endl;
}