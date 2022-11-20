package GoGoEat;

public class CommandAdminRemoveTable extends CommandAdmin {

    CommandAdminRemoveTable() {
        super();
    }

    @Override
    public void exe() throws ExTableIdAlreadyInUse, ExTableNotExist {

        // Delete table with TableId

        System.out.print("\nPlease input the TableId to delete table: ");
        String input;
        int tableId;
        try {
            input = Main.in.next("\nPlease input the TableId to delete table: ");
            tableId = Integer.parseInt(input);
            admin.forceDeleteTable(tableId);
            tableId = 0;
        } catch (NumberFormatException e) {
            System.out.println("Error! Wrong input for selection! Please input an integer!");
        }
    }

}
