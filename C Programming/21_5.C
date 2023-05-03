#include<stdio.h>
#include<conio.h>
void main()
{
int min,max,sum=0;
clrscr();
printf("enter the min and max integer");
scanf("%d%d",&min,&max);
for(int i=min; i<=max ;i++)
{
if(i%17!=0)
{
sum=sum+i;
}
}
printf("sum=%d",sum);
getch();
}


