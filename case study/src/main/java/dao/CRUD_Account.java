package dao;

import dao.connectSQL.ConnectionCSDL;
import models.account.Account;

import java.sql.*;
import java.util.ArrayList;

public class CRUD_Account {
    static Connection connection = ConnectionCSDL.getConnection();

    public static ArrayList<Account> show() throws SQLException {
        String show = "select * from account";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(show);
        ArrayList<Account> list = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id_account");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String phoneNumber = resultSet.getString("phonenumber");
            String gmail = resultSet.getString("gmail");
            String address = resultSet.getString("address");
            String type = resultSet.getString("type");
            Account account = new Account(id, username, password, gmail, phoneNumber, address, type);

            list.add(account);
        }
        return list;
    }

    public static ArrayList<Account> login(String user) throws SQLException {
        String take_data_login_user = "select * from account where username like '"+ user + "' or gmail like '"+ user +"' ";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(take_data_login_user);
        ArrayList<Account> list = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id_account");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String phoneNumber = resultSet.getString("phonenumber");
            String gmail = resultSet.getString("gmail");
            String address = resultSet.getString("address");
            String type = resultSet.getString("type");

            Account account = new Account(id, username, password, gmail, phoneNumber, address, type);
            list.add(account);

        }
        return list;
    }


    public static void create(Account account) throws SQLException {
        String create = "INSERT INTO account (username, password, phonenumber, gmail, address) VALUES (?,?,?,?,?);";

        PreparedStatement preparedStatement = connection.prepareStatement(create);
        preparedStatement.setString(1, account.getUserName());
        preparedStatement.setString(2, account.getPassword());
        preparedStatement.setString(3, account.getPhoneNumber());
        preparedStatement.setString(4, account.getGmail());
        preparedStatement.setString(5, account.getAddress());
        preparedStatement.execute();
    }


    public static void createAccount(Account account) throws SQLException {
        String create = "INSERT INTO account (username, password, phonenumber, gmail, address, type) VALUES (?,?,?,?,?,?);";

        PreparedStatement preparedStatement = connection.prepareStatement(create);
        preparedStatement.setString(1, account.getUserName());
        preparedStatement.setString(2, account.getPassword());
        preparedStatement.setString(3, account.getPhoneNumber());
        preparedStatement.setString(4, account.getGmail());
        preparedStatement.setString(5, account.getAddress());
        preparedStatement.setString(6, account.getType());
        preparedStatement.execute();
    }

    public static void editAccount(Account account, int id) throws SQLException {
        String edit = "update account set username = ?, password = ?, phonenumber = ?, gmail = ?, address = ?, type = ? where id_account = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(edit);
        preparedStatement.setString(1, account.getUserName());
        preparedStatement.setString(2, account.getPassword());
        preparedStatement.setString(3, account.getPhoneNumber());
        preparedStatement.setString(4, account.getGmail());
        preparedStatement.setString(5, account.getAddress());
        preparedStatement.setString(6, account.getType());
        preparedStatement.setInt(7, id);
        preparedStatement.execute();
    }

    public static ArrayList<Account> find(String user) throws SQLException {
        String find = "select * from account where username like '%" + user + "%'";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(find);
        ArrayList<Account> list = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id_account");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String phoneNumber = resultSet.getString("phonenumber");
            String gmail = resultSet.getString("gmail");
            String address = resultSet.getString("address");
            String type = resultSet.getString("type");
            Account account = new Account(id, username, password, gmail, phoneNumber, address, type);

            list.add(account);
        }
        return list;
    }

    public static void deleteAccount(int id) throws SQLException {
        String delete = "delete from account where id_account = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }
}






















