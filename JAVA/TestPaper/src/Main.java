import Question2.*;
import Question3.*;
import Question4.ShowException;
import Question_4.FormateException;

public class Main {
    public static void main(String[] args) throws MisException {

        Contractor contractor=new Contractor();
        contractor.calculateSalary();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.calculateSalary();

        Car car = new Car();
        car.distance();
        car.display();

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.speed();

        StringQuestion3 question3 = new StringQuestion3();
        try
        {
            question3.display();
        }
        catch (MisException e){
           System.out.println(e.getmessege());
       }

        ShowException showException = new ShowException();
        try{
            showException.indexOutOfBound();
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        FormateException formateException = new FormateException();
        try{
            formateException.ShowException();
        }catch (NumberFormatException e){
            System.out.println(e);
        }

    }
    }
