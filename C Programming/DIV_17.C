

#include<stdio.h>
#include<conio.h>
void main()
{
int f_no,s_no,count,sum=0;
clrscr();
printf("enter the integer no.");
scanf("%d%d",&f_no,&s_no);
count=f_no;
do
{
if (count%17!=0){
sum=sum+count;
}
count++;
}while (count<=s_no);
printf("the sum of all no. which are not divisible by 17 are =%d",sum);
getch();
}
