import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        List<Guest> guestList = new ArrayList<>();
        Guest guest1 = new Guest("Tuấn", "8/9",
                "123", 3, "101", 250);

        Guest guest2 = new Guest("Bằng", "8/10",
                "456", 3, "101", 150);

        Guest guest3 = new Guest("Trường", "4/5",
                "789", 3, "101", 350);

        Guest guest4 = new Guest("Anh", "9/3",
                "234", 3, "101", 550);
        guestList.add(guest1);
        guestList.add(guest2);
        guestList.add(guest3);
        guestList.add(guest4);

        manager.setGuestList(guestList);

        int choice;

        do {

            Scanner s = new Scanner(System.in);
            System.out.println("Bạn muốn làm gì");
            System.out.println("Nhập 1: xem thông tin toàn bộ khách trọ");
            System.out.println("Nhập 2: kiểm tra thông tin 1 khách trọ");
            System.out.println("Nhập 3: Thêm khách trọ");
            System.out.println("Nhập 4: Xóa khách hàng");
            System.out.println("Nhập 5: Tính tiền khách check out");
            System.out.println("Nhập 0: Exit");
            choice = s.nextInt();
            switch (choice){
                case 1: manager.getInfoALlGuest();
                break;
                case 2: manager.getInfoGuest();
                break;
                case 3: manager.getAddGuest();
                break;
                case 4: manager.removeGuest();
                break;
                case 5: manager.checkOut();
                break;
                case 0:System.exit(0);
                default:
                    System.out.println(" no choice");
            }
        }while (choice != 0);

    }
}
