package TeamStuff;
public class RowerMenu {
    private Rower rower;
    private String MENU_OPTION_1 = "View Erg Pieces";
    private String MENU_OPTION_2 = "Add Erg Piece";
    private String MENU_OPTION_3 = "";

    public RowerMenu(Rower rower) {
        this.rower = rower;
    }

    public void runRowerMenu() {
        System.out.println("What action would you like to perform?");
    }
}
