import java.util.List;
import java.util.Scanner;

public class Manager {
    List<Guest> guestList;

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public void getInfoALlGuest(){
        for (Guest guest: guestList){
            System.out.println(guest);
        }
    }
    public void getInfoGuest(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số CMND của khách hàng muốn lấy thông tin");
        String a = s.nextLine();
        for (Guest guest: guestList){
            if (guest.getCMND().equals(a)) {
                System.out.println(guest);
                break;
            }
        }
    }
    public void getAddGuest(){
        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println("Tên khách hàng");
        String name = s.nextLine();
        System.out.println("Ngày sinh");
        String birthdate = s.nextLine();
        System.out.println("CMND");
        String CMND = s.nextLine();
        System.out.println("Ở tại phòng số");
        String room = n.nextLine();
        System.out.println("Số ngày thuê phòng");
        double date = n.nextDouble();
        System.out.println("Giá 1 ngày");
        double price = n.nextDouble();
        Guest newGuest = new Guest(name, birthdate, CMND, date, room, price);
        guestList.add(newGuest);
    }
    public void removeGuest() {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số CMND của khách hàng muốn xóa");
        String a = s.nextLine();
        for (int i = 0; i < guestList.size(); i++) {
            Guest guest = guestList.get(i);
            if (guest.getCMND().equals(a)) {
                guestList.remove(guest);
                break;
            }
        }
    }
    public void checkOut() {
        double total = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số CMND của khách hàng trả phòng");
        String a = s.nextLine();
        for (Guest guest: guestList) {
            if (guest.getCMND().equals(a)) {
                total = guest.getRoomRates()*guest.getNumberOfDate();
                guest.setCheckOut(true);
                break;
            }
        }
        System.out.println("Tổng tiền: " + total);
    }
}
