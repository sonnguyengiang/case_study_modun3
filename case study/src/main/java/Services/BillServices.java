package Services;

import dao.CRUD_Bill;
import models.Bill;

import java.sql.SQLException;
import java.util.ArrayList;

public class BillServices {
    public ArrayList<Bill> list = new ArrayList<>();

    public void createBill(int id_user, String date){
        try {
            CRUD_Bill.createBill(id_user, date);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public int getIdBill(){
        ArrayList<Bill> list = null;
        try {
          list = CRUD_Bill.getIdBill();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        int id_bill = list.size();
        return id_bill;
    }

    public void updateBill(int id_bill, int price_bill){
        try {
            CRUD_Bill.updateBill(id_bill, price_bill);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
