/* CLARIFYING QUESTIONS 
 1. Can i assume there is always a two indices that adds to the target?
 2.Can i use a brute force approach and solve it with a time complexity of O(n^2)?
 3: Is there only one pair of indices that adds up to the target value or multiple pair of indices? If multiple 
 then do i need to return multiple pairs or just the one which ever i find the soonest.

*/


/*ThoughtProcee/Approach
 
The first approach that comes to mind is the brute force method. 
In this approach, I will iterate through the list of numbers and, for each element, check every subsequent element to see if their sum equals the 
target value.

While this approach guarantees a solution, it is not optimal in terms of time complexity, 
as it requires checking all pairs, resulting in a time complexity of O(n²), where n is the number of elements in the list.
  
 */


 /*Complexity
    Time Complexity: O(n^2)
    It requires checking all pairs, resulting in a time complexity of O(n²), where n is the number of elements in the list.




    Space Complexity:O(1) 
    The space complexity of the brute force approach for the TwoSum problem is O(1). 

    The algorithm uses a constant amount of extra space regardless of the input size. You only need a few variables to store the indices of the elements and the target sum.
    The input list itself does not count toward space complexity since we are not using any additional data structures to store intermediate results or other data.
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

    public static void main(String[] args){
        TwoSum t = new TwoSum();
        int[] nums = {2,7,11,15};
        int[] result = t.twoSum(nums, 9);
        System.out.println("The two indices are: (" + result[0] + "," + result[1] + ")");

    }
}