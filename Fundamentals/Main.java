package Fundamentals;
class Dog {
    String name; // variable

    // method
    void bark() {
        System.out.println(name + " says Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();   // object
        dog1.name = "Buddy";    // set variable

        dog1.bark();  // method called using object
    }
}
