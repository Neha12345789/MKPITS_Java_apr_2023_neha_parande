public interface Shape {
    String color = "red";
    int CalculateArea();

   default void displayColor(){
       System.out.println(color);
   }

   static  void NameOfShape(){
       System.out.println("this is a circle");
   }

}
