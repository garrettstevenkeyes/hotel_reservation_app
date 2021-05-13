package api;
import java.util.Scanner;

public class MainMenu {

    public void startActions(){
        int actions = getActions(); // collect input
        switch(actions) {
            case 1:

                break;
            case 2:
                actions2();
                break;
            // ... other case statements
            case 5:
                // switch to admin menu here
                AdminMenu aMenu = new AdminMenu();
                aMenu.start();
        }
    }

    public static void main(String[] args) {
        MainMenu menuObject = new MainMenu();
        menuObject.startActions();
    }

    public int getActions() {
        System.out.println("1. Find and reserve a room, 2. See my reservation, 3. Create an account, 4. Admin, 5. Exit. Enter your number selection!");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine().valueOf();
    }
}
