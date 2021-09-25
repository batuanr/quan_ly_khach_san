public class Room1 extends Room{
    public Room1() {
        super("Normal", 200, 101);
    }

    @Override
    public String toString() {
        return "Room 1 {" +
                ", typeRoom: " + getTypeRoom() +
                ", price: " + getPrice() +
                "}";
    }
}
