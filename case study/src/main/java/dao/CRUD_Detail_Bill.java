package dao;

import dao.connectSQL.ConnectionCSDL;
import models.Detail_Bill;
import models.UserBill;

import java.sql.*;
import java.util.ArrayList;

public class CRUD_Detail_Bill {
    static Connection connection = ConnectionCSDL.getConnection();

    public static void CreateDetailBill(Detail_Bill detail_bill) throws SQLException {
        String create = "insert into detail_bill(id_user,id_bill, id_sp, count_price, soluongmua) value (?, ?, ? , ? ,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(create);
        preparedStatement.setInt(1, detail_bill.getId_user());
        preparedStatement.setInt(2, detail_bill.getId_bill());
        preparedStatement.setInt(3, detail_bill.getId_sp());
        preparedStatement.setInt(4, detail_bill.getTong_gia());
        preparedStatement.setInt(5, detail_bill.getSoluongmua());
        preparedStatement.execute();
    }

    public static ArrayList<UserBill> getBillTemp(int id_user) throws SQLException {
        String select = "select detail_bill.id_detail_bill, product.id_sp, product.img, product.name_sp, product.price, detail_bill.soluongmua, detail_bill.count_price from product inner join detail_bill on product.id_sp = detail_bill.id_sp where detail_bill.id_user = " + id_user + "";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        ArrayList<UserBill> list = new ArrayList<>();

        while (resultSet.next()) {
            int id_detail_bill = resultSet.getInt("detail_bill.id_detail_bill");
            int id_sp = resultSet.getInt("product.id_sp");
            String img = resultSet.getString("product.img");
            String name = resultSet.getString("product.name_sp");
            int price = resultSet.getInt("product.price");
            int soluong = resultSet.getInt("detail_bill.soluongmua");
            int count_price = resultSet.getInt("count_price");
            UserBill userBill = new UserBill(id_detail_bill ,id_sp, img, name, price, soluong, count_price);
            list.add(userBill);
        }
        return list;
    }

    public static void deleteBillTemp(int id_detail_bill) throws SQLException {
        System.out.println(id_detail_bill);
        String delete = "DELETE FROM detail_bill WHERE id_detail_bill = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id_detail_bill);
        preparedStatement.execute();
    }
}
