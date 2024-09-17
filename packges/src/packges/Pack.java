package packges;

public class Pack {
    public static void main(String[] args) {
        // Create an emp instance with default constructor
        emp employee1 = new emp();
        employee1.setEname("Naresh Prajapati");
        employee1.setDesig(Designation.MANAGER);

        // Display employee details
        System.out.println(employee1);

        // Create an emp instance with parameterized constructor
        emp employee2 = new emp("Naresh Prajapati", Designation.TESTER);
        
        // Display employee details
        System.out.println(employee2);
    }
}
