package GoGoEat;

public class CommandAdminAddTable extends CommandAdmin {

    CommandAdminAddTable() {
        super();
    }

    @Override
    public void exe() throws ExTableIdAlreadyInUse {

        /*
         * 1. Input table ID -> check if exists
         * 2. Input table capacity
         */

        System.out.print("\nPlease input the new tableId: ");
        String input;
        int tableId;
        try {
            input = Main.in.next("\nPlease input the new tableId: ");
            tableId = Integer.parseInt(input);
            System.out.print("\nPlease input the capacity of new table: ");
            input = Main.in.next("\nPlease input the capacity of new table: ");
            int tableCapacity = Integer.parseInt(input);
            admin.forceAddTable(tableId, tableCapacity);
            tableId = 0;
        } catch (NumberFormatException e) {
            System.out.println("Error! Wrong input for selection! Please input an integer!");
        }
    }

}
