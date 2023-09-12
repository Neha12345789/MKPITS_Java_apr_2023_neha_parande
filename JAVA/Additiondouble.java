class Additiondouble
{
public double Add (double num1, double num2)
{
return num1-num2;
}
public static void main (String[] args)
{
Addition s1 = new Addition();
float sum=s1.Add(12.3, 15.6);
System.out.println(sum);
}
}