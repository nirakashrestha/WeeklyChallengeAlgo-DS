package Solutions.Nirakash;

import java.util.Arrays;

public class RemoveElement {

    public static void removeElement(int[] nums, int val) {

        Arrays.sort(nums);
        String[] resultArray = new String[nums.length];
        int underscoreCount = 0;
        int index = 0;
        for (int num : nums) {
            if (num == val) {
                underscoreCount++;
            } else {
                resultArray[index++] = String.valueOf(num);
            }
        }
        for (int i = resultArray.length - underscoreCount; i < resultArray.length; i++) {
            resultArray[i] = "_";
        }

        System.out.print("Value of K is " + underscoreCount);
        System.out.print("\n");
        System.out.println("Resulting array: ");
        for (String string : resultArray) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {

        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        removeElement(nums, val);

    }

}
