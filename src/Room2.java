public class Room2 extends Room{
    public Room2(int roomNumber) {
        super(roomNumber);
        setTypeRoom("Vip");
        setPrice(500);
    }

    @Override
    public String toString() {
        return "Room 2{" +
                ", typeRoom: " + getTypeRoom() +
                ", price: " + getPrice() +
                "}";
    }
}
