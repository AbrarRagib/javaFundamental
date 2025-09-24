// // TL;DR 
// // small data set:                                                LinkedList = BAD
// // large data set + lots of searching:               LinkedList = BAD
// // large data set + lots of inserting/deleting: LinkedList = GOOD 


// import java.util.LinkedList;


// public class LinkedListDemo{
	
//  public static void main(String[] args) {
//   // *****************************************************
  
//   // LinkedList =  Nodes are in 2 parts (data + address)
//   //                        Nodes are in non-consecutive memory locations
//   //                        Elements are linked using pointers
            
//   //    advantages?
//   //    1. Dynamic Data Structure (allocates needed memory while running)
//   //    2. Insertion and Deletion of Nodes is easy. O(1) 
//   //    3. No/Low memory waste
  
//   //    disadvantages?
//   //    1. Greater memory usage (additional pointer)
//   //    2. No random access of elements (no index [i])
//   //    3. Accessing/searching elements is more time consuming. O(n)
  
//   //    uses?
//   //    1. implement Stacks/Queues
//   //    2. GPS navigation
//   //    3. music playlist
//   //
  
//   // *****************************************************

// LinkedList<String> linkedList = new LinkedList<String>();
// 		/*
// 		// LinkedList as a Stack
// 		linkedList.push("A");
// 		linkedList.push("B");
// 		linkedList.push("C");
// 		linkedList.push("D");
// 		linkedList.push("F");
// 		linkedList.pop();
// 		*/
// 		// LinkedList as a Queue
// 		linkedList.offer("A");
// 		linkedList.offer("B");
// 		linkedList.offer("C");
// 		linkedList.offer("D");
// 		linkedList.offer("F");
// 		//linkedList.poll();
		
// 		//linkedList.add(4, "E");
// 		//linkedList.remove("E");
// 		//System.out.println(linkedList.indexOf("F"));
		
		
// 		//System.out.println(linkedList.peekFirst());
// 		//System.out.println(linkedList.peekLast());
// 		//linkedList.addFirst("0");
// 		//linkedList.addLast("G");
// 		//String first = linkedList.removeFirst();
// 		//String last = linkedList.removeLast();
		
// 		System.out.println(linkedList);
		
// 	}
// }













// 1. Singly Linked List (SLL)

// A Singly Linked List is a linear data structure where each node contains:

// Data → value stored in the node.

// Next → a pointer (reference in Java) to the next node.
//  It allows forward traversal only.



 
 
// // Node class for Singly Linked List
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// // Singly Linked List implementation
// class SinglyLinkedList {
//     Node head;

//     // Insert at end
//     public void insert(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//     }

//     // Display list
//     public void display() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
// }

// // Test
// public class LinkedListDemo {
//     public static void main(String[] args) {
//         SinglyLinkedList sll = new SinglyLinkedList();
//         sll.insert(10);
//         sll.insert(20);
//         sll.insert(30);

//         System.out.print("Singly Linked List: ");
//         sll.display();
//     }
// }













// 2. Doubly Linked List (DLL)

// A Doubly Linked List has nodes with:

// Data → stored value.

// Prev → reference to the previous node.

// Next → reference to the next node.

// Allows both forward and backward traversal.







// // Node class for Doubly Linked List
// class DNode {
//     int data;
//     DNode prev, next;

//     DNode(int data) {
//         this.data = data;
//         this.prev = null;
//         this.next = null;
//     }
// }

// // Doubly Linked List implementation
// class DoublyLinkedList {
//     DNode head;

//     // Insert at end
//     public void insert(int data) {
//         DNode newNode = new DNode(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         DNode temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//         newNode.prev = temp;
//     }

//     // Display forward
//     public void displayForward() {
//         DNode temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " <-> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // Display backward
//     public void displayBackward() {
//         DNode temp = head;
//         if (temp == null) return;

//         // Move to last node
//         while (temp.next != null) {
//             temp = temp.next;
//         }

//         // Traverse backward
//         while (temp != null) {
//             System.out.print(temp.data + " <-> ");
//             temp = temp.prev;
//         }
//         System.out.println("null");
//     }
// }

// // Test
// public class LinkedListDemo {
//     public static void main(String[] args) {
//         DoublyLinkedList dll = new DoublyLinkedList();
//         dll.insert(10);
//         dll.insert(20);
//         dll.insert(30);

//         System.out.print("Forward: ");
//         dll.displayForward();

//         System.out.print("Backward: ");
//         dll.displayBackward();
//     }
// }
