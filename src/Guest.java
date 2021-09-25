public class Guest {
    private String name;
    private String birthDate;
    private String CMND;
    private double numberOfDate;
    private String roomNumber;
    private double roomRates;
    boolean checkOut = false;

    public Guest(String name, String birthDate, String CMND, double numberOfDate, String roomNumber, double roomRates) {
        this.name = name;
        this.birthDate = birthDate;
        this.CMND = CMND;
        this.numberOfDate = numberOfDate;
        this.roomNumber = roomNumber;
        this.roomRates = roomRates;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public double getNumberOfDate() {
        return numberOfDate;
    }

    public void setNumberOfDate(double numberOfDate) {
        this.numberOfDate = numberOfDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomRates() {
        return roomRates;
    }

    public void setRoomRates(double roomRates) {
        this.roomRates = roomRates;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", CMND='" + CMND + '\'' +
                ", numberOfDate=" + numberOfDate +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomRates=" + roomRates +
                ", check out: " + checkOut +
                '}';
    }
}
