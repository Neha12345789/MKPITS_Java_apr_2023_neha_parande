class Addition
{
	public int Add (int num1,int num2)
	{
		return num1+num2;
	}
	public static void main (String[] args)
	{
		Addition a1 = new Addition ();
		int sum = a1 . Add (20,40);
		System.out.println (sum);
	}
		
}