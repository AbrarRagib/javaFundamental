// What is the Enhanced for Loop in Java?

// The enhanced for loop (also called the for-each loop) is a simpler way to iterate over arrays or collections in Java, without needing an index counter.


// for (type variable : arrayOrCollection) {
//     // code to execute
// }

// type → data type of elements in the array/collection

// variable → temporary variable that holds the current element

// arrayOrCollection → the array or collection you want to loop through



// Example 1: Iterating Over an Array

// public class EnhancedForLoopExample {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};

//         // Using enhanced for loop
//         for (int num : numbers) {
//             System.out.println(num);
//         }
//     }
// }




// // Example 2: Iterating Over a String Array
// public class ForEachString {
//     public static void main(String[] args) {
//         String[] fruits = {"Apple", "Banana", "Mango"};

//         for (String fruit : fruits) {
//             System.out.println(fruit);
//         }
//     }
// }




// Example 3: Iterating Over a Collection (ArrayList)

import java.util.ArrayList;

public class ForEachArrayList {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}
