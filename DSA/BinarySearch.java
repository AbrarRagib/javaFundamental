// import java.util.Arrays;

// public class BinarySearch{
	
// 	// binary search = Search algorithm that finds the position
// 	//				   of a target value within a sorted array.
// 	//				   Half of the array is eliminated during each "step"
	
// 	public static void main(String[] args) {
		
// 		int array[] = new int[1000000];
// 		int target = 777777;
		
// 		for(int i = 0; i < array.length; i++) {
// 			array[i] = i;
// 		}
		
// 		//int index = Arrays.binarySearch(array, target);
// 		int index = binarySearch(array, target);
		
// 		if(index == -1) {
// 			System.out.println(target + " not found");
// 		}
// 		else {
// 			System.out.println("Element found at: " + index);
// 		}
		
// 	}

// 	private static int binarySearch(int[] array, int target) {
		
// 		int low = 0;
// 		int high = array.length - 1;
		
// 		while(low <= high) {
			
// 			int middle = low + (high - low) / 2;
// 			int value = array[middle];
			
// 			System.out.println("middle: " + value);
			
// 			if(value < target) low = middle + 1;
// 			else if(value > target) high = middle - 1;
// 			else return middle; //target found
// 		}
		
// 		return -1;
// 	}
// }

























public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72}; // Sorted array
        int target = 72;

        int result = binarySearch(numbers, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // To avoid overflow

            if (arr[mid] == target) {
                return mid;  // Found
            } else if (arr[mid] < target) {
                left = mid + 1;  // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }
        return -1;  // Not found
    }
}
