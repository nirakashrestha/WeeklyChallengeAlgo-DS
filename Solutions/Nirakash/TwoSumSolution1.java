package Solutions.Nirakash;
import java.util.Map;
import java.util.HashMap;

public class TwoSumSolution1 {
    public static void main(String[] args) {
        TwoSumSolution1 t = new TwoSumSolution1();
        int[] nums = {2,7,11,15};
        int[] result = t.twoSum(nums, 17);
        System.out.println("The two indices are: (" + result[0] + "," + result[1] + ")");
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();  // To store the value and its index
        
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return new int[] { i, hashMap.get(nums[i]) };  // Return the current index and the previously stored index
            } else {
                hashMap.put(target - nums[i], i);  // Store the required complement and its index
            }
        }
        
        // Return an empty array if no solution is found (though problem usually assumes there is a solution)
        return new int[] {};
    }
}
