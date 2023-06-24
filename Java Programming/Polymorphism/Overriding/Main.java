import javax.swing.plaf.basic.BasicGraphicsUtils;

public class Main {
    public static void main(String[] args) {

        Addition1 addition1=new Addition1();
        System.out.println(addition1.add(23.2f,5.5f));

        Addition addition=new Addition();
        System.out.println(addition.add(23003,58));


        //subtraction
        Subtraction subtraction=new Subtraction();
        System.out.println(subtraction.subtract(48,58));

        SubtractionNew subtractionnew = new SubtractionNew();
        System.out.println(subtraction.subtract(45,48));

        //ElectronicDevice
        ElectronicDevice electronicDevice=new ElectronicDevice();
        electronicDevice.device("neha");

        ElectronicDevice1 electronicDevice1 = new ElectronicDevice1();
        electronicDevice1.device("acer");


        //Division
        Division division = new Division();
        System.out.println(division.div(2.5f,12));

        DivisionNew divisionNew =new DivisionNew();
        System.out.println(divisionNew.div(25,2.5f));

        //AreaOfCircle
        AreaOfCircle aoc = new AreaOfCircle();
        System.out.println(aoc.areaofcircle(3.5f));

        AreaOfCircle1 aocn = new AreaOfCircle1();
        System.out.println(aocn.areaofcircle(4.5f));


        //AreaOfSquare
        AreaOfSquare sq = new AreaOfSquare();
        System.out.println(sq.areaofsquare(5.8f));

        AreaOfSquare1 sq1 =new AreaOfSquare1();
        System.out.println(sq1.areaofsquare(5));


        //perimeter of rectangle
        PerimeterofRectangle rec = new PerimeterofRectangle();
        System.out.println(rec.rectangle(15,32));

        PerimeterofRectangle1 rec1=new PerimeterofRectangle1();
        System.out.println(rec1.rectangle(2.4f, 4.5f));


        //Area of Triangle
        AreaOfTriangle tri= new AreaOfTriangle();
        System.out.println(tri.triangle(10,4.9f));

        AreaOfTriangle1 tri1 = new AreaOfTriangle1();
        System.out.println(tri1.triangle(16,26));

        //Bag
        Bag bg = new Bag();
        bg.bag("school");


        Bag1 bg1 =new Bag1();
        System.out.println(bg1.bag(15));

        //month of year

        MonthNew M = new MonthNew();
        M.monthofyear("print");








    }
}