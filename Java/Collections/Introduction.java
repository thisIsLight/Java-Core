/*
 * Three things : 
 * 
 *      Collections API  -> Concept
 *      Collection       -> Interface
 *      Collections      -> Classes
 * 
 * Whenever you want to group the elements. We can use arrays. But the size is fixed.
 * 
 * All data structures are implemented in the collections
 * 
 * Queue
 * Stack
 * List
 * LinkedLists
 * Heaps
 * Sets
 * HashTables
 * TreeSets
 * Dictionary
 * 
 * 
 * import java.util.*
 * 
 * 
 *                                                       Collection Interface
 *      
 *          List                                              Queue                                        Set
 *           |                                                  |                                           |
 *           -> ArrayList                                       -> Dequeue                                  -> HashSet
 *           -> LinkedList                                                                                  -> Linked hashSet
 *                                                                                                          -> TreeSet
 * 
 *  Maps 
 *      -> HashMap 
 *      -> HashTable (threadSafe)
 * 
 * 
 * Comparator is passed to the sort.
 * Comparable is implemented. You implement the compareTo()
 * 
*/


package Collections;

import java.util.*;

public class Introduction {
    public static void main(String args[]){
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2); 
        list.add(3);
        list.add(4);

        Comparator<Integer> cmp = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                return i-j;
            }
        };

        Collections.sort(list, cmp);

        System.out.println(list);
    }
}
