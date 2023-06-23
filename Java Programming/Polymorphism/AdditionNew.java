class Addition {
	
	int add(int num1, int num2){
		
		return num1 + num2;
	}
}

public class AdditionNew{
	public static void main(String [] args){
	Addition ad = new Addition();
	int sum=ad.add(10,20);
	
System.out.println(sum);
	
}
}	
