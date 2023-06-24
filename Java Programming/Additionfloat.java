class Additionfloat
{
public float Add (float num1, float num2)
{
return num1-num2;
}
public static void main (String[] args)
{
Addition s1 = new Addition();
float sum=s1.Add(1.2f , 1.5f);
System.out.println(sum);
}
}