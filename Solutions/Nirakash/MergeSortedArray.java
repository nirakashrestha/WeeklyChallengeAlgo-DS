package Solutions.Nirakash;

/**
 * MergeSortedArray
 */

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 4, 5, 6 };

        MergeSortedArray.merge(nums1, 1, nums2, 2);

        for (int e : nums1) {
            System.out.println(e);
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int currentNonZero = -1;
        int firstZeroIndex = -1;

        // find last element in nums1 that is nonzero
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                firstZeroIndex = i;
                break;
            }

            currentNonZero = nums1[i];
        }

        // compare with first element in nums2 and start appending to nums1
        if (currentNonZero < nums2[0]) {
            int j = 0;
            for (int i = firstZeroIndex; i < nums1.length; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        }

    }
}