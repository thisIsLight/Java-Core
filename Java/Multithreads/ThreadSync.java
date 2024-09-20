/*
 * 
 * When we access/change same thing using two different threads. This might make the operation not thread safe
 * 
 * Thread Safe : Only one thread can do one thing at one time.
 * 
 *      1) Synchronized to be added on the method
 * 
*/


package Multithreads;

public class ThreadSync {

    public static void main(String args[]) throws Exception{
        Counter crititcalCode = new Counter();

        Runnable r1 = () -> {
            for(var i=0;i<10000000;i++)
            crititcalCode.increment();
        };
        Runnable r2 = () -> {
            for(var i=0;i<1000000000;i++)
            crititcalCode.increment();
        };
    
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.run();
        t2.run();

        t1.join();
        t2.join();

        System.out.println(crititcalCode.count);
    }
}

class Counter{
    public int count = 0;

    public synchronized void increment(){
        count++;
    }
}