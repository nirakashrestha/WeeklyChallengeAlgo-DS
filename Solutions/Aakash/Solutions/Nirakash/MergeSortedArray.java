package Solutions.Nirakash;

/**
 * MergeSortedArray
 */

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 4, 0, 0, 0};
        int[] nums2 = { 3, 5, 6 };

        // int[] nums1 = {1,0};
        // int[] nums2 = {};


        MergeSortedArray.merge(nums1, nums2);

        for (int e : nums1) {
            System.out.print(e+ " ");
        }

    }

    public static void merge(int[] nums1, int[] nums2) {

        int lastNonZeroNum1 = -1;
        int firstZeroIndexNum1 = -1;

        // find first index of num1 that is 0 and first element of num1 that is nonzero
        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] == 0) {
                firstZeroIndexNum1 = i;
                break;
            }

            lastNonZeroNum1 = nums1[i];
        }

        // compare lastNoneZeroNum1 with first element of num2
        if (lastNonZeroNum1 <= nums2[0]) {
            int j = 0;
            for (int i = firstZeroIndexNum1; i < nums1.length; i++) { //start appending firstZeroIndexNum1 with remeaning elements of num2
                nums1[i] = nums2[j]; 
                j++;
            }
        }
        else{

            nums1[firstZeroIndexNum1] = lastNonZeroNum1; //move last nonzeronum1 to index of first 0
            nums1[firstZeroIndexNum1-1] = nums2[0]; //put first element of num2 to just before index of num1 where 0 element is found

            int j = 1; 
            for (int i = firstZeroIndexNum1 + 1; i < nums1.length; i++) { 
                //start appending firstZeroIndexNum1 with remeaning elements of num2. 
                //note that first element of num2 is already assigned, so start appending from 2nd element of num2 to num1
                nums1[i] = nums2[j];
                j++;
            }

        }
        

    }
}