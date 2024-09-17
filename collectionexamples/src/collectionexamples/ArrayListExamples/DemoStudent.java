package collectionexamples.ArrayListExamples;
import java.util.*;
public class DemoStudent {


    public static void main(String[] args) {

        List<Student> slist = new ArrayList<>();

        slist.add(new Student("Naresh", "MSC", "naresh@gmail.com", 101));
        slist.add(new Student("Rahul", "BSc Computer Science", "r@gmail.com", 102));
        slist.add(new Student("Pooja", "MBA", "p@gmail.com", 103));
        slist.add(new Student("Karan", "BTech", "k@gmail.com", 104));
        slist.add(new Student("Riyaan", "BA", "r@gmail.com", 105));

        System.out.println(slist);

    }
}
