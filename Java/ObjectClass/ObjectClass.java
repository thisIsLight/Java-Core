/*
 * 
 * Every class implements the Object class
 * 
 * toString()
 * equals()
*/

package ObjectClass;

public class ObjectClass {
    public static void main(String args[]){
        A obj = new A();
        System.out.println(obj);
    }
}


class A{
    public String toString(){
        return "Hey";
    }
}