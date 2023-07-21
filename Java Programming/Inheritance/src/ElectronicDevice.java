interface ElectronicDevice {
   public default void Mobile(){

   }

}

class Smartphone implements ElectronicDevice {
    public static void brandname(String name)

    {
        System.out.println("oneplus");

    }

}

class Smarttv implements ElectronicDevice{
    public static void brandname(String name){
        System.out.println("samsung");
    }
}

