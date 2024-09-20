/* 
 * Primitive =>>
 * 
 * int -> byte(8 bits), short(16 bits), int(32 bits), long(64 bits)
 * float -> float(32 bits), decimal(64 bits)
 * chars -> char(16 bits)
 * bool -> true or false (No 0/1)
 * 
 * ----------------------------------------------------------------------
 * 
 * Immutable
 * String -> Class
 * 
 * 
 * Muttable
 * StringBuffer -> Thread Safe
 * 
 * 
 * StringBuilder -> Not Thread Safe
 * 
 * 
 *  * ----------------------------------------------------------------------
*/
package Variables;

public class One {
    public static void main(String args[]){
        
        //Integers
        long longNumber = 5l;
        float floatNumer = 5f;

        double result = longNumber+floatNumer;
        System.out.println(result);
    }
}
