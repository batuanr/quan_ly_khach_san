package view;

import controller.Hotel;
import model.Order;
import model.Person;
import model.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Hotel hotel = new Hotel();
    public static void main(String[] args) {


        Person person1 = new Person("tu", 22, "333");
        Person person2 = new Person("tuan", 25, "33");

        Room room1 = new Room("VIP",500, 101);
        Room room2 = new Room("VIP", 500,102);


        Room room3 = new Room("VIP", 500, 105);
        Room room4 = new Room("Normal", 300, 201);
        Room room5 = new Room("Normal", 300, 202);

        Order order = new Order(person1, LocalDate.of(2021, 9, 9),
                LocalDate.of(2021, 9, 13), room3);

        hotel.addPerson(person1);
        hotel.addPerson(person2);
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);
        hotel.addRoom(room4);
        hotel.addRoom(room5);



        hotel.addOrder(order);








        while (true) {
            int choice;
            Scanner s = new Scanner(System.in);
            Scanner n = new Scanner(System.in);
            System.out.println("Bạn muốn làm gì");
            System.out.println("Nhập 1: xem thông tin toàn bộ khách trọ");
            System.out.println("Nhập 2: kiểm tra thông tin 1 khách trọ");
            System.out.println("Nhập 3: Thêm thông tin khách trọ");
            System.out.println("Nhập 4: Thêm thông tin order");
            System.out.println("Nhập 5: sửa thông tin khách trọ");
            System.out.println("Nhập 6: Xóa Order khách hàng");
            System.out.println("Nhập 7: Tính tiền khách check out");
            System.out.println("Nhập 0: Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    hotel.showAllOrder();
                    break;
                case 2:
                    System.out.println("Nhập số CMND");
                    String CMND = n.nextLine();
                    hotel.showOnePerson(CMND);
                    break;
                case 3:
                    hotel.addPerson(getNewPerson());
                    break;
                case 4:
                    hotel.addOrder(getNewOrder());
                case 5:
                    System.out.println("nhập CMND");
                    CMND = n.nextLine();
                    hotel.editPerson(CMND, getNewPerson());
                    break;
                case 6:
                    System.out.println("Nhập số CMND");
                    CMND = n.nextLine();
                    hotel.removeOrder(CMND);
                    break;
                case 7:
                    System.out.println("Nhập số CMND");
                    CMND = n.nextLine();
                    hotel.checkOut(CMND);
                    break;
                case 0:
                    return;
                default:
                    System.out.println(" no choice");
            }

        }
    }
    public static   Person getNewPerson(){
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println("Nhập name");
        String name = n.nextLine();
        System.out.println("Nhập tuổi");
        int age = s.nextInt();
        System.out.println("Nhập CMND");
        String CMND = n.nextLine();
       return  new Person(name, age, CMND);
    }
    public static Order getNewOrder(){
        Person person = getNewPerson();
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println("Lựa chọn phòng");
        System.out.println("Nhập 1: Phòng vip");
        System.out.println("Nhập 2: phòng thường");
        int a = s.nextInt();
        Room room = null;
        if (a == 1){
            for (Room rom: hotel.getRooms()){
                if(rom.getPrice() == 500 && rom.isEmptyRoom()){
                    room = rom;
                    break;
                }
            }

        }
        else{
            if (a == 2) {
                for (Room rom: hotel.getRooms()){
                    if(rom.getPrice() == 300 && rom.isEmptyRoom()){
                        room = rom;
                        break;
                    }
                }
            }
        }
        System.out.println("CheckInDay");
        System.out.println("Day");
        int day = n.nextInt();
        System.out.println("Month");
        int month = n.nextInt();
        System.out.println("year");
        int year = n.nextInt();
        System.out.println("CheckOutDay");
        System.out.println("Day");
        int dayOut = n.nextInt();
        System.out.println("Month");
        int monthOut = n.nextInt();
        System.out.println("year");
        int yearOut = n.nextInt();
        System.out.println();
        return new Order(person, LocalDate.of(year, month, day), LocalDate.of(yearOut, monthOut, dayOut), room);
    }
}
