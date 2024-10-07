/*CLARIFYING QUESTIONS
Are the linked lists already sorted? - Yes
Can one or both lists be empty? - Yes
Do we need to modify the original lists? - No
*/


/*THOUGHT PROCESS
Both lists are sorted. First I will compare the first number of both list.
If they are the same, add both to the merged list.
If one is smaller, add that one to the merged list.
Move to the next number in the list we just took from.
Repeat until we reach the end of one list.
After one list is fully processed, there may still be numbers left in the other list.
Add all remaining numbers from the other list to merged list.
Finally, print the merged list.*/



import java.util.LinkedList;

public class MergeSortLinkedList {
    public static void main(String[] args) {

        // Create two lists
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        LinkedList<Integer> mergedList = new LinkedList<Integer>();

        // Adding numbers
        list1.add(1);
        list1.add(2);
        list1.add(4);

        // Adding numbers
        list2.add(1);
        list2.add(3);
        list2.add(4);


        int index1 = 0;
        int index2 = 0;

        while (index1 < list1.size() && index2 < list2.size()) {
            int num1 = list1.get(index1);
            int num2 = list2.get(index2);

            if (num1 == num2) {
                mergedList.add(num1);
                mergedList.add(num2);
                index1++;
                index2++;
            } else if (num1 < num2) {
                mergedList.add(num1);
                index1++;
            } else {
                mergedList.add(num2);
                index2++;
            }
        }

        while (index1 < list1.size()) {
            mergedList.add(list1.get(index1));
            index1++;
        }

        while (index2 < list2.size()) {
            mergedList.add(list2.get(index2));
            index2++;
        }

        System.out.println(mergedList);
        System.out.println("-----------------------------------");

    }
}
