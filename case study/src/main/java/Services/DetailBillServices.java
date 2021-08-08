package Services;


import dao.CRUD_Detail_Bill;
import dao.CRUD_test;
import models.Account;
import models.Detail_Bill;
import models.UserBill;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DetailBillServices {
    public ArrayList<Detail_Bill> list = new ArrayList<>();

    public void create(Detail_Bill detail_bill){
        try {
            CRUD_Detail_Bill.CreateDetailBill(detail_bill);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.add(detail_bill);
    }

    public void createTemp(Detail_Bill detail_bill){
        try {
            CRUD_Detail_Bill.CreateDetailBill(detail_bill);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.add(detail_bill);
    }

    public void delete(int index, int id_detail_bill){
        try {
            CRUD_Detail_Bill.deleteBillTemp(id_detail_bill);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.remove(index);
    }
}
