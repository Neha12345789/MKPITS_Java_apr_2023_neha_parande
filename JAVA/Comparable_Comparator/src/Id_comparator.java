import java.util.Comparator;

public class Id_comparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getId_code()==o2.getId_code())
            return 0;
        else if (o1.getId_code()<o2.getId_code()) {
            return -1;
        }
        else
            return 1;
    }
}
