/*
 * 
 * Interface which only has one method
 * 
 * Lambda methods are used only with FI.
 * Basically helps us in directly implementing the interface.
 * 
 * Lambda -> doesn't create new method
 * 
 * Types of interfaces : 
 * 
 *      Normal Interface - More than one methods
 *      Functional INterface (SAM) - Only methods
 *      Market Interface - No methods
*/

package InterfaceTypes;

public class FunctionalInterfaces {
    public static void main(String args[]){
        
        //older way
        A obj1 = new A(){
            public void DoSomething(){
                System.out.println("Do Something 1");
            }
        };

        A obj2 = () -> {
            System.out.println("Do Something 2");
        };

        obj1.DoSomething();
        obj2.DoSomething();
    }
}

@FunctionalInterface
interface A {
    void DoSomething();
}
