import java.util.*;

public class TwoSumSolution {
    
    // Approach 1: Brute Force - O(n²) time, O(1) space
    public static int[] twoSumBruteForce(int[] nums, int target) {
        System.out.println("Using Brute Force Approach:");
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("Checking: nums[" + i + "] = " + nums[i] + 
                                 " + nums[" + j + "] = " + nums[j] + 
                                 " = " + (nums[i] + nums[j]));
                
                if (nums[i] + nums[j] == target) {
                    System.out.println("Found match! Returning [" + i + ", " + j + "]");
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
    
    // Approach 2: HashMap - O(n) time, O(n) space
    public static int[] twoSumHashMap(int[] nums, int target) {
        System.out.println("Using HashMap Approach:");
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("Index " + i + ": nums[" + i + "] = " + nums[i] + 
                             ", looking for complement = " + complement);
            
            if (map.containsKey(complement)) {
                int complementIndex = map.get(complement);
                System.out.println("Found complement " + complement + 
                                 " at index " + complementIndex);
                System.out.println("Returning [" + complementIndex + ", " + i + "]");
                return new int[]{complementIndex, i};
            }
            
            map.put(nums[i], i);
            System.out.println("Added nums[" + i + "] = " + nums[i] + " to map");
        }
        return new int[]{}; // No solution found
    }
    
    // Test method to run examples
    public static void main(String[] args) {
        // Example 1
        System.out.println("=== EXAMPLE 1 ===");
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Input: nums = " + Arrays.toString(nums1) + ", target = " + target1);
        System.out.println();
        
        int[] result1 = twoSumBruteForce(nums1, target1);
        System.out.println("Result: " + Arrays.toString(result1));
        System.out.println();
        
        int[] result1_hash = twoSumHashMap(nums1, target1);
        System.out.println("Result: " + Arrays.toString(result1_hash));
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Example 2
        System.out.println("=== EXAMPLE 2 ===");
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("Input: nums = " + Arrays.toString(nums2) + ", target = " + target2);
        System.out.println();
        
        int[] result2 = twoSumHashMap(nums2, target2);
        System.out.println("Result: " + Arrays.toString(result2));
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Example 3
        System.out.println("=== EXAMPLE 3 ===");
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println("Input: nums = " + Arrays.toString(nums3) + ", target = " + target3);
        System.out.println();
        
        int[] result3 = twoSumHashMap(nums3, target3);
        System.out.println("Result: " + Arrays.toString(result3));
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        // Performance comparison
        System.out.println("=== PERFORMANCE ANALYSIS ===");
        System.out.println("Brute Force Approach:");
        System.out.println("- Time Complexity: O(n²)");
        System.out.println("- Space Complexity: O(1)");
        System.out.println("- For each element, check all remaining elements");
        System.out.println();
        
        System.out.println("HashMap Approach:");
        System.out.println("- Time Complexity: O(n)");
        System.out.println("- Space Complexity: O(n)");
        System.out.println("- Single pass through array, constant time lookup");
        System.out.println("- RECOMMENDED for large datasets");
    }
}