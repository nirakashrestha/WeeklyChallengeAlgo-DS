/*
 * Clarifying Question:
 * As stated in the question, both the arrays are already sorted and there are n elements in the first array that is set to 0s to accomodate the elements 
 * in the second array.
 * 
 * can any one of the array be empty?
 * Can there be duplicate elements?
 * 
 * Approach: 
 * Looking at the question, i think we can solve this using two pointer technique. Actually i will define three pointers. l for first array set to m - 1, 
 * r for second array set to n - 1, and K for m + n - 1 for placing largest element from the end of the first array.
 *  Since both the array are in ascending order, I will iterate the element 
 * from end of the array. compare element at l and r and which ever is the largest, we will take the element and put it at the k index and decrement the k index by 1. Also, we will
 * decrement the index (either l or r) of the array from which the largest element is taken. Again we will do the same thing and take the largest element and decrement the 
 * index.  
 * 
 * This way, we can merge both the array. The main idea here is to iterate the array from the end instead of start.
 * 
 * Time Complexity: O(m + n)
 * 
 * Space Complexity: O(1), regardless of the size of the input, we will be using constant space and no extra space.
 * 
 * 
 */


public class MergeTwoSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;

        int l = m - 1;
        int r = n - 1;

        while(k > 0){
            if(l > 0 && r > 0 && nums1[l] > nums2[r]){
                nums1[k] = nums1[l];
                l--;
            }
            else if(r > 0){
                nums1[k] = nums2[r];
                r--;
            }

            k--;
        }
    }

    public static void main(String[] args){
        MergeTwoSortedArray ma = new MergeTwoSortedArray();
        int[] nums1 = {1,2,3,0,0,0}; 
        int m = 3; 
        int[] nums2 = {2,5,6};
        int n = 3;

        ma.merge(nums1, m, nums2, n);
    }

    
}
