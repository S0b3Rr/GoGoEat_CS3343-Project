public class CustomerVIPstate implements CustomerState{
    private double discount;
    @Override
    public void customerstate(Customers customer) {
        customer.setState(this);
        
    }
    
    public String toString(){
        return "VIP State";
     }

     @Override
     public void setdiscount(double discount) {
         this.discount=discount;
     }
    
}