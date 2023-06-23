class Shopping {

	 double area;
    int shops;
    int floor;
		
    }

   

class Cloth_s extends Shopping {
	
	int ladies = 35;
	
	
	
    String gents;
    String kids;
    
    int SetShops() {
        System.out.println(ladies);
		return ladies;
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
    
	String ceramic;
    String metal;
    String glass;
	
    void SetShops() {
        System.out.println("this is glass cup");
    }

    
}

public class ShoppingNew{
	public static void main(String [] args){
		
	//	Crockry ck  = new Crockry();
	//	ck.SetShops;
		
		Cloth_s cs = new Cloth_s();
		cs.SetShops();
	}
}

    		
				

