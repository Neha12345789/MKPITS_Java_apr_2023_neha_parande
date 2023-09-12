import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface{
    public  static void ShowNextPrevious(){
        List <String> list = new ArrayList();
        list.add("Nagpur");
        list.add("wardha");
        list.add("gondia");
        list.add("bhandara");
        System.out.println(list);

        ListIterator <String>listIterator = list.listIterator();
        while (listIterator.hasNext()){

            String city = listIterator.next();
            System.out.println(city);
        }


        while (listIterator.hasPrevious()){

            String city = listIterator.previous();
            System.out.println(city);
        }


    }
}
