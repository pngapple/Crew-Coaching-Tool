import java.util.Scanner;

public class Main {
    private static String WELCOME_MESSAGE = "Welcome to Crew Coaching Tool!";
    private static String WELCOME_MENU = "Choose one of the following actions:\n(1) Add Piece\n(2) Add Rower to the System\n(3) Create Lineup";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        System.out.println(WELCOME_MENU);
        
        scan.close();
    }
}
