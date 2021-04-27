package model;
import java.util.Date;

public class Reservation {
    Customer customer;
    private IRoom iroom;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(Customer customer, IRoom iroom, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.iroom = iroom;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString(){
        return "Customer: " + customer + "Room: " + iroom + "Check in Date: " + checkInDate + "Check out Date: " + checkOutDate;
    }

    public Customer getCustomer(){
        return customer;
    }
}
