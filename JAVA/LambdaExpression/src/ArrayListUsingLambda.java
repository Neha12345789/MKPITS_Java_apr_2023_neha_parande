import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListUsingLambda {
    public static void getArrayList(){
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("Neha", "teju", "Pradhnya", "Mrunali"));
        list.forEach(
                (Names)-> System.out.println(Names)
    );

    }
}
