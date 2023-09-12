public class OddEvenNumber {
    public OddEvenNumber(){
        //lambda Expression
        int number = 100;
        Runnable runnable = ()->{
          for (int even =1; even<=number; even++){
              if (even%2==0){
                  System.out.println("Even Numbers" +" "+ even);
              }
          }
        };
        runnable.run();
       //anonymous inner class
        int number1 = 100;
        Runnable runnable1 =  new Runnable() {
            @Override
            public void run() {
                for (int odd=1; odd<=number1; odd++){
                    if (odd%2!=0){
                        System.out.println("Odd Numbers"+" "+odd);
                    }
                }
            }
        };
        runnable1.run();
    }
}
