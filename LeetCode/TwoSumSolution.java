package LeetCode;
import java.util.HashMap;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // store number -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // check if complement exists in map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; 
            }

            // store current number with its index
            map.put(nums[i], i);
        }

        // no solution case (though problem says one always exists)
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

