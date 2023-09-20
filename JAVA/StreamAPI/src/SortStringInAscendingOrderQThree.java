import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringInAscendingOrderQThree {
    public static void sortString(){
        List<String> list = new ArrayList<String>();
        list.add("samidha");
        list.add("amisha");
        list.add("akshya");
        list.add("lalit");
        list.add("prajakta");
        list.add("anvita");
        System.out.println(list);
        List<String> list1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted String in a list = "+ list1);

    }
}
