package api;

public class AdminMenu {
    // other stuff here
    public void startActions(){
        int action = getAction(); //collect input
        switch(action){
            case 1:
                action1();
                break;
            case 2:
                action2();
                break;

            // other case statments
            case 3:
                // switch back to main menu
                MainMenu mainMenu = new MainMenu();
                mainMenu.startActions();
        }
    }

    public static void main(String[] args){
        //the admin menu can start here
        AdminMenu menuObject = new AdminMenu();
        menuObject.startMenu();
    }
}
