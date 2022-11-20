package GoGoEat;

public class CommandAdminCheckReservation extends CommandAdmin {

    CommandAdminCheckReservation() {
        super();
    }

    @Override
    public void exe() throws ExCustomersIdNotFound {

        /*
         * 1. Input Customer ID -> Check and get existing customer instance
         * 2. Get Customers' reservation info
         */

        try {
            System.out.print("\nPlease input the CustomerId to check reservation info: ");
            String customerId = Main.in.next("\nPlease input the CustomerId to check reservation info: ");

            admin.checkReserveInfo(customerId);

        } catch (ExNoReservationFound e) {
            System.out.println(e.getMessage());
        }

    }

}
