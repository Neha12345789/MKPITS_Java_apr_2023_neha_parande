public class Shape {
    int no_of_sides (int a, int b, int c)
    {
        System.out.println("i am triangle");
    }
    int no_of_sides( float r)
    {
        System.out.println("i am circle");
    }

    public static int main
	{
		Shape s = new Shape
        s.no_of_sides (2.5f);
    }
}