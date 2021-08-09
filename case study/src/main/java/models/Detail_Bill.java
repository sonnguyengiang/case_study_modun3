package models;

public class Detail_Bill {
    private int id;
    private int id_bill;
    private int id_user;
    private int id_sp;
    private int soluongmua;
    private int tong_gia;


    public Detail_Bill(int id_user,int id_bill, int id_sp, int tong_gia, int soluongmua) {
        this.id_bill = id_bill;
        this.id_user = id_user;
        this.id_sp = id_sp;
        this.soluongmua = soluongmua;
        this.tong_gia = tong_gia;
    }

    public Detail_Bill( int id_sp, int tong_gia) {
        this.id_sp = id_sp;
        this.tong_gia = tong_gia;
    }

    public Detail_Bill( int id_sp) {
        this.id_sp = id_sp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_sp() {
        return id_sp;
    }

    public void setId_sp(int id_sp) {
        this.id_sp = id_sp;
    }

    public int getSoluongmua() {
        return soluongmua;
    }

    public void setSoluongmua(int soluongmua) {
        this.soluongmua = soluongmua;
    }

    public int getTong_gia() {
        return tong_gia;
    }

    public void setTong_gia(int tong_gia) {
        this.tong_gia = tong_gia;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }
}
