import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoubleEachIntegerQTwo {
    public static void toDoubleEachInteger() {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(42);
        list.add(12);
        list.add(25);
        list.add(30);
        list.add(28);
        list.add(17);
        System.out.println(list);
        List<Integer> list2 = list.stream().map(num->num*2).collect(Collectors.toList());
        System.out.println("Double the Each Integer in a List = "+list2);


    }
}
