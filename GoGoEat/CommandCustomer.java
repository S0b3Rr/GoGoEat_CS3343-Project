package GoGoEat;

public abstract class CommandCustomer implements Commands {
    protected TablesManagement tm;
    protected static Customers customer;
    protected Database database;

    public CommandCustomer(Customers customer) {
        this.tm = TablesManagement.getInstance();
        CommandCustomer.customer = customer;
        this.database = Database.getInstance();
    }
}
