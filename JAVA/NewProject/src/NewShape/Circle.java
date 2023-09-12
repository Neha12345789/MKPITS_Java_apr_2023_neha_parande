package NewShape;

public class Circle implements Shape{
    @Override
    public double getcalculatearea() {
        System.out.println("Area of circle");
        return (3.14*(5*5));
    }
}
