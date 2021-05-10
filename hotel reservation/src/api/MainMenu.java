package api;

public class MainMenu {

    public void startActions(){
        int actions = getActions(); // collect input
        switch(action) {
            case 1:
                action1();
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
}
