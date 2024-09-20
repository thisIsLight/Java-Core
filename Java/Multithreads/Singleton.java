/*
 * 
 * How we can break the SIngleton
 * 
 *      Clonable -> Since its clonable, you will be able to create more than one clone => We can throw exception when clonable is implemented
 *      
 *      Refelction -> 
 * 
 * 
*/


package Multithreads;

public class Singleton {
    public static void main(String args[]){

    }
}

class Singletons{
    public static Singletons Instance = null;

    
    private Singletons() {
        
    }

    //Simple checks
    public Singletons getInstanceSimple(){
        if(Instance != null){
            Instance = new Singletons();
        }
        return Instance;
    }

    //synchronized checks => issue with the performance. Only one can go once hence everyone waits
    public synchronized Singletons getInstanceSync(){
        if(Instance != null){
            Instance = new Singletons();
        }
        return Instance;
    }

    //Double check and Locking
    public Singletons getInstanceDoubleCheck(){
        if(Instance != null){
            synchronized(Singletons.class){
                if(Instance != null){
                    Instance = new Singletons();
                }
            }
        }
        return Instance;
    }

}


enum A{
    Instance;
    int i;

    public void show(){

    }
}


