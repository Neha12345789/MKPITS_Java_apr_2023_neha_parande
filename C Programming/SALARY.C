#include<stdio.h>
#include<conio.h>
void main()
{
int e_id,t_m,amt_h,salary;
printf("enter the employee id,total working hour and amt received per hour");
scanf("%d%d%d",&e_id,&t_m,&amt_h);
salary=t_m*amt_h;
printf("total salary of the month=%d",salary);
getch();
}