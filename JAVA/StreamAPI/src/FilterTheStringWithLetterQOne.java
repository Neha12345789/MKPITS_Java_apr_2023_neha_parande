import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTheStringWithLetterQOne {
    public static void filterTheString(){
        List<String> list = new ArrayList<String>();
        list.add("Neha");
        list.add("Aman");
        list.add("Amey");
        list.add("Srushti");
        list.add("Anish");
        list.add("Apurva");
        System.out.println(list);
        List<String> list1 = list.stream().filter(str->str.startsWith("A")).collect(Collectors.toList());
        System.out.println("Filter String With Letter A = "+list1);
    }
}
