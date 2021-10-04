package controller;

import model.Order;
import model.Person;
import model.Room;

import java.util.ArrayList;


public class Hotel {
    ArrayList<Person> personList;
    ArrayList<Room> rooms;
    ArrayList<Order> orderList;



    public Hotel() {
        personList = new ArrayList<>();
        rooms = new ArrayList<>();
        orderList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public  void addRoom(Room room){
        rooms.add(room);
    }
    public  void addOrder(Order order){
        orderList.add(order);
    }
    public void addPerson(Person person) {
        personList.add(person);
    }
    public void removeOrder(String CMND){
        for (Order order: orderList) {
            if (order.getPerson().getCMND().equals(CMND)){
                personList.remove(order);
                break;
            }
        }
    }
    public void showOnePerson(String CMND) {
        for (Order order: orderList) {
            if (order.getPerson().getCMND().equals(CMND)) {
                System.out.println(order);
            }
        }
    }
    public  void showAllOrder() {
        for (Order order: orderList){
            System.out.println(order);
        }
    }
    public void editPerson(String CMND, Person newPerson){
        for (Person person: personList){
            if (person.getCMND().equals(CMND)){
                personList.remove(person);
                personList.add(newPerson);
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
        for (Order order: orderList) {
            if (order.getPerson().getCMND().equals(CMND)) {
                order.getRoom().setEmptyRoom(true);
                System.out.println("Tiền thuê: "+ order.getTotalPrice() );
            }
        }
    }
}
