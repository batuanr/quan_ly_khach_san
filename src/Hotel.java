import java.util.ArrayList;
import java.util.List;

public class Hotel {
    List<Person> personList;

    public Hotel() {
        personList = new ArrayList<>();
    }
    public void addPerson(Person person) {
        personList.add(person);
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
    public void checkOut(String CMND) {
        for (Person person: personList) {
            if (person.getCMND().equals(CMND)) {
                int total = person.getRoom().getPrice()*person.getNumberRent();
                System.out.println("Tiền thuê: " + total);
            }
        }
    }
}
