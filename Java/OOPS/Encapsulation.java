/*
 * 
 * We encapsulate data related to the same object using class
 * We keep the properties private so that we can have getter and setter
 * This way, no one can access directly and needs to call the api we write for access
 * 
*/

package OOPS;

public class Encapsulation {
    
}

class Cars{
    private String Name;
    private String Color;

    public Cars() {
        super();
        System.out.println(Name + Color);
    }
}
