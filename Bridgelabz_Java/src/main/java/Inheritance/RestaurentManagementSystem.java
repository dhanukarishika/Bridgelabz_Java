/*
 * This program demonstrates interface implementation and inheritance in Java.
 * Chef and Waiter inherit common person details and implement the worker interface.
 */

package Inheritance;

class Persoon{
    String name;
    int id;

    // Constructor to initialize the person's name and ID
    Persoon(String name, int id){
        this.name = name;
        this.id = id;
    }
}

interface worker{

    // Defines the duty that every worker must perform
    void performDuties();
}

class Chef extends Persoon implements worker{

    // Calls the parent constructor to initialize chef details
    Chef(String name, int id){
        super(name, id);
    }

    // Implements the performDuties() method for the Chef
    public void performDuties(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("I am chef i cook food");
    }
}


class Waiter extends Persoon implements worker{

    // Calls the parent constructor to initialize waiter details
    Waiter(String name, int id){
        super(name, id);
    }

    // Implements the performDuties() method for the Waiter
    public void performDuties(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("I am waiter i serve customers");
    }
}


public class RestaurentManagementSystem {
    public static void main(String[] args){

        // Creating objects for Chef and Waiter
        Chef chef = new Chef("Akhil",324);
        Waiter waiter = new Waiter("Charan",4234);

        // Calling the respective duties of each worker
        chef.performDuties();
        System.out.println();
        waiter.performDuties();
    }
}