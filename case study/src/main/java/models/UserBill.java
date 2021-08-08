package models;

public class UserBill {
    private int id_detail_bill;
    private int id_sp;
    private String img;
    private String name;
    private int price;
    private int soluongmua;
    private int tonggia;

    public UserBill(int id_detail_bill, int id_sp , String img, String name, int price, int soluongmua, int tonggia) {
        this.id_detail_bill = id_detail_bill;
        this.id_sp = id_sp;
        this.img = img;
        this.name = name;
        this.price = price;
        this.soluongmua = soluongmua;
        this.tonggia = tonggia;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }

    public int getTonggia() {
        return tonggia;
    }

    public void setTonggia(int tonggia) {
        this.tonggia = tonggia;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public int getId_detail_bill() {
        return id_detail_bill;
    }

    public void setId_detail_bill(int id_detail_bill) {
        this.id_detail_bill = id_detail_bill;
    }
}
