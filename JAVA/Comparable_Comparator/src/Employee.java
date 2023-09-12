import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    private int id_code;
    private String name;

    public Employee() {

    }
    public Employee(int id_code, String name) {
        this.id_code = id_code;
        this.name = name;
    }

    public int getId_code() {
        return id_code;
    }

    public void setId_code(int id_code) {
        this.id_code = id_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }
    @Override
    public String toString() {
        return name+"  "+id_code;
    }
}
