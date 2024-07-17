
//package firstproject;
//import java.util.Scanner;
//public class FirstClass {
//
//	public static void main(String[] args) {
//		System.out.println("hello");
//		
//		
//		int no1,no2;
//		
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter 2 numbers");
//		no1=sc.nextInt();
//		no2=sc.nextInt();
//		
//		float ans=(float)no1/no2;
//		System.out.println(ans);
//
//	}
//
//}



/* take percentage form user
 *  if per > 90 then print grade A
 * if between 80 to 90 then grade b
 * if less than 80 grade c
 */



//package firstproject;
//import java.util.Scanner;
//
//public class FirstClass {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your percentage: ");
//        double percentage = scanner.nextDouble();
//
//        if (percentage > 90) {
//            System.out.println("Grade: A");
//        } else if (percentage >= 80) {
//            System.out.println("Grade: B");
//        } else {
//            System.out.println("Grade: C");
//        }
//
//        scanner.close();
//    }
//}



//package firstproject;
//
//public class FirstClass {
//
//    public static void main(String[] args) {
//        int i = 1;
//
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);
//    }
//}
//
//package firstproject;
//
//public class FirstClass {
//
//    public static void main(String[] args) {
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }
//    }
//}
//
//
//





//
//
//
//
//
//package firstproject;
//
//public class FirstClass {
//
//    // Data members
//    int rollno;
//    String name;
//
//    // Member functions
//    void getdata() {
//        name = "Naresh";
//        rollno = 12;
//
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("RollNo: " + rollno);
//
//    }
//
//    public static void main(String[] args) {
//        FirstClass student = new FirstClass();
//
//        student.getdata();
//        student.display();
//    }
//}


//
//
//package firstproject;
//
//public class FirstClass {
//
//    // Data members
//    private int rollno;
//    private String name;
//
//    // Setter method for rollno
//    public void setRollno(int rollno) {
//        this.rollno = rollno;
//    }
//
//    // Getter method for rollno
//    public int getRollno() {
//        return this.rollno;
//    }
//
//    // Setter method for name
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // Getter method for name
//    public String getName() {
//        return this.name;
//    }
//
//    public static void main(String[] args) {
//        FirstClass student = new FirstClass();
//
//        student.setRollno(12);
//        student.setName("Naresh");
//
//        System.out.println("Roll No: " + student.getRollno());
//        System.out.println("Name: " + student.getName());
//    }
//}


//package firstproject;
//
//public class FirstClass  {
//    private int carId;
//    private String carType;
//    private float rent;
//
//    public void GetCar(int carId, String carType) {
//        this.carId = carId;
//        this.carType = carType;
//        this.rent = GetRent();
//    }
//
//    public float GetRent() {
//        switch (carType.toLowerCase()) {
//            case "small car":
//                return 1000;
//            case "van":
//                return 800;
//            case "suv":
//                return 2500;
//            default:
//                return 0; 
//        }
//    }
//
//    public void ShowCar() {
//        System.out.println("Car ID: " + carId);
//        System.out.println("Car Type: " + carType);
//        System.out.println("Rent: " + rent);
//    }
//
//    public static void main(String[] args) {
//    	FirstClass car = new FirstClass();
//
//        car.GetCar(1, "SUV");
//
//        car.ShowCar();
//        
//    }
//}




package firstproject;

public class FirstClass {

    private int rollno;
    private String name;

    // Constructor
    public FirstClass(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void getdata(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        FirstClass student = new FirstClass(12, "Naresh");

        // Display the data
        student.display();

      
    }
}
