// public public class Main{
	
// 	public static void main(String[] args) {

// 		DynamicArray dynamicArray = new DynamicArray(5);
		
// 		dynamicArray.add("A");
// 		dynamicArray.add("B");
// 		dynamicArray.add("C");
		
// 		//System.out.println(dynamicArray.get(0));
// 		//dynamicArray.insert(0, "X");
// 		//dynamicArray.delete("A");
// 		//System.out.println(dynamicArray.search("C"));
		
// 		System.out.println(dynamicArray);
// 		System.out.println("size: " + dynamicArray.size);
// 		System.out.println("capacity: " + dynamicArray.capacity);
// 		System.out.println("empty: " + dynamicArray.isEmpty());
// 	}
// }
// public class DynamicArray {

// 	int size;
// 	int capacity = 10;
// 	Object[] array;
	
// 	public DynamicArray() {
// 		this.array = new Object[capacity];
// 	}
// 	public DynamicArray(int capacity) {
// 		this.capacity = capacity;
// 		this.array = new Object[capacity];
// 	}
	
//         public Object get(int index) {
//             return array[index];
//         }
	
// 	public void add(Object data) {
		
// 		if(size >= capacity) {
// 			grow();
// 		}
// 		array[size] = data;
// 		size++;
// 	}
	
// 	public void insert(int index, Object data) {
		
// 		if(size >= capacity) {
// 			grow();
// 		}
// 		for(int i = size; i > index; i--) {
// 			array[i] = array[i - 1];
// 		}
// 		array[index] = data;
// 		size++;
// 	}
	
// 	public void delete(Object data) {
		
// 		for(int i = 0; i < size; i++) {
// 			if(array[i] == data) {
// 				for(int j = 0; j < (size - i - 1); j++){
// 					array[i + j] = array[i + j + 1];
// 				}
// 				array[size - 1] = null;
// 				size--;
// 				if(size <=(int) (capacity/3)) {
// 					shrink();
// 				}
// 				break;
// 			}
// 		}
// 	}
	
// 	public int search(Object data) {
		
// 		for(int i = 0; i < size; i++) {
// 			if(array[i] == data) {
// 				return i;
// 			}
// 		}
// 		return -1;
// 	}
	
// 	private void grow() {
		
// 		int newCapacity = (int)(capacity * 2);
// 		Object[] newArray = new Object[newCapacity];
		
// 		for(int i = 0; i < size; i++) {
// 			newArray[i] = array[i];
// 		}
// 		capacity = newCapacity;
// 		array = newArray;
// 	}
	
// 	private void shrink() {
		
// 		int newCapacity = (int)(capacity / 2);
// 		Object[] newArray = new Object[newCapacity];
		
// 		for(int i = 0; i < size; i++) {
// 			newArray[i] = array[i];
// 		}
// 		capacity = newCapacity;
// 		array = newArray;
// 	}
	
// 	public boolean isEmpty() {
// 		return size == 0;
// 	}
	
// 	public String toString() {
		
// 		String string = "";
		
// 		for(int i = 0; i < capacity; i++) {
// 			string += array[i] + ", ";
// 		}
// 		if(string != "") {
// 			string = "[" + string.substring(0, string.length() - 2) + "]";
// 		}
// 		else {
// 			string = "[]";
// 		}
// 		return string;
// 	}
// } {
    
// }






// Difference between Java array and dynamic array (ArrayList)

// import java.util.ArrayList;

// public class DynamicArray {
//     public static void main(String[] args) {
//         // Normal array
//         int[] fixedArray = new int[3];
//         fixedArray[0] = 10;
//         fixedArray[1] = 20;
//         fixedArray[2] = 30;
//         // fixedArray[3] = 40; // ❌ Error: size is fixed

//         // Dynamic array using ArrayList
//         ArrayList<Integer> dynamicArray = new ArrayList<>();
//         dynamicArray.add(10);
//         dynamicArray.add(20);
//         dynamicArray.add(30);
//         dynamicArray.add(40); // ✅ grows automatically

//         System.out.println("Fixed Array length: " + fixedArray.length);
//         System.out.println("Dynamic Array size: " + dynamicArray.size());




//     }
// }







// // How ArrayList grows internally

// import java.util.ArrayList;

// public class DynamicArray {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(2); // start with capacity 2
//         list.add(1);
//         list.add(2);

//         System.out.println("Before capacity increase: " + list);

//         // ensureCapacity() expands backing array if needed
//         list.ensureCapacity(5);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         System.out.println("After capacity increase: " + list);
//     }
// }




















// // Key Operations

// import java.util.ArrayList;

// public class DynamicArray {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Add elements
//         list.add(10);
//         list.add(20);
//         list.add(30);

//         // Insert at index
//         list.add(1, 99);

//         // Access by index
//         System.out.println("Element at index 2: " + list.get(2));

//         // Update value
//         list.set(0, 100);

//         // Remove element at index 0
//         list.remove(0);

//         // Get size
//         System.out.println("Final List: " + list);
//         System.out.println("Size: " + list.size());
//     }
// }











// Complexity Analysis

/*
Access by index -> O(1)
Update by index -> O(1)
Insert at end   -> O(1) amortized
Insert/remove middle -> O(n) (shift elements)
Search -> O(n) (linear search)
*/


import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Insert O(1) amortized
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        // Access O(1)
        System.out.println("Access index 3: " + list.get(3));

        // Update O(1)
        list.set(2, 99);

        // Remove O(n)
        list.remove(1);

        // Search O(n)
        boolean found = list.contains(99);

        System.out.println("List: " + list + " Found 99? " + found);
    }
}













