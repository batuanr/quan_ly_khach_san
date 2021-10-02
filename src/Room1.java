public class Room1 extends Room{
    public Room1(int roomNumber) {
        super(roomNumber);
        setTypeRoom("Normal");
        setPrice(300);
    }

    @Override
    public String toString() {
        return "Room 1 {" +
                ", typeRoom: " + getTypeRoom() +
                ", price: " + getPrice() +
                "}";
    }
}
