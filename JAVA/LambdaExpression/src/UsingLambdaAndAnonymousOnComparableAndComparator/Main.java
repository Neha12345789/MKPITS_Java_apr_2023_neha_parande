package UsingLambdaAndAnonymousOnComparableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student[] students = new Student[5];
        students[0] = new Student("Neha",85);
        students[1]= new Student("Trupti", 75);
        students[2] = new Student("Teju", 95);
        students[3]= new Student("Pradhnya", 78);
        students[4] = new Student("Bhagyashri", 96);
        arrayList.addAll(Arrays.asList(students));
        //anonymous class
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(arrayList);

        //Lambda Expression
        Comparator<Student> comparator = (object1, object2)->{
         if(object1.getRollNo()== object2.getRollNo())
             return 0;
         else if (object1.getRollNo()> object2.getRollNo()) {
             return 1;
         }else
             return -1;
        };
        Collections.sort(arrayList,comparator);
        System.out.println(arrayList);
    }
}
