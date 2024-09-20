/*
 * 
 * What is stream api ?
 * 
 * Same as the array oprations from javascript. We can't reuse it.
 * 
 * 
 * filter -> does filtering
 * map -> same length data. Does the work on each one
 * reduce -> returns one value
 * 
 * 
 * filter -> map -> reduce
 * 
 * .sorted() -> returns sorted stream
 * 
 * parallelStream
*/

package Stream;

import java.util.*;
import java.util.stream.Stream;

public class Introduction {
    public static void main(String args[]){
        
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7);
        
        nums.forEach((a) -> {
            System.out.println(a);
        });

        Stream<Integer> sNums = nums.stream();

        System.out.println(sNums);
    }
}
