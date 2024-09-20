/*
 * 
 * What is the requirement ? 
 * 
 *      We get behaviour of class, fields of the class. You can access everything using reflection
 * 
 * 
 * What are the steps ? 
 * 
 *      Create an instance of the Class Object using Class.forName()
 *      Use this instance to get the new instance of this class -> c.getInstance(). You can save it in var
*/

package Reflections;


public class Introduction {
    public static void main(String args[]) throws Exception{

        

    }
    

}


class A{
    private A() {
        super();
        System.out.println("A.A()");
    }
}