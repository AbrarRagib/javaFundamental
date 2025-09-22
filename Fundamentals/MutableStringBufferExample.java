package Fundamentals;
// Mutable vs Immutable Strings in Java
// 1. Immutable String

// In Java, the String class is immutable.

// Immutable means: once a String object is created, it cannot be changed.

// If you try to modify it (e.g., concatenate, replace), a new object is created in memory while the old one stays unchanged.

//  This is why strings in Java are often called immutable objects.

// Why String is Immutable?

// Security: Strings are widely used in credentials (e.g., username, passwords). If they were mutable, attackers could change values.

// Thread safety: Immutable objects are automatically thread-safe.

// Caching & Performance: String pool (stored in heap memory) allows reusing existing strings if they are immutable.

// 2. Mutable String

// In Java, there are two main classes for mutable strings:

// StringBuilder (not thread-safe, but faster)

// StringBuffer (thread-safe, slower due to synchronization)



// // Example 1: Immutable String
// public class ImmutableStringExample {
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = s1.concat(" World"); // Creates a new string object
        
//         System.out.println("Original String: " + s1); // Hello
//         System.out.println("Modified String: " + s2); // Hello World
//     }
// }
// // Here, s1 remains "Hello", even though we tried to add " World".










// // Example 2: Mutable String with StringBuilder
// public class MutableStringExample {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Hello");
//         sb.append(" World"); // Modifies the same object
        
//         System.out.println("Modified String: " + sb); // Hello World
//     }
// }
// // Here, the same object is changed. No new object is created.




// // Example 3: Mutable String with StringBuffer
// public class MutableStringBufferExample {
//     public static void main(String[] args) {
//         StringBuffer sbf = new StringBuffer("Hello");
//         sbf.append(" World"); // Modifies the same object
        
//         System.out.println("Modified String: " + sbf); // Hello World
//     }
// }
// // Works like StringBuilder, but thread-safe.