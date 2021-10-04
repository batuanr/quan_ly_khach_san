package model;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Order {
    private Person person;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private Room room;

    public Order() {
    }

    public Order(Person person, LocalDate checkIn, LocalDate checkOut, Room room) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.person = person;
        this.room = room;
        this.room.setEmptyRoom(false);
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public long getTotalPrice(){
        long total;

        long numDay = DAYS.between(checkIn, checkOut);

        int price = room.getPrice();

        total = numDay*price;
        return  total;
    }
    public String toString(){
        return person.toString() + room.toString();
    }
}
