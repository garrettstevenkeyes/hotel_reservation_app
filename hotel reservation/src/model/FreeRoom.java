package model;

public class FreeRoom extends Room{
    String roomNumber;
    Double price;
    RoomType enumeration;

    public FreeRoom(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, price = 0.0, enumeration);
    }

    @Override
    public String toString() {
        return "This room is free!";
    }
}
