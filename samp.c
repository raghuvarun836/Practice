#include<stdio.h>
#include<stdlib.h>
int main()
{
    int a=10;
    int b=a++;
    int c=++a;
    printf("%d %d",b,c);
    return 0;
}