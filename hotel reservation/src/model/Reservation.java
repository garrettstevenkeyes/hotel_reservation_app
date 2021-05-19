package model;
import java.util.Date;
import java.util.Objects;

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
        return customer + " Room: " + iroom.getRoomNumber() + ". Check in Date: " + checkInDate + ". Check out Date: " + checkOutDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reservation)) return false;
        Reservation that = (Reservation) o;
        return customer.equals(that.customer) &&
                iroom.equals(that.iroom) &&
                checkInDate.equals(that.checkInDate) &&
                checkOutDate.equals(that.checkOutDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer, iroom, checkInDate, checkOutDate);
    }

    public Customer getCustomer(){
        return customer;
    }

    public IRoom getIRoom() {
        return iroom;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }
}
