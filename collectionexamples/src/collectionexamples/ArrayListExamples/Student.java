package collectionexamples.ArrayListExamples;

public class Student {
    private String name;
    private String education;
    private String email;
    private int rollNumber;

    public Student(String name, String education, String email, int rollNumber) {
        this.name = name;
        this.education = education;
        this.email = email;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public String getEmail() {
        return email;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    
    public String toString() {
        return "Student [Name=" + name + ", Education=" + education + ", Email=" + email + ", Roll Number=" + rollNumber + "]";
    }
}
