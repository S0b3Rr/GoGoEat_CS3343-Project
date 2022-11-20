package GoGoEat;

public class CommandAdminSetOpenCloseHour extends CommandAdmin {

    CommandAdminSetOpenCloseHour() {
        super();
    }

    @Override
    public void exe() throws ExUnableToSetOpenCloseTime {
        setOpenHours();
    }

    private void setOpenHours() throws ExUnableToSetOpenCloseTime {
        String timeString = null;
        boolean success = false;

        System.out.printf("\nPlease input new opening and closing hour (format: xx:xx-xx:xx): ");
        timeString = Main.in.nextLine("\nPlease input new opening and closing hour (format: xx:xx-xx:xx): ");
        success = admin.forceSetOpenAndClosingTime(timeString);

        if (success) {
            System.out.printf("\nChange opening and closing time success!\n");
            System.out.printf("The new opening hour is %s.\n", timeString);
        }
    }
}
