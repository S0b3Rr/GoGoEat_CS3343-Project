package GoGoEat;

public class CommandCustomerCheckOut extends CommandCustomer {

    private String outputString;

    public CommandCustomerCheckOut(Customers customer, String outputString) {
        super(customer);
        this.outputString = outputString;
    }

    @Override
    public void exe()
            throws ExUnableToSetOpenCloseTime, ExTableIdAlreadyInUse, ExTableNotExist, ExTimeSlotNotReservedYet {

        // Checkout by customer themselves
        tm.checkOutByCustomer(customer.getOccupiedTableId());
        customer.clearOccupiedTableId();

        // UPDATE: Modified 16 Nov
        System.out.printf("\n%s\n", outputString);
    }
}
