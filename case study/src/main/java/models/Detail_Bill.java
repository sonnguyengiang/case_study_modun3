package models;

public class Detail_Bill {
    private int id;
    private int id_sp;
    private int soluongmua;
    private int tong_gia;

    public Detail_Bill(int id, int id_sp, int soluongmua, int tong_gia) {
        this.id = id;
        this.id_sp = id_sp;
        this.soluongmua = soluongmua;
        this.tong_gia = tong_gia;
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
}
