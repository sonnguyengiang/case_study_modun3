package dao;

import dao.connectSQL.ConnectionCSDL;
import models.Detail_Bill;
import models.UserBill;


import java.sql.*;
import java.util.ArrayList;

public class CRUD_Bill {
    static Connection connection = ConnectionCSDL.getConnection();

    public static ArrayList<Detail_Bill> getList() throws SQLException {
        String select = "select * from detail_bill";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        ArrayList<Detail_Bill> list = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt("id_detail_bill");
            int id_sp = resultSet.getInt("id_sp");
            int soluongmua = resultSet.getInt("soluongmua");
            int count_price = resultSet.getInt("count_price");
            Detail_Bill detail_bill = new Detail_Bill(id, id_sp, soluongmua, count_price);
            list.add(detail_bill);
        }
        return list;
    }

    public static void create(Detail_Bill detail_bill) throws SQLException {
        String create = "insert into detail_bill(id_sp, soluongmua, count_price) value (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(create);
        preparedStatement.setInt(1, detail_bill.getId_sp());
        preparedStatement.setInt(2, detail_bill.getSoluongmua());
        preparedStatement.setInt(3, detail_bill.getTong_gia());
        preparedStatement.execute();

    }
}
