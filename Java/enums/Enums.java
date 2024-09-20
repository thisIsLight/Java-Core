/*
 * 
 * enums are named constants
 * 
 * 
 * enum.ordinal()
 * enum.values()
 * 
 * We can add ordinal is custom manner by adding a private ctor and a value.
*/

package enums;

public class Enums {
    public static void main(String args[]){

        Status stat = Status.Running;
        int ordinal = stat.ordinal();
        Status allStatus[] = Status.values();

        System.out.println(stat);
        System.out.println(ordinal);
        System.out.println(allStatus);
    }
}

enum Status{
    Running(1), Failed(2), Pending(3), Success(4);

    private int Id;

    private Status(int id) {
        this.Id = id;
    }

    public int getter(){
        return Id;
    }
}
