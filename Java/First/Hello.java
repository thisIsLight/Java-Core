/*

 * JDK contains JRE which contains JVM
 * 
 * JRE+JVM is enough to run a code
 * JDK is needed for developing.
 * 
 * 
 * Two types of Memory in JVM :
 * 
 * Stack -> 
 *  All the variables are stored here for a method
 *  This contains the address of the object in the method.
 * 
 * Heaps -> 
 *  Objects created in Heap. 
 *  All instance variables (properties of the object only. All local are present in stack)
*/

package First;

public class Hello {
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}
