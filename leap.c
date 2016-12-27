#include<stdio.h>
int main()
{
    int n;
    printf("enter the year");
    scanf("%d",&n);
    if(n%400==0||n%4==0&&n%100!=0)
        printf("the given year is leap ");
        else
    printf("given year is not leap year");
    }
