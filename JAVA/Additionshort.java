class Additionshort
{
public short Add(short num1, short num2)
{
return (short)num1+num2;
}
public static void main (String[] args)
{
Additionshort s1 = new Additionshort();
short sum=(short)s1.Add(5, 7);
System.out.println(sum);
}
}