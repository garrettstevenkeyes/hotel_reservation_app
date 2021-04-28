package service;

import model.*;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.stream.Stream;

public class ReservationService {
    private String roomNumber;
    private String roomId;
    private Double price;
    private RoomType enumeration;

    //Collections to store all of the rooms
    public Collection<IRoom> rooms = new HashSet<>();
    public Collection<Reservation> reservations = new HashSet<>();

    private static ReservationService reservationService = null;

    private ReservationService(){}

    // create a static reservation service
    public static ReservationService getInstance(){
        if (null == reservationService){
            reservationService = new ReservationService();
        }
        return reservationService;
    }

    // Add a new room
    public void addRoom(IRoom room) {
        Room newRoom = new Room(roomNumber, price, enumeration);
        rooms.add(newRoom);
    }

    // get a room from the collection of rooms
    public IRoom getARoom (String roomId) {
        for (IRoom room: rooms){
            if ((room.getRoomNumber()).equals(roomId)) {
                return room;
            }
        }
        return null;
    }

    // add a room reservation to the reservation set
    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        Reservation newReservation = new Reservation(customer, room,checkInDate, checkOutDate);
        reservations.add(newReservation);
        rooms.remove(room);
        return newReservation;
    }

    // get a customers reservation
    public Reservation getCustomersReservation(Customer customer) {
        for (Reservation reservation : reservations) {
            if((reservation.getCustomer()).equals(customer)){
                return reservation;
            }
        }
        return null;
    }

    // find all of the rooms that are available
    //only return the rooms available greater or equal to the check in date and less or equal to the checkoutdate
    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {

    }

    //print all of the reservations
    public void printAllReservation(){
        for(Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}
