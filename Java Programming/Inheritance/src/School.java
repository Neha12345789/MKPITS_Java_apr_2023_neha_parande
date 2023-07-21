interface School {
 public abstract class Myclassroom {
     int NoOfClassroom;
 }
}

class College implements School{
    public static void Mydesk(int noofrow){
        System.out.println("5");
    }
}

class University implements School{
    public static double MyScore(double mark , double totalmarks){

       double perentage = mark/totalmarks*100;
        System.out.println(perentage);
        return perentage;
    }
}
