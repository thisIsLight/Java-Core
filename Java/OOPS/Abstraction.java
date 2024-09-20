/*
 * 
 * Abstraction : When you don't know the complete implementation of the components
 * 
 * Object of abstract class cannot be created
 * 
 * 
*/

package OOPS;

public class Abstraction {
    public static void main(String args[]){
        Merc car = new Merc();
        car.Drive();
        car.Refuel();
    }
}


abstract class Car{

    //abstract method that can be implemented by the inheriting class
    public abstract void Drive();

    //concrete implementation of the method
    public void Refuel(){
        System.out.println("Putting petrol");
    }
}

class Merc extends Car{

    public void Drive(){
        System.out.println("Driving Merc");
    }
}

