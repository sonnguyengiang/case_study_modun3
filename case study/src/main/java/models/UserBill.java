package models;

public class UserBill {
    private String img;
    private String name;
    private int price;
    private int soluongmua;
    private int tonggia;

    public UserBill(String img, String name, int price, int soluongmua, int tonggia) {
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
}
