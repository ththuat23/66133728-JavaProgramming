package EX_Employee_1_4;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Trả về "firstName lastName"
    public String getName() {
        return firstName + " " + lastName;
    }

    // Lương năm
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Tăng lương theo %
    public int raiseSalary(int percent) {
        salary = salary + salary * percent / 100;
        return salary;
    }

    // Hiển thị thông tin
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
    }
}