// Student.java
// Example of Class, Constructor, Object, and Methods in Java

public class Student {
    // Fields (attributes)
    String name;
    int age;
    String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    // Method to check if student passed
    public void checkPass() {
        if (grade.equalsIgnoreCase("A") || grade.equalsIgnoreCase("B") || grade.equalsIgnoreCase("C")) {
            System.out.println(name + " has passed!");
        } else {
            System.out.println(name + " has not passed.");
        }
    }

    // Main method to test Student class
    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student("Alice", 16, "A");
        Student s2 = new Student("Bob", 17, "D");

        // Call methods
        s1.displayInfo();
        s1.checkPass();

        s2.displayInfo();
        s2.checkPass();
    }
}
