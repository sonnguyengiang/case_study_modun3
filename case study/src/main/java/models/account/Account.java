package models.account;

public class Account {
    private int id;
    private String userName;
    private String password;
    private String gmail;
    private String phoneNumber;
    private String address;
    private String type;

    public Account() {
    }

    public Account(int id, String userName, String password, String gmail, String phoneNumber, String address, String type) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.type = type;
    }

    public Account(String userName, String password, String gmail, String phoneNumber, String address) {
        this.userName = userName;
        this.password = password;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
