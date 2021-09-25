import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Room room1 = new Room1();
        Room room2 = new Room2();

        Person person1 = new Person("Trường", 18,
                "789", room1, 4);

        Person person2 = new Person("Anh", 23,
                "234", room2, 3);

        hotel.addPerson(person1);
        hotel.addPerson(person2);



        while (true) {
            int choice;
            Scanner s = new Scanner(System.in);
            Scanner n = new Scanner(System.in);
            System.out.println("Bạn muốn làm gì");
            System.out.println("Nhập 1: xem thông tin toàn bộ khách trọ");
            System.out.println("Nhập 2: kiểm tra thông tin 1 khách trọ");
            System.out.println("Nhập 3: Thêm khách trọ");
            System.out.println("Nhập 4: Xóa khách hàng");
            System.out.println("Nhập 5: Tính tiền khách check out");
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
                    System.out.println("Nhập name");
                    String name = n.nextLine();
                    System.out.println("Nhập tuổi");
                    int age = s.nextInt();
                    System.out.println("Nhập CMND");
                     CMND = n.nextLine();
                    System.out.println("Lựa chọn phòng");
                    System.out.println("Nhập 1: Phòng vip");
                    System.out.println("Nhập 2: phòng thường");
                    int a = s.nextInt();
                    Room room = null;
                    if (a == 1){
                         room = new Room2();
                    }
                    else{
                        if (a == 2) {
                             room = new Room1();
                        }
                    }
                    System.out.println("Nhập số ngày thuê ");
                    int numberRent = s.nextInt();
                    Person person = new Person(name, age, CMND, room, numberRent);
                    hotel.addPerson(person);
                    break;
                case 4:
                    System.out.println("Nhập số CMND");
                    CMND = n.nextLine();
                    hotel.removePerson(CMND);
                    break;
                case 5:
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
}
