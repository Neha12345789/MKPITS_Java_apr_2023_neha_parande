public class Shopping {

	 double area;
    int shops;
    int floor;
		
    }

   

class Cloth_s extends Shopping {
	
	String ladies;
    String gents;
    String kids;
    
    void SetShops() {
        System.out.println("the ethinic drress");
    }

    
}
class Grocessary extends Shopping{
	
	String general;
    String bakery;
   
    String dairy;
   
    void SetShops() {
        System.out.println("this is panner");
    }

    

}
class Crockry extends Shopping{
    
    void SetShops() {
        System.out.println("this is glass cup");
    }

    String ceramic;
    String metal;
    String glass;
}

public class ShoppingNew{
	public static void main(String [] args){
		
		Crockry ck  = new Crockry();
		ck.SetShops;
	}
}

    		
				

