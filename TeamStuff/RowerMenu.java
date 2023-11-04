package TeamStuff;

import java.util.Scanner;
import ErgStuff.ErgPiece;

public class RowerMenu {
    private Rower rower;
    private String MENU_OPTION_1 = "View Erg Pieces";
    private String MENU_OPTION_2 = "Add Erg Piece";
    private String MENU_OPTION_3 = "";

    public RowerMenu(Rower rower) {
        this.rower = rower;
    }

    public void runRowerMenu(Scanner scan) {
        System.out.println("What action would you like to perform?");
        System.out.println(MENU_OPTION_1);
        System.out.println(MENU_OPTION_2);
        System.out.println(MENU_OPTION_3);
        while (true) {
            switch (scan.nextInt()) {
                case 1:
                    for (ErgPiece piece : rower.getErgPieces()) {
                        System.out.println(piece);
                    }
                case 2:
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }

    
}
