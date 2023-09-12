public class Main {
    public static void main(String[] args) {

        Operation operation = (int number1, int number2) -> System.out.println("Subtraction of two number : " + (number1 - number2));
        operation.calculations(45, 40);

        //making an object of Calculations anonymous inner class by using class
        Calculations calculations = new Calculations() {
            @Override
            void getCalculateMultiply(int number1, int number2) {
                System.out.println("multiplication of two number : " + (number1 * number2));
            }
        };
        calculations.getCalculateMultiply(3, 5);


        //Anonymous Class by using Interface

        AnonymousClassUsingInterface anonymous = new AnonymousClassUsingInterface() {
            @Override
            public void display() {
                System.out.println("This is Dog");
            }
        };
        anonymous.display();


        // concrete class with concrete method anonymous inner class
         ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
         arithmeticOperation.getCalculateDivision(15,3);

         Runnable runnable = new Runnable() {
             @Override
             public void run() {
                 System. out.println("this is runnable Interface");
             }
         };

         OddEvenNumber oddEvenNumber = new OddEvenNumber();

         //Array list using Lambda Expression
        ArrayListUsingLambda.getArrayList();

    }



    }



