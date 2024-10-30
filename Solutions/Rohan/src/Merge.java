import java.util.Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Merge merger = new Merge();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merger.merge(nums1, m, nums2, n);

       /* int[] nums1 = {1};
        int m = 1;
        int[] nums2= {0};
        int n = 0;
        merger.merge(nums1, m, nums2, n);*/


        /*int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merger.merge(nums1, m, nums2, n);*/
    }
}