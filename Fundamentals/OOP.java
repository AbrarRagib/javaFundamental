package Fundamentals;
// 1. What is a Class?
// A class is like a blueprint or recipe.
// A class is a blueprint/template that defines how objects will look and behave.

// It contains variables (attributes/properties) and methods (functions/behaviors).
// Example: Think of a Car class. It defines what a car is: it has wheels, color, speed, and methods like drive, stop.



// 2. What is an Object?

// An object is a real instance of a class.

// It’s like making a real cake from a recipe.
// You can make many cakes (objects) from the same recipe (class).

// You create objects using the new keyword.

// Multiple objects can be created from the same class, and each object has its own data.
//  Example:

// Class = Car

// Objects = car1 (red Honda), car2 (blue BMW).








// 3. What is a Method?

// A method is a block of code inside a class that performs some action.

// It usually defines the behavior of an object.

// Example: drive(), brake(), honk().



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

// // Compile-time Polymorphism (Method Overloading) - Same method name, different parameters, inside the same class.

// // Runtime Polymorphism (Method Overriding) - Subclass provides its own version of a parent method.Same method name, same parameters, but in parent-child (inheritance) relationship.





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







//###
// Polymorphism in Java: Overloading + Overriding

// class Animal {
//     // Method Overriding Example (will be overridden in subclasses)
//     void sound() {
//         System.out.println("Some generic animal sound");
//     }

//     // Method Overloading Example (different versions of 'eat')
//     void eat() {
//         System.out.println("Animal eats food");
//     }

//     void eat(String food) {  // Overloaded method
//         System.out.println("Animal eats " + food);
//     }

//     void eat(String food, int times) {  // Another overload
//         System.out.println("Animal eats " + food + " " + times + " times");
//     }
// }

// class Cat extends Animal {
//     @Override
//     void sound() { // Overriding
//         System.out.println("Meow Meow!");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() { // Overriding
//         System.out.println("Woof Woof!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // ---------- Method Overriding Example ----------
//         Animal a1 = new Cat();  // runtime polymorphism
//         Animal a2 = new Dog();

//         a1.sound();  // Meow Meow!
//         a2.sound();  // Woof Woof!

//         // ---------- Method Overloading Example ----------
//         Animal a3 = new Animal();
//         a3.eat();                  // Animal eats food
//         a3.eat("meat");            // Animal eats meat
//         a3.eat("grass", 3);        // Animal eats grass 3 times
//     }
// }









// // 4. Abstraction
// Abstraction means hiding implementation details and showing only the essential features.

// Focus on what an object does, not how it does it.

// In Java, we achieve abstraction mainly in two ways:

// 1. Abstract classes;

// 2. Interfaces;

// Real-Life Example of Abstraction

// Think of a TV remote :

// You only know what button does what (Volume up, Channel change).

// You don’t know how internally the remote sends signals to the TV.

// That’s abstraction → you interact with the functionality without worrying about the internal details.






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


