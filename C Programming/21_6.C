#include<stdio.h>
#include<conio.h>
void main()
{
int min, max;
printf ("enter the min and max no.");
scanf("%d%d",&min,&max);
for(int i=min;i<=max;i++)
{
if(i%7==2 || i%7==3)
{
printf("%d\t",i);
}
}
getch();
}