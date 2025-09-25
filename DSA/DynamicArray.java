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











// // Complexity Analysis

// /*
// Access by index -> O(1)
// Update by index -> O(1)
// Insert at end   -> O(1) amortized
// Insert/remove middle -> O(n) (shift elements)
// Search -> O(n) (linear search)
// */


// import java.util.ArrayList;

// public class DynamicArray {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();

//         // Insert O(1) amortized
//         for (int i = 0; i < 5; i++) {
//             list.add(i);
//         }

//         // Access O(1)
//         System.out.println("Access index 3: " + list.get(3));

//         // Update O(1)
//         list.set(2, 99);

//         // Remove O(n)
//         list.remove(1);

//         // Search O(n)
//         boolean found = list.contains(99);

//         System.out.println("List: " + list + " Found 99? " + found);
//     }
// }
















// // Implement Your Own Dynamic Array


// class MyDynamicArray {
//     private int[] arr;
//     private int size;

//     public MyDynamicArray() {
//         arr = new int[2];
//         size = 0;
//     }

//     public void add(int value) {
//         if (size == arr.length) {
//             int[] newArr = new int[arr.length * 2];
//             for (int i = 0; i < arr.length; i++) {
//                 newArr[i] = arr[i];
//             }
//             arr = newArr;
//         }
//         arr[size++] = value;
//     }

//     public int get(int index) {
//         if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
//         return arr[index];
//     }

//     public void set(int index, int value) {
//         if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
//         arr[index] = value;
//     }

//     public int size() {
//         return size;
//     }
// }

// public class DynamicArray {
//     public static void main(String[] args) {
//         MyDynamicArray myArr = new MyDynamicArray();
//         myArr.add(10);
//         myArr.add(20);
//         myArr.add(30);

//         System.out.println("Size: " + myArr.size());
//         System.out.println("Element at index 1: " + myArr.get(1));
//         myArr.set(1, 99);
//         System.out.println("Updated index 1: " + myArr.get(1));
//     }
// }












// // Insert 1–10, remove even numbers

// import java.util.ArrayList;

// public class DynamicArray {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 1; i <= 10; i++) list.add(i);

//         list.removeIf(n -> n % 2 == 0); // remove evens

//         System.out.println("After removing evens: " + list);
//     }
// }













// Reverse ArrayList without Collections.reverse()

// import java.util.ArrayList;

// public class DynamicArray {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int i = 1; i <= 5; i++) list.add(i);

//         for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
//             int temp = list.get(i);
//             list.set(i, list.get(j));
//             list.set(j, temp);
//         }

//         System.out.println("Reversed List: " + list);
//     }
// }




















// Linear + Binary Search




import java.util.ArrayList;
import java.util.Collections;

public class DynamicArray {
    // Linear search
    public static int linearSearch(ArrayList<Integer> list, int key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) return i;
        }
        return -1;
    }

    // Binary search (list must be sorted)
    public static int binarySearch(ArrayList<Integer> list, int key) {
        int low = 0, high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list.get(mid) == key) return mid;
            else if (list.get(mid) < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 7, 9);

        System.out.println("Linear Search for 5: " + linearSearch(list, 5));
        System.out.println("Binary Search for 7: " + binarySearch(list, 7));
    }
}

























