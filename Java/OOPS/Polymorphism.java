/*
 * 
 * Polymorphism : Maby forms of same thing
 * 
 * Compile time -> overloading
 * 
 * Runtime -> Overriding
 * 
 * 
*/

package OOPS;

public class Polymorphism {

    public static void main(String args[]){
        A obj1 = new A();
        A obj2 = new B();
        
        obj1.Show();
        obj2.Show();//obj2.ShowNow(); // since the type is A

        B obj3 = new B();
        obj3.Show();
        obj3.ShowNow();

        //B obj4 = new A();
    }
    
}

class A{
    public void Show(){
        System.out.println("Here");
    }
} 

class B extends A{
    public void ShowNow(){
        System.out.println("Here Now");
    }
}
