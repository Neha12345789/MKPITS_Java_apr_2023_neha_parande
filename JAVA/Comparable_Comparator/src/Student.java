public class Student implements Comparable<Student> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student() {

    }

    public static void display() {


    }


    @Override
    public int compareTo(Student student) {
        if (marks == student.marks)
            return 0;
        else if (marks < student.marks)
            return -1;
        else
            return 1;

    }

    @Override
    public String toString() {
        return name+"  "+marks;
    }
}
