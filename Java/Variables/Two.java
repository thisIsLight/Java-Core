/* 
 * Non - Primitive =>>
 * 
 * Arrays => int num[]
 * Collections => They can contain many things in one go.
 * ----------------------------------------------------------------------
*/

package Variables;

public class Two {
    public static void main(String args[]){

        int array[] = new int[10];
        System.out.println(array[0]);


        for(int i : array){
            System.out.println(i);
        }
    }
}


