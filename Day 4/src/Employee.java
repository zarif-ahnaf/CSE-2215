public class Employee {
    private int Salary;
    private int month;
    private int interest;

    Employee(int Salary, int month, int interest) {
        this.Salary = Salary;
        this.month = month;
        this.interest = interest;
    }

    void show() {
        System.out.println("Salary:" + this.Salary);
        System.out.println("Month:" + this.month);
        System.out.println("Interest:" + this.interest);
    }
}
