package model;

public class Room implements IRoom{
    String roomNumber;
    Double price;
    RoomType enumeration;

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {
        return enumeration;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "Your room number is " + getRoomNumber() + " it costs " + getRoomPrice() + " and its a " + getRoomType() +
                "type of room";
    }
}
