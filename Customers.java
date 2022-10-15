
import java.util.ArrayList;
import java.util.List;

public class Customers {
    private String username;
    private int userid;
    private PaymentMethod paymentMethod;
    private Tables reservedtable;
    private CustomerState customerState;
    private ArrayList<Dish> orders=new ArrayList<>();

    //constructor
    public Customers(String username, int userid){
        this.username=username;
        this.userid=userid;
        this.customerState=null;
    }

    //FUCNTION
    //customer order dish
    public ArrayList orderdish(Dish dish){
        this.orders.add(dish);
        return this.orders;
    }
    //customer delete dish
    public ArrayList deletedish(Dish dish){
        this.orders.remove(dish);
        return this.orders;
    }
    //customer all orders
    public ArrayList customerOrders(){
        return this.orders;
    }
    //customer pay the bill
    public void paythebill(int price){
        
        System.out.println("You have completed the payment.");
    }

    public void reserveTable(){
        this.reservedtable.setReserved();
    }

    public void deleteReserveTable(){
        this.reservedtable.cancelReserved();
    }

    public void setState(CustomerState state){
        this.customerState=state;
    }
}