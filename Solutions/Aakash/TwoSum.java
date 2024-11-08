import java.util.HashMap;

/* CLARIFYING QUESTIONS 
 1. Can i assume there is always a two indices that adds to the target?
 2.Can i use a brute force approach and solve it with a time complexity of O(n^2)?
 3: Is there only one pair of indices that adds up to the target value or multiple pair of indices? If multiple 
 then do i need to return multiple pairs or just the one which ever i find the soonest.

*/


/*ThoughtProcess/Approach
 
The first approach that comes to mind is the brute force method. 
In this approach, I will iterate through the list of numbers and, for each element, check every subsequent element to see if their sum equals the 
target value.

While this approach guarantees a solution, it is not optimal in terms of time complexity, 
as it requires checking all pairs, resulting in a time complexity of O(n²), where n is the number of elements in the list.

Second/Third Approach:

A HashMap is suitable for this problem because it provides average O(1) time complexity for insertions and lookups. 
This allows us to quickly check if the complement of the current number exists in the map.

I will iterate through the array while maintaining a HashMap to track the numbers and their indices that we have seen so far.
For each number in the array, I’ll calculate its complement by subtracting it from the target.
I’ll check if this complement exists in the HashMap. If it does, I’ll return the current index and the index of the complement from the HashMap.

Edge cases:

If the array has fewer than two elements, we cannot find a pair, so we should handle that case upfront.
Ensuring that the two numbers being returned are not the same index by checking if their indices differ.
 */


 /*Complexity
    
    twoSum
    Time Complexity: O(n^2)
    It requires checking all pairs, resulting in a time complexity of O(n²), where n is the number of elements in the list.
    
    twoSumII
    Time Complexity: O(N)

    twoSumIII
    Time Complexity: O(N)



    Space Complexity:O(1) 
    The space complexity of the brute force approach for the TwoSum problem is O(1). 

    The algorithm uses a constant amount of extra space regardless of the input size. You only need a few variables to store the indices of the elements and the target sum.
    The input list itself does not count toward space complexity since we are not using any additional data structures to store intermediate results or other data.
    
    twoSumII
    Space Complexity: O(N)

    twoSumIII
    Space Complexity: O(N)
 
    */



public class TwoSum{

    //Brute Force Approach
    public int[] twoSum(int[] nums, int target) {
       for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                int b = nums[j];
                if((a + b) == target){
                    return new int []{ i, j};
                }
            }
       }

       return new int[]{};
    }

    //Better approach with a time complexity of O(N).
    public int[] twoSumII(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], i);
        } //O(N)

        for(int i = 0; i < nums.length; i++){
            int a = nums[i];
            int b = target - a;
            if(hashMap.containsKey(b) && hashMap.get(b) != i){
                return new int[] {hashMap.get(b), i };
            }
        } //O(N)

        //Total = O(N+N) = O(N)
        return new int[] {};

    }

    //Approach with One Pass O(N)

    public int[] twoSumIII(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(nums[0], 0);

        for(int i = 0; i < nums.length; i++){
            int b = target - nums[i];
            if(hashMap.containsKey(b) && hashMap.get(b) != i){
                return new int[] {i, hashMap.get(b)};
            }
            
            hashMap.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args){
        TwoSum t = new TwoSum();
        int[] nums = {2,7,11,15};
        int[] result = t.twoSumIII(nums, 9);
        System.out.println("The two indices are: (" + result[0] + "," + result[1] + ")");

    }
}