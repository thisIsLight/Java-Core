/*
 * 
 * IS -> Fortuner is a Car
 * 
 * HAS -> CPU has motherboard
 * 
*/

package OOPS;

public class Inheritance {
    
    public static void main(String args[]){
        Fortuner fortuner = new Fortuner();

        String result1 = fortuner.Drive();
        String result2 = fortuner.OpenRoof();

        System.out.println(result1+result2);

    }
}

class Car{
    public String Drive(){
        return "Driving";
    }
}

class Fortuner extends Car{
    public String OpenRoof(){
        return "Opening Roof";
    }
}