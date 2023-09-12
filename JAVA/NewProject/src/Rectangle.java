import org.w3c.dom.ls.LSOutput;

public class Rectangle implements Shape{
    int length=8;
    int breadth=6;


    @Override
    public int CalculateArea() {
        int Area = length*breadth;
        return Area;

    }

    @Override
    public void displayColor() {
        Shape.super.displayColor();
        System.out.println("Black");
    }

}
