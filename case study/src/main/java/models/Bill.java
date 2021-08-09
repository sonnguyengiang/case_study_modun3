package models;

public class Bill {
    private int id_bill;
    private int id_user;
    private String username;
    private String date;
    private int price_bill;

    public Bill(int id_bill, int id_user, String date, int price_bill) {
        this.id_bill = id_bill;
        this.id_user = id_user;
        this.date = date;
        this.price_bill = price_bill;
    }

    public Bill(int id_bill, String username, String date, int price_bill) {
        this.id_bill = id_bill;
        this.username = username;
        this.date = date;
        this.price_bill = price_bill;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice_bill() {
        return price_bill;
    }

    public void setPrice_bill(int price_bill) {
        this.price_bill = price_bill;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
