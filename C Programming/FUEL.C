#include<stdio.h>
#include<conio.h>
void main()
{
int t_dis;
float fuel_c,avg;
printf("enter total distance travelled by bike in km");
scanf("%d",&t_dis);
printf("enter the fuel consume by bike in lit");
scanf("%f",&fuel_c);
avg = t_dis/fuel_c;
printf ("%f",avg);
getch();
}

