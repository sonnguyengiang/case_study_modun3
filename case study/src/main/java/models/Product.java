package models;

public class Product {
    private int id;
    private String name;
    private String color;
    private String tenhang;
    private String loaisp;
    private int soluong;
    private int price;
    private String img;

    public Product(int id, String name, String color, String tenHang, String loaiSp, int soluong, int price, String img) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.tenhang = tenHang;
        this.loaisp = loaiSp;
        this.soluong = soluong;
        this.price = price;
        this.img = img;
    }

    public Product(String name, String color, String tenHang, String loaiSp, int soluong, int price, String img) {
        this.name = name;
        this.color = color;
        this.tenhang = tenHang;
        this.loaisp = loaiSp;
        this.soluong = soluong;
        this.price = price;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setLoaisp(String loaisp) {
        this.loaisp = loaisp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
