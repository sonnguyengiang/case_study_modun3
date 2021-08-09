package dao;

import dao.connectSQL.ConnectionCSDL;
import models.Bill;
import models.Detail_Bill;
import models.UserBill;


import java.sql.*;
import java.util.ArrayList;

public class CRUD_Bill {
    static Connection connection = ConnectionCSDL.getConnection();

    public static void createBill(int id_user, String date) throws SQLException {
        String create =  "insert into bill(id_user, ngaymua, price_bill) value (?, ?, ?)";
        PreparedStatement preparedStatement= connection.prepareStatement(create);
        preparedStatement.setInt(1, id_user);
        preparedStatement.setString(2, date);
        preparedStatement.setInt(3, 0);
        preparedStatement.execute();
    }

    public static ArrayList<Bill> getIdBill() throws SQLException {
        String select = "select * from bill";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        ArrayList<Bill> list = new ArrayList<>();

        while (resultSet.next()){
            int id_bill = resultSet.getInt("id_bill");
            int id_user = resultSet.getInt("id_user");
            String date = resultSet.getString("ngaymua");
            int price_bill = resultSet.getInt("price_bill");
            Bill bill = new Bill(id_bill, id_user, date, price_bill);
            list.add(bill);
        }
        return list;
    }

    public static void updateBill(int id_bill, int price_bill) throws SQLException {
        String update = "update bill set price_bill = ? where id_bill = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(update);
        preparedStatement.setInt(1, price_bill);
        preparedStatement.setInt(2, id_bill);
        preparedStatement.execute();
    }

    public static ArrayList<Bill> getBill() throws SQLException {
        String getBill = "SELECT bill.id_bill, account.username, bill.ngaymua, bill.price_bill from account inner join bill on bill.id_user = account.id_account where bill.price_bill > 0";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(getBill);
        ArrayList<Bill> list1 = new ArrayList<>();

        while (resultSet.next()){
            int id_bill = resultSet.getInt("bill.id_bill");
            String username = resultSet.getString("account.username");
            String date = resultSet.getString("bill.ngaymua");
            int price_bill = resultSet.getInt("bill.price_bill");
            Bill bill = new Bill(id_bill, username, date, price_bill);
            list1.add(bill);
            System.out.println(id_bill);
        }
        return list1;
    }

}
