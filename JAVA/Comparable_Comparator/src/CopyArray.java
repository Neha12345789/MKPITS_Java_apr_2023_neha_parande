import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CopyArray {
    public static void CopyOnWriteArrayMethods(){
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
        copyOnWriteArrayList.add("Neha");
        copyOnWriteArrayList.add("Naimish");
        copyOnWriteArrayList.add("Shreyan");
        copyOnWriteArrayList.add("Aaradhya");
        System.out.println("addIfAbsent method Example");
        System.out.println(copyOnWriteArrayList.addIfAbsent("Namira"));
        System.out.println(copyOnWriteArrayList);
        System.out.println("toString");
        String name = copyOnWriteArrayList.toString();
        System.out.println(name);
        System.out.println("IndexOf");
        System.out.println(copyOnWriteArrayList);
        int index = copyOnWriteArrayList.indexOf("Naimish");
        System.out.println(index);
        System.out.println("set method");
        System.out.println(copyOnWriteArrayList.set(2,"Nilu"));
        System.out.println(copyOnWriteArrayList);
        System.out.println("retainAllCollection");
        boolean list = copyOnWriteArrayList.retainAll(copyOnWriteArrayList);
        System.out.println(list);
        System.out.println("To Array");
        String[]f_name = (String[]) copyOnWriteArrayList.toArray();
        System.out.println(f_name);
        System.out.println("hashcode");
        int number = copyOnWriteArrayList.hashCode();
        System.out.println(number);
        String[] surname = {"parande", "khobragade", "wannewar", "lute"};
        System.out.println("To Array Method");
        Object[] object = copyOnWriteArrayList.toArray();
        System.out.println(Arrays.toString(object));

    }
}
