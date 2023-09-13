package NestedClass;

public class Outer {

    public class inner{

        static int num1;

        public inner(){
            num1=100;
        }

        public static void myMethod(){
            System.out.println(num1);
        }
    }
    public void main(String[] args){
         inner.myMethod();
        Outer o = new Outer();
        Outer.inner i = o. new inner();
    }


}
