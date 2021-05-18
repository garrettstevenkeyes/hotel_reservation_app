package api;

import model.Customer;
import model.IRoom;
import model.Room;
import model.RoomType;
import service.CustomerService;
import service.ReservationService;

import java.text.ParseException;
import java.util.Collection;
import java.util.Scanner;

public class AdminMenu {
    // other stuff here
    public static void startActions() throws ParseException {
        int action = getAction(); //collect input
        switch(action){

            // See all the customers
            case 1:
                customerViewer();
                AdminMenu.startActions();
            // See all the rooms
            case 2:
                roomViewer();
                AdminMenu.startActions();

            // See all reservations
            case 3:
                ReservationService.printAllReservation();
                AdminMenu.startActions();
            // Add a Room
            case 4:
                // Enter the room number
                System.out.println("What is the room number?");
                Scanner scannerRoomNumber = new Scanner(System.in);
                String roomNumber = scannerRoomNumber.next();

                // Enter the price
                System.out.println("What is the price?");
                Double roomPrice = null;
                Scanner scannerRoomPrice = new Scanner(System.in);
                roomPrice = roomPrice.parseDouble(scannerRoomPrice.next());

                // Enter the roomtype
                System.out.println("Is the room and single or a double?");
                Scanner scannerRoomType = new Scanner(System.in);
                String roomType = scannerRoomType.next();
                RoomType roomEnum = RoomType.valueOf(roomType);

                addRoom(roomNumber, roomPrice, roomEnum);
                AdminMenu.startActions();

            // other case statements
            case 5:
                // switch back to main menu
                MainMenu mainMenu = new MainMenu();
                mainMenu.startActions();
        }
    }

    // To get action class
    public static int getAction() {
        System.out.println("1. See all customers, 2. See all rooms, 3. See all reservations, 4. Add a room, 5. Go to the main menu! Enter your number selection!");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = Integer.parseInt(scanner.next());
        return scannerNumber;
    }

    // To view all customers
    public static void customerViewer(){
        Collection <Customer> allCustomers = CustomerService.getAllCustomers();

        for (Customer customer : allCustomers) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName());
        }
    }

    // To view all rooms
    public static void roomViewer(){
        Collection <IRoom> allRooms = ReservationService.getAllRooms();

        for (IRoom room: allRooms) {
            System.out.println(room);
        }
    }

    public static void addRoom(String roomNumber, Double price, RoomType enumeration) {
        Room newRoom = new Room(roomNumber, price, enumeration);
        ReservationService.addRoom(newRoom);
        System.out.println("Room added!");
    }

    public static void main(String [] args) throws ParseException {
        //the admin menu can start here
        AdminMenu menuObject = new AdminMenu();
        menuObject.startActions();
    }
}
