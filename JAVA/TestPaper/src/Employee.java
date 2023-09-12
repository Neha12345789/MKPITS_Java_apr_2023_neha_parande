abstract class Employee {
    String name;
    int paymentPerHour;


    abstract void calculateSalary();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Jonathan Livingston Seagull";
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = 500;
    }

}
