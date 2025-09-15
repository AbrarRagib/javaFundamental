// Static Variables in Java

// A static variable is a variable that belongs to the class, not to any specific object.

// Declared using the static keyword.

// Shared among all objects of that class.

// Memory for static variables is allocated only once (when the class is loaded in JVM).

// Value of static variables is common for all objects (changes made by one object reflect in others).

// Key Points (Notes)

// Belongs to Class, Not Object

// Static variables are associated with the class, not with objects.

// Accessed using class name or an object reference.

// Single Copy in Memory

// Only one copy exists in the method area of JVM memory.

// Default Value

// Like instance variables, static variables get default values if not initialized.

// Common Data for All Objects

// If one object changes it, all other objects see the updated value.



// // Example 1: Static Variable Usage
// class Student {
//     int rollNo;
//     String name;
//     static String college = "AIUB"; // static variable (shared by all)

//     Student(int r, String n) {
//         rollNo = r;
//         name = n;
//     }

//     void display() {
//         System.out.println(rollNo + " " + name + " " + college);
//     }
// }

// public class StaticVariableExample {
//     public static void main(String[] args) {
//         Student s1 = new Student(1, "Abrar");
//         Student s2 = new Student(2, "Ragib");

//         s1.display(); 
//         s2.display();

//         // Changing static variable
//         Student.college = "BRAC";

//         s1.display(); 
//         s2.display();
//     }
// }
// // When college is changed, it affects all objects, because it’s shared.
// // 1 Abrar AIUB
// // 2 Ragib AIUB
// // 1 Abrar BRAC
// // 2 Ragib BRAC







// Example 2: Accessing Static Variable Without Object

class Counter {
    static int count = 0; // static variable

    Counter() {
        count++;
    }
}

public class StaticAccessExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();


        System.out.println(Counter.count); // Access directly via class name
    }
}
// 3
// The count variable keeps track of all objects created, because it’s static.


// In summary:

// Static variables are class-level variables, shared by all objects, with a single copy in memory.