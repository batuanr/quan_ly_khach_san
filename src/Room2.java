public class Room2 extends Room{
    public Room2() {
        super("Vip ", 500, 201);
    }

    @Override
    public String toString() {
        return "Room 2{" +
                ", typeRoom: " + getTypeRoom() +
                ", price: " + getPrice() +
                "}";
    }
}
