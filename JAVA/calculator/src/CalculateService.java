public class CalculateService {
    public void calculate(String operator, double operand1, double operand2) {

        switch (operator) {

            case "+":
                AdditionNew ad = new AdditionNew();
                System.out.println("Addition of two numbers" +"    "+operand1+" & "+operand2+"        is"+" "+ad.getcalculatevalue(operand1, operand2));

                break;

            case "-":
                SubNew sb = new SubNew();
                System.out.println("Subtraction of two numbers"+" " +operand1+ "& " +operand2+" "+"is"+" "+sb.getcalculatevalue(operand1, operand2));
                break;

            case "*":
                Multiply m = new Multiply();
                System.out.println("Multiplication of two numbers"+" " +operand1+" & " +operand2+" "+"is"+" "+m.getcalculatevalue(operand1, operand2));
                break;

            case "/":
                Division d = new Division();
                System.out.println("Division of two numbers "+" "+operand1+" & " + operand2+" "+"is"+" "+d.getcalculatevalue(operand1, operand2));
                break;

        }
    }

    }






