package MethodReference;

public class Main {
    public static void main(String[] args) {
        //giving reference of static method to functional interface by using method reference operator
        TheInterface theInterface = StaticMethodClass::NumberFromOneToTen;
        theInterface.show();


        //giving reference of Non-static method to functional interface by using method reference operator
        NonStaticMethodClass nonStaticMethodClass = new NonStaticMethodClass();
        TheInterface theInterface1 = nonStaticMethodClass::numberFromTenToOne;
        theInterface1.show();


        //giving reference of constructor to the method of interface which returns an object of class
        //Constructor Reference
        School school = Student::new;
        Student student = school.displayDetails();

    }
}
