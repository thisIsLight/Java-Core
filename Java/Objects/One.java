/*
 * Object is a entity that has two things :
 * 
 * It has property
 * It has a behavior
 * 
 * ----------------------------------------------|
 * 
 * Accessor Controls : 
 *      
 *      public  -> Access publically
 *      private -> only for that class
 *      protected -> Same package, other package only if inherited
 *      default -> Same package
 * 
 * Static/Finals : 
 * 
 *      static  -> Static, doesn't need the ctor. Shared by all the objects. Called with the name of the class. Class cannot be static
 *      final -> works differently for different things
 *              variables -> don't change
 *              methods -> no overriding for a method
 *              class -> stops inheritance. Can't be extended.
 * 
 * Return Types : 
 *      
 *      void    -> Return type of the method
 * 
 * Function Name : 
 *      
 *      main    -> name of the method
 * 
 * Arguments : 
 *      (String args[]) -> arguments to the method
 * 
*/

package Objects;

public class One {

    //Start of Execution
    public static void main(String args[]){
        
        //create the object
        MusicBox.PlayMusic("Numb");
    }
} 

class MusicBox{
    public static void PlayMusic(String nameOfSong){
        System.out.println("Playing : "+nameOfSong);
    }
}