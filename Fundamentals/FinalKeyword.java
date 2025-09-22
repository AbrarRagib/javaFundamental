package Fundamentals;
public class FinalKeyword {






    
}



//     1. final Variable

//  Once a variable is declared final, its value cannot be changed (it becomes a constant).


// public class FinalVariableExample {
//     public static void main(String[] args) {
//         final int x = 10;   // final variable
//         System.out.println("x = " + x);

//         // x = 20;  ERROR: cannot assign a value to final variable
//     }
// }





// 2. final Method

//  A method declared final cannot be overridden by a subclass.

// class Animal {
//     final void sound() {   // final method
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     //  ERROR: Cannot override the final method from Animal
//     // void sound() {
//     //     System.out.println("Dog barks");
//     // }
// }







// // 3. final Class

// //  A final class cannot be extended (inherited).

// final class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// //  ERROR: Cannot inherit from final class
// // class Dog extends Animal {  
// // }



// Real-Life Analogy

// Final variable → Like your Date of Birth  (it never changes).

// Final method → Like the recipe of Coca-Cola  (nobody can change it).

// Final class → Like ATM machine design (banks can use it, but cannot change the blueprint).