/*
 * CLARIFYING QUESTIONS
 * Are both lists guaranteed to have elements or could they be empty?
 * Can they have duplicates?
 */


/*
 * Thought Process
 * Since both lists are sorted, i can use a two pointer technique by iterating over the lists  simaltaneously.
 * I will compare the node from each list, place the smaller element in the result and move the pointer to next from which the element was taken.
 * if any one of the list is exhausted before the other, we can just append the elements of other list to the result.
 */

 /*
  TIME COMPLEXITY : Since both lists are already sorted, i can merge them in one pass. Therefore, 
                time complexity is O(l1 + l2) where l1 and l2 is the size of the list1 and list2.
  
  SPACE COMPLEXITY: space complexity is also O(l1 + l2) because we need to store the result and result size is l1 + l2.
  
  if we do not consider output variable (result) then space complexity is O(1);
  */


class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class MergeTwoSortedList{

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode head = preHead;

        while(list1 != null && list2 != null){
            if(list1.data < list2.data){
                preHead.next = list1;
                list1 = list1.next;
                preHead = preHead.next;
            }
            else if(list1.data > list2.data){
                preHead.next = list2;
                list2 = list2.next;
                preHead = preHead.next;
            }
            else{
                preHead.next = list1;
                preHead = preHead.next;
                preHead.next = list2;
                preHead = preHead.next;

                list1 = list1.next;
                list2 = list2.next;
            }
        }

        if(list1 != null){
            preHead.next = list1;
        }

        if(list2 != null){
            preHead.next = list2;
        }

        return head.next;
    }

    public static void main(String[] args){

        MergeTwoSortedList inst = new MergeTwoSortedList();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(7);

        l1.next = l2;
        l2.next = l3;

        ListNode m1 = new ListNode(3);
        ListNode m2 = new ListNode(8);

        m1.next = m2;

        ListNode result = inst.mergeTwoLists(l1, m1);
        
        while(result != null){
            System.out.println(result.data);
            result = result.next;
        }
    }
}