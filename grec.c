#include<stdio.h>
#include<conio.h>
int main()
{
    int a,b,c;
    printf("enter the  value of a b c:");
    scanf("%d%d%d",&a,&b,&c);
    if((a>b)&&(a>c))
    printf("a is greater",a);
    else if((b>c)&&(b>a))
    printf("b is greater",b);
    else
    printf("c is greater",c);

    getch();
}
