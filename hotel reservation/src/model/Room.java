package model;

public class Room implements IRoom{
    String roomNumber;
    Double price;
    RoomType enumeration;

    public Room(String roomNumber, Double price, RoomType enumeration) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;
    }

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public RoomType getRoomType() {
        return enumeration;
    }

    public void setEnumeration(RoomType enumeration) {
        this.enumeration = enumeration;
    }

    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "Room number " + getRoomNumber() + " costs " + getRoomPrice() + " and its a " + getRoomType() +
                " room";
    }
}
