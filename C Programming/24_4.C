#include<stdio.h>
#include<conio.h>
void main()
{
char row, col;
for(row='A';row<='D';row++)
{
for(col='A';col<='E';col++)
{
printf("%c",row);
}
printf("\n");
}
getch();
}