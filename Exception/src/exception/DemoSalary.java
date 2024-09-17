package exception;

public class DemoSalary {

    public static void main(String[] args) {
        // Create an Employee instance
    	Exception e1 = new Exception();
        
        // Set employee details
        e1.setName("Naresh ");
        e1.setSalary(50000);
        
        // Display employee details
        System.out.println(e1);
        
        // Create another Employee instance with constructor
        Exception e2 = new Exception("Naresh Prajapati", 60000);
        
        // Display employee details
        System.out.println(e2);

        try {
            e1.setSalary(-1000);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
