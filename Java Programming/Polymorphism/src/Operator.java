public class Operator {
    public int Addition(int a, int b) {
        return a + b;

    }

    public class Operand extends Operator {
        public int Addition(int a, int b) {
            return a+b;
        }
    }




}

