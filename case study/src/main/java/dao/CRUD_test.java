package dao;

import dao.connectSQL.ConnectionCSDL;
import models.Account;
import models.UserBill;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUD_test {
    static Connection connection = ConnectionCSDL.getConnection();

    public static ArrayList<UserBill> getBill(int id) throws SQLException {
        String select = "select product.img, product.name_sp, product.price, product.soluong, detail_bill.count_price from  product inner join detail_bill on product.id_sp = detail_bill.id_sp  inner join bill on detail_bill.id_detail_bill = bill.id_detail_bill inner join account on account.id_account = bill.id_user where account.id_account = "+ id +"";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        ArrayList<UserBill> list = new ArrayList<>();

        while (resultSet.next()){
            String img = resultSet.getString("product.img");
            String name = resultSet.getString("product.name_sp");
            int price = resultSet.getInt("product.price");
            int soluong = resultSet.getInt("product.soluong");
            int count_price = resultSet.getInt("detail_bill.count_price");
            UserBill userBill = new UserBill(img, name, price, soluong, count_price);
            list.add(userBill);
        }
        return list;
    }

    public static int loginTest(String user) throws SQLException {
        String take = "select id_account from account where username like '"+ user +"'";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(take);
        List<Account> list = new ArrayList<>();
        int id = 0;

        while (resultSet.next()) {
            id = resultSet.getInt("id_account");
            System.out.println(id);
        }
        System.out.println(id);
        return id;
    }
}
