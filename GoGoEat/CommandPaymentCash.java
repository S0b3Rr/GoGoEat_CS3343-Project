package GoGoEat;

public class CommandPaymentCash extends CommandPayment {

    private AccountManagement accountManager = AccountManagement.getInstance();
    private static final Database database = Database.getInstance();

    private Restaurants restaurantChosed;
    private Customers customer;

    public CommandPaymentCash(Payment payment, double discountPrice, Restaurants restaurantChosed, Customers customer) {
        super(payment, discountPrice);
        this.restaurantChosed = restaurantChosed;
        this.customer = customer;
    }

    @Override
    public void exe() throws ExUnableToSetOpenCloseTime, ExTableIdAlreadyInUse, ExTableNotExist,
            ExTimeSlotNotReservedYet, ExCustomersIdNotFound, ExTimeSlotAlreadyBeReserved {

        PayFactory payFactory = new CashFactory();
        PaymentMethod paymentMethod = payFactory.getPay();

        boolean result = paymentMethod.pay(discountPrice);

        if (result) {
            payment.setPaymentStatus(result);
        }

        // Input merchantID to proceed payment
        selectMerchantToPayment();
    }

    public void selectMerchantToPayment() {

        // Print list of merchant of the chosen restaurant
        accountManager.printMerchantOfTheRestaurant(restaurantChosed);

        System.out.print("\nInput staff MId: ");
        String staffUserName = Main.in.next("\nInput staff MId: ");

        Merchants merchant = null;
        try {
            // Match MID to get merchant instance
            merchant = database.matchMId(staffUserName);

            if (merchant.getRestaurantOwned() == restaurantChosed) {

                // Check out by the merchant
                merchant.checkOutbyMerchant(customer);

            } else {
                System.out.println("No merchant found! Please try again.");
            }
        } catch (NullPointerException ex) {
            System.out.println("No merchant found! Please try again.");
        }
    }
}
