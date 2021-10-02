import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Hotel hotel = new Hotel();
    public static void main(String[] args) {


        hotel.addRoom(new Room1(101));
        hotel.addRoom(new Room1(102));
        hotel.addRoom(new Room1(103));
        hotel.addRoom(new Room1(104));
        hotel.addRoom(new Room1(105));
        hotel.addRoom(new Room2(202));
        hotel.addRoom(new Room2(202));
        hotel.addRoom(new Room2(203));
        hotel.addRoom(new Room2(204));
        hotel.addRoom(new Room2(205));




        while (true) {
            int choice;
            Scanner s = new Scanner(System.in);
            Scanner n = new Scanner(System.in);
            System.out.println("Bạn muốn làm gì");
            System.out.println("Nhập 1: xem thông tin toàn bộ khách trọ");
            System.out.println("Nhập 2: kiểm tra thông tin 1 khách trọ");
            System.out.println("Nhập 3: Thêm thông tin khách trọ");
            System.out.println("Nhập 4: sửa thông tin khách trọ");
            System.out.println("Nhập 5: Xóa khách hàng");
            System.out.println("Nhập 6: Tính tiền khách check out");
            System.out.println("Nhập 0: Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    hotel.showAllPerson();
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
                    System.out.println("nhập CMND");
                    CMND = n.nextLine();
                    hotel.editPerson(CMND, getNewPerson());
                    break;
                case 5:
                    System.out.println("Nhập số CMND");
                    CMND = n.nextLine();
                    hotel.removePerson(CMND);
                    break;
                case 6:
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
        System.out.println("Lựa chọn phòng");
        System.out.println("Nhập 1: Phòng vip");
        System.out.println("Nhập 2: phòng thường");
        int a = s.nextInt();
        Room room = null;
        if (a == 1){
            for (Room rom: hotel.rooms){
                if(rom instanceof Room2 && rom.isEmptyRoom()){
                    room = rom;
                    break;
                }
            }

        }
        else{
            if (a == 2) {
                for (Room rom: hotel.rooms){
                    if(rom instanceof Room1 && rom.isEmptyRoom()){
                        room = rom;
                        break;
                    }
                }
            }
        }
        System.out.println("Nhập số ngày thuê ");
        int numberRent = s.nextInt();
       return  new Person(name, age, CMND, room, numberRent);
    }
}
