package model;
import java.util.Date;

public class Reservation {
    Customer customer;
    IRoom room;
    Date checkInDate;
    Date checkOutDate;

    @Override
    public String toString(){
        return "Customer: " + customer + "Room: " + room + "Check in Date: " + checkInDate + "Check out Date: " + checkOutDate;
    }
}
