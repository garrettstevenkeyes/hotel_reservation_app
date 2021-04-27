package model;

public class FreeRoom extends Room{
    protected Integer price;

    public FreeRoom (Integer price) {
        this.price = 0;
    }

    @Override
    public String toString() {
        return "This room is free!";
    }
}
