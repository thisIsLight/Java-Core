package InterfaceTypes;

public class DefaultMethod {
    public static void main(String args[]){
        C obj = new C();
        obj.show();
    }
}


interface IA {
    default void show(){
        System.out.println("Inside interface A");
    }    
}

interface IB {
    default void show(){
        System.out.println("Inside interface A");
    }    
}

class C implements IA, IB{

    public void show(){
        IA.super.show();
    }
}