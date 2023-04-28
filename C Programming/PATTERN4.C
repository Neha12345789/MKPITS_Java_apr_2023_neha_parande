#include<stdio.h>
#include<conio.h>
void main()
{
int row,col;
for(row=1;row<=5;row++)
{
for(col=1;col<=5;col++)
{
printf("%c",'A'-1+row);
}
printf("\n");

}
getch();
}
