public class Person {
    private String name;
    private int age;
    private String CMND;
    private Room room;
    private int numberRent;

    public Person(String name, int age, String CMND, Room room, int numberRent) {
        this.name = name;
        this.age = age;
        this.CMND = CMND;
        this.room = room;
        this.numberRent = numberRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CMND='" + CMND + '\'' +
                ", numberRent=" + numberRent +
                ", Room: " + room.getRoomNumber() +
                '}';
    }
}