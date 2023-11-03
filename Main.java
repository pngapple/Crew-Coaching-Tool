import java.util.Scanner;

import TeamStuff.TeamData;

public class Main {
    private static String WELCOME_MESSAGE = "Welcome to Crew Coaching Tool!";
    private static String WELCOME_MENU = "Choose one of the following actions:\n(1) View/Modify Rower Data\n(2) Add Rower to the System\n(3) Create Lineup\n(4)Exit";
    private static String RUN_ROWER_MENU = "Which rower's data would you like to look for?";

    public static void main(String[] args) {
        TeamData team = new TeamData();
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println(WELCOME_MESSAGE);
            System.out.println(WELCOME_MENU);

            int option = scan.nextInt();
            scan.nextLine();

            if (option == 1) {
                System.out.println(RUN_ROWER_MENU);
                
            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {
                scan.close();
                return;
            }
        }
        
    }
}
