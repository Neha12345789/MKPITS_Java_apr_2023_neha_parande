public class Employee {
    int employeeCode;
    String nameOfEmployee;

    public Employee(int employeeCode, String nameOfEmployee) {
        this.employeeCode = employeeCode;
        this.nameOfEmployee = nameOfEmployee;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode=" + employeeCode +
                ", nameOfEmployee='" + nameOfEmployee + '\'' +
                '}';
    }
}
