#include<stdio.h>
#include<conio.h>
void main()
{
int num1, rem;
printf ("enter the number");
scanf("%d",&num1,&rem);
rem=(num1%2);
if (rem==2){
printf ("this is even number");
}
{
else
printf("this is odd number");
}
getch ();
}