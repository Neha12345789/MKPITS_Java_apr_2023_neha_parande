public class Car implements Addition,Multiply{


    @Override
    public void Display() {
        Addition.super.Display();
        Multiply.super.Display();
    }
}
