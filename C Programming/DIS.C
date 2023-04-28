 //distance between two points
 //dis=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)
 //res=sqrt(dis)
 //display





#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
int x1,x2,y1,y2;
clrscr();
float dis,res;
printf("enter the values of x1,x2,y1 and y2");
scanf("%d %d %d %d",&x1,&x2,&y1,&y2);


dis=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
res=sqrt(dis);

printf("\n the dis between two pts is =%f",res);
getch();
}