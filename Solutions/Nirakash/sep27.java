package Solutions.Nirakash;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * sep27
 */
public class sep27 {


    public static void main(String[] args) {
        
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        LinkedList<Integer> result = new LinkedList<Integer>();

        l1.add(1);  l1.add(2);  l1.add(4);
        l2.add(1);  l2.add(3);  l2.add(4); //l2.add(6); l2.add(8);

        /*
        Thought process -        
        
        1. compare first index of l1 against first index of l2
        2. If they are equal add both to result LL, if not equal add which everis smaller
        3.1 In 2nd step - if l1(0) was added to result LL, compare l1(1) with l2(0)
        3.2 In 2nd step - if l2(0) was added to result LL, compare l1(0) with l2(1)
        3.3 In 2nd step - if both l1(0) l2(0) was added to result LL, compare l1(1) with l2(1)
        3.4 Add smaller element from comparision result from one of the steps in 3.1, 3.2 or 3.3
        4. Repeat step 1-3 until either l1 or l2 !isEmpty()
        
        */
        int x=0,y=0;
        int index_x = 0, index_y=0;

        int l1Size = l1.size();

        int l2Size = l2.size();

        // x=l1.get(index_x);
        // y=l2.get(index_y);
        

        while (l1Size > 0 && l2Size > 0) {

            x=l1.get(index_x);
                y=l2.get(index_y);

            if (x == y) {
                //result.add(index_x, x);
                result.add(x);
                //result.add(index_y, y);
                result.add(y);
                index_x++;
                index_y++;
                l1Size--;
                l2Size--;

            } else if (x < y) {
                //result.add(index_x, x);
                result.add(x);
                index_x++;
                l1Size--;
            } else {
                //result.add(index_x, x);
                result.add(y);
                index_y++;
                l2Size--;
            }
        } // end while
        
        while(l1Size > 0){
            result.add(l1.get(index_x));
            l1Size--;
            index_x++;
        }

        while(l2Size > 0){
            result.add(l2.get(index_y));
            l2Size--;
            index_y++;
        }

      Iterator it = result.iterator();

      while(it.hasNext()){
        System.out.println(it.next());
      }
        
    }
    
}