/*
 * This program demonstrates multilevel inheritance and method overriding in Java.
 * An order moves through different stages, and each child class provides its own order status.
 */

package Inheritance;

class Order{
    int order_id;
    String order_date;

    // Constructor to initialize the basic order details
    Order(int order_id,String order_date){
        this.order_id = order_id;
        this.order_date = order_date;
    }

    // Returns the initial status of the order
    String getOrderStatus(){
        return "Order Placed";
    }
}

class shippingOrder extends Order{
    int shipping_id;

    // Calls the parent constructor and initializes shipping details
    shippingOrder(int order_id,String order_date,int shipping_id){
        super(order_id,order_date);
        this.shipping_id = shipping_id;
    }

    // Overrides the parent method to return the shipping status
    @Override
    String getOrderStatus(){
        return "Shipping Done";
    }
}

class DeliveredOrder extends shippingOrder{
    String delivery_date;

    // Calls the parent constructor and initializes delivery details
    DeliveredOrder(int order_id, String order_date, int shipping_id, String delivery_date){
        super(order_id, order_date, shipping_id);
        this.delivery_date = delivery_date;
    }

    // Overrides the parent method to return the delivered status
    @Override
    String getOrderStatus(){
        return "Order Delivered";
    }
}


public class OrdersInMultiLevel {
    public static void main(String[] args){

        // Creating an object of the final child class
        DeliveredOrder order = new DeliveredOrder(13231,"02-09-2026",5243343,"10-09-2026");

        // Displaying all order details and its current status
        System.out.println("Order ID: "+order.order_id);
        System.out.println("Order date: "+order.order_date);
        System.out.println("Shipping ID: "+order.shipping_id);
        System.out.println("Delivery Date: "+order.delivery_date);
        System.out.println("Order Status: "+ order.getOrderStatus());
    }
}