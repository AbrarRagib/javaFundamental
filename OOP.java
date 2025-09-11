// // 1. Encapsulation

// //  Wrapping data (variables) and methods (functions) together into a single unit (class).
// //  Variables are kept private and accessed via public methods (getters & setters).
// //  Ensures data hiding and controlled access.

// class BankAccount {
//     private double balance; // private field (hidden from outside)

//     // Constructor
//     public BankAccount(double balance) {
//         this.balance = balance;
//     }

//     // Getter
//     public double getBalance() {
//         return balance;
//     }

//     // Setter
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//         } else {
//             System.out.println("Invalid deposit amount!");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//         } else {
//             System.out.println("Invalid withdrawal!");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount(1000);

//         account.deposit(500);
//         account.withdraw(300);

//         System.out.println("Final Balance: " + account.getBalance());
//     }
// }

// // Deposited: 500.0
// // Withdrawn: 300.0
// // Final Balance: 1200.0








// // 2. Inheritance

// //  Mechanism where one class inherits properties and behaviors of another class.
// //  Promotes code reusability.
// //  Use extends keyword






// class Animal {
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks: Woof Woof!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.eat();   // Inherited from Animal
//         myDog.bark();  // Dog’s own method
//     }
// }


// // This animal eats food.
// // The dog barks: Woof Woof!








// // 3. Polymorphism

// //  Means "many forms".
// //  A single entity (method or object) can behave differently in different contexts.

// // Types:

// // Compile-time Polymorphism (Method Overloading) - Same method name, different parameters.

// // Runtime Polymorphism (Method Overriding) - Subclass provides its own version of a parent method.





// class Animal {
//     void sound() {
//         System.out.println("Some generic animal sound");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Meow Meow!");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Woof Woof!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Animal a1 = new Cat();
//         Animal a2 = new Dog();

//         a1.sound();  // Cat’s sound
//         a2.sound();  // Dog’s sound
//     }
// }



// // Meow Meow!
// // Woof Woof!








// // 4. Abstraction

// //  Hiding implementation details and showing only essential features.
// //  Achieved using:

// // Abstract classes (abstract keyword).

// // Interfaces (fully abstract by default, until Java 8+ allowed default methods).


// abstract class Vehicle {
//     abstract void start(); // abstract method (no body)

//     void stop() { // concrete method
//         System.out.println("Vehicle stopped.");
//     }
// }

// class Car extends Vehicle {
//     @Override
//     void start() {
//         System.out.println("Car starts with a key.");
//     }
// }

// class Bike extends Vehicle {
//     @Override
//     void start() {
//         System.out.println("Bike starts with a button.");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Vehicle v1 = new Car();
//         Vehicle v2 = new Bike();

//         v1.start();
//         v2.start();
//         v1.stop();
//     }
// }


// // Car starts with a key.
// // Bike starts with a button.
// // Vehicle stopped.


