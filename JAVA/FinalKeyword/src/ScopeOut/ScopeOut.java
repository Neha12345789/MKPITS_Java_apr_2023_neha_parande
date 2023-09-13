package ScopeOut;
import NestedClass.Outer;


public class ScopeOut {

    public static void main(String[] args){
        Outer o = new Outer();
        Outer.inner i = o.new inner();
        i.myMethod();
    }
}
