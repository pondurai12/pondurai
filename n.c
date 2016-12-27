
#include<stdio.h>
#include<conio.h>
void main()
{
int a,sum=0,i;
printf("Enter number  :");
scanf("\%d",&a);
for(i=1;i<=a;i++)
{
sum+=i;
}
printf("%d is a sum of natural \n",sum);
getch();
}
