//package collectionexamples.ArrayListExamples;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class ArrayListExamples {
//    public static void main(String[] args) {
//        List l1 = new ArrayList();
//
//        l1.add("Ahmedabad");
//        l1.add(234);
//        l1.add(12.67);
//
//        System.out.println(l1.get(1)); 
//        System.out.println(l1.size()); 
//        System.out.println(l1);        
//    }
//    Iterator<String> i1 = l3.iterator();
//    
//    while(i1.hasNext()) {
//   	 System.out.println(i1.next());
//    }
//
//}
package collectionexamples.ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        // Create a list without specifying the type
        List<Object> l1 = new ArrayList<>();

        l1.add("Ahmedabad");
        l1.add(234);
        l1.add(12.67);

        // Print elements using get method
        System.out.println(l1.get(1)); 
        System.out.println(l1.size()); 
        System.out.println(l1);        

        // Using an iterator to go through the list
        Iterator<Object> i1 = l1.iterator();
        
        while(i1.hasNext()) {
            System.out.println(i1.next());
        }
    }
}
