/*
 * 
 * Statements : 
 * 
 *      Normal Statement   -> Kid running in hotel
 *      Critical Statement -> Kid running on road
 * 
 * Types of errors : 
 * 
 *      Compile time Errors - Doesnt let the program work
 *      Runtime Errors      - Stops the application -> These needs to be handles and they are called exceptions
 *      Logical Errors      - More of business logics
 * 
 * ------------------------------------------------------------------------------------------------------------------
 * 
 * How we handle : 
 * 
 *      Put the critical code in a different  block.
 *      This block is called a try-catch block.
 *      
 *      Anything that is after the try catch, that is processed automatically.
 * 
 * Exception Hierrachy ----> 
 * 
 *      Object --> Throwable   --------------------------> Exceptions   --------> Caught at Compilation (Checked) Arithmetic, ArrayIndex
 *                    |                                        |
 *                    |                                        |
 *                    |                                         ---------------> Caught during Runtime (Unchecked) SQL Exceptions
 *                    |
 *                    |
 *                     ---------> Errors (Break) IOError, Thread Death, OutOfMemory
 *                      
 * 
 * --------------------------------------------------------------------------------------------------------------------
 * 
 * Create new Custom Exceptions : 
 * 
 *      Extend the Exception Class and implement your code in the exception
 * 
 * 
 * --------------------------------------------------------------------------------------------------------------------
 * 
 * Throws Exception
 * 
 *      We add throws Exception at the end of the method. (Checked Exceptions)
 *      Basically tell the calling method that this method is going to throw an exception
 * 
 *      You can throw the exception. JVM simply stops the exception.
 * 
*/

package Exceptions;

public class Exceptions {
    public static void main(String args[]){
        int a = 12;

        try{
            a = a/0;
        }
        catch(ArithmeticException e){
            System.out.println("We got an error");
        }
        catch(ArrayIndexOutOfBoundsException e){

        }
        catch(Exception e){

        }
        finally{
            //used for closing connection. Always called
        }

        System.out.println("We are still running after the error occured");

        A objA = new A();
        objA.DoSomething(null); 

        // B objAB = new B();
        // objAB.DoSomething(null); //-> Won't work

        try{
            B objB = new B();
            objB.DoSomething(null);
        }
        catch(Exception e){

        }
    }
}

//Create your owm exceptions

class UncheckedException extends RuntimeException{
    public UncheckedException(String string){
        super(string);
    }
}

class CheckedException extends Exception{
    public CheckedException(String string){
        super(string);
    }
}

class A{
    public void DoSomething(String string) throws UncheckedException{
        
    }
}

class B{
    public void DoSomething(String string) throws CheckedException{
        
    }
}

