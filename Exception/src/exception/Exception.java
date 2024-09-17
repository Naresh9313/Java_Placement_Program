package exception;

public class Exception {
    private String name;
    private double salary;

    // Constructor
    public Exception(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Default constructor
    public Exception() {
        this.name = "";
        this.salary = 0.0;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }
}
