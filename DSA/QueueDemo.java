// Queue (FIFO – First In, First Out)
// Concept:

// Imagine a queue at a bus stop.

// The first person to enter the queue is the first to leave.

// This makes it First In → First Out.


// Main Operations:

// add(item) → Insert at the rear (throws error if full).

// offer(item) → Insert at rear (returns false if full).

// remove() → Remove from front (throws error if empty).

// poll() → Remove from front (returns null if empty).

// peek() → See front element without removing.

// isEmpty() → Check if empty.




import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.add("Customer1");
        queue.add("Customer2");
        queue.add("Customer3");

        System.out.println("Queue: " + queue); // [Customer1, Customer2, Customer3]

        // Peek front
        System.out.println("Front: " + queue.peek()); // Customer1

        // Remove element
        System.out.println("Served: " + queue.poll()); // Customer1

        System.out.println("Queue after poll: " + queue); // [Customer2, Customer3]

        // Remove next
        queue.remove(); // removes Customer2
        System.out.println("Queue after remove: " + queue); // [Customer3]
    }
}



// Output:
// Queue: [Customer1, Customer2, Customer3]
// Front: Customer1
// Served: Customer1
// Queue after poll: [Customer2, Customer3]
// Queue after remove: [Customer3]
// // Note: Queue does not have a search method like Stack.


// Real-Life Uses of Queue

// Printer queue (documents printed in order).

// Call center system (first caller answered first).

// Task scheduling (CPU executes processes in order).

// Messaging systems (messages delivered in arrival order).







// 4. Deque (Bonus)

//  A Deque (Double-Ended Queue) allows inserting/removing elements from both front and rear.

// Can act as Stack + Queue combined.

// Implemented with ArrayDeque in Java.