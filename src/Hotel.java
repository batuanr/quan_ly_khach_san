import java.util.ArrayList;


public class Hotel {
    ArrayList<Person> personList;
    ArrayList<Room> rooms ;

    public Hotel() {
        personList = new ArrayList<>();
        rooms = new ArrayList<>();
    }
    public  void addRoom(Room room){
        rooms.add(room);
    }
    public void addPerson(Person person) {
        personList.add(person);
        person.getRoom().setEmptyRoom(false);
    }
    public void removePerson(String CMND){
        for (Person person: personList) {
            if (person.getCMND().equals(CMND)){
                personList.remove(person);
                break;
            }
        }
    }
    public void showOnePerson(String CMND) {
        for (Person person: personList) {
            if (person.getCMND().equals(CMND)) {
                System.out.println(person);
            }
        }
    }
    public  void showAllPerson() {
        for (Person person: personList) {
            System.out.println(person);
        }
    }
    public void editPerson(String CMND, Person newPerson){
        for (Person person: personList){
            if (person.getCMND().equals(CMND)){
                person = newPerson;
            }
        }
    }
    public void checkRoom(String roomNumber){
        for (Room room:rooms){
            if (room.isEmptyRoom()){
                System.out.println("Phòng trống");
            }
            else{
                System.out.println("Phòng đã có người");
            }
        }

    }
    public void checkOut(String CMND) {
        for (Person person: personList) {
            if (person.getCMND().equals(CMND)) {
                int total = person.getRoom().getPrice()*person.getNumberRent();
                System.out.println("Tiền thuê: " + total);
            }
        }
    }
}
