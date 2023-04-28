
#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
clrscr();
printf("enter 3 integer no.");
scanf("%d%d%d",&a,&b,&c);
if(a>b&&a>c){
printf("a is greater than b %d",a);
}
else if (b>c&&b>a){
printf("b is greater than c %d",b);
}
else if (c>a&&c>b){
printf("c is greater than a %d",c);
}
getch();
}
