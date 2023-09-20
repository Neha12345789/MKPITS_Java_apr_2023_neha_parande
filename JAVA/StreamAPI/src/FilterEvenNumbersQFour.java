import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEvenNumbersQFour {
    public static void filterEvenNumberAndDoubled(){
        List<Integer> list = new ArrayList<>();
        list.add(41);
        list.add(15);
        list.add(42);
        list.add(12);
        list.add(25);
        list.add(30);
        list.add(28);
        list.add(17);
        System.out.println("Numbers = "+ list);
        List<Integer> list1 = list.stream().filter(number->number%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers = " + list1);
        List RemainingOddNumber= list.stream().filter(number->number%2!=0).map(number->number*2).collect(Collectors.toList());
        System.out.println("Remaining Odd Numbers = " + RemainingOddNumber);
        int sumOfRemainingOddNumber1=list.stream().filter(number->number%2!=0).map(number->number*2).reduce(0,(sum,number)->sum+number);
        System.out.println("Sum of All Remaining Odd Numbers = " +sumOfRemainingOddNumber1);

    }
}
