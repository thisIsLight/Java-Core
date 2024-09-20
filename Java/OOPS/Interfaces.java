/*
 * 
 * Interfaces -> When everything is abstract. 
 * It has all methods as public abstract by default.
 * Cannot be instantiated.
 * 
 * Variables in Interface are => Final and Static
 * 
 * 
 * Why Interfaces -> developer takes laptop. He can also take desktop. Now instead of passing Laptop as parameter, we can pass IComputer and it can take both.
 * 
*/

package OOPS;

public class Interfaces {
    
}

interface Car{

    int age = 24;  // they are final and static

    void Drive();
}

interface Fuel{

    void Refuel();
}

class Merc implements Car, Fuel{
    public void Drive(){

    }

    public void Refuel(){
        
    }
}
