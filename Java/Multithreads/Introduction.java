/*
 * 
 * Software to add two numbers -> Goes to OS -> It takes Hardware.
 * 
 * Now, when you have multiple softwares running. This is something the OS should support.
 * 
 * Also, it is possible to run one task into smaller parts.
 * Dividing your task into smaller units.
 * 
 * Game Example : Rendering, Audio, Video - All are running in different thread.
 * 
 * Game is Task. Rendering, Audio, Video are threads.
 * 
 * 
 * 
 * Thread States : 
 * 
 * 
 *      New  -------> Runnable  <--------------------------
 *                       |                               `|`
 *                       | run()                          |  notify()
 *                      .|.            sleep()            |
 *                    Running ------------------------> Wait()
 *                       |              wait()
 *                       |
 *                stop() |
 *                       |
 *                      .|.
 *                     Dead
*/

package Multithreads;

public class Introduction {
    public static void main(String args[]){
        var obj1 = new A();
        var obj2 = new B();

        //These two will be in order
        try
        {
            obj1.Show();
            obj2.Show();
        }
        catch(Exception e){

        }
        

        System.out.println("With threads");
        //Say I want to execute two things at the same time
        //How to make an object as thread ??

        // Inherit the Runnable Interface -> Call the Start -> Implement a run method
        // Priority -> 10 is high priority. You can set priority as well using SetPriority
        // Create a thread and pass the runnable object

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


        // We can also create lambda for the runnable

        Runnable runnableObj = () -> {
            for(var i=0;i<5;i++){
                System.out.println("C");
                try{Thread.sleep(10);}catch(Exception e){}
            }
        };

        var t3 = new Thread(runnableObj);
        t3.start();
    }   
}


class A implements Runnable {
    public void Show() throws Exception{
        for(var i=0;i<5;i++){
            System.out.println("A");
            Thread.sleep(10);
        }
    }

    public void run(){
        try
        {
            Show();
        }
        catch(Exception e){

        }
    }
}

class B implements Runnable{
    public void Show() throws Exception{
        for(var i=0;i<5;i++){
            System.out.println("A");
            Thread.sleep(10);
        }
    }

    public void run(){
        try
        {
            Show();
        }
        catch(Exception e){

        }
    }
}