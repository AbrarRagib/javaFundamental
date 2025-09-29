// package DSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



// 1. Stack (LIFO – Last In, First Out)
// Concept:

// Imagine a stack of books .

// You always put the new book on top.

// When you remove a book, you also remove from the top.

// This makes it a Last In → First Out system.

// Main Operations:

// push(item) → Add to top.

// pop() → Remove from top.

// peek() → Look at top element.

// isEmpty() → Check if empty.

// search(item) → Position of item from top (1-based).




public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");

        System.out.println("Stack: " + stack); // [Book1, Book2, Book3]

        // Peek top
        System.out.println("Top: " + stack.peek()); // Book3

        // Pop element
        System.out.println("Popped: " + stack.pop()); // Book3

        System.out.println("Stack after pop: " + stack); // [Book1, Book2]

        // Search element
        System.out.println("Position of Book1: " + stack.search("Book1")); // 2
    }
}


// Output:
// Stack: [Book1, Book2, Book3]
// Top: Book3
// Popped: Book3
// Stack after pop: [Book1, Book2]
// Position of Book1: 2




// Real-Life Uses of Stack

// Undo/Redo in text editors.

// Back/Forward in web browsers.

// Expression evaluation (like calculators 2 + 3 * 5).

// Recursion call management in memory.
