package dao;

import dao.connectSQL.ConnectionCSDL;
import models.Product;

import java.sql.*;
import java.util.ArrayList;

public class CRUD_Product {
    static Connection connection = ConnectionCSDL.getConnection();

    public static ArrayList<Product> showList() throws SQLException {
        String select = "select * from product";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(select);
        ArrayList<Product> list = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id_sp");
            String tensp = resultSet.getString("name_sp");
            String color = resultSet.getString("mau_sp");
            String tenhang = resultSet.getString("tenhanng");
            String type = resultSet.getString("loaisp");
            int count = resultSet.getInt("soluong");
            int price = resultSet.getInt("price");
            String img = resultSet.getString("img");
            Product product = new Product(id, tensp, color, tenhang, type, count, price, img);

            list.add(product);
        }
        return list;
    }

    public static void createProduct(Product product) throws SQLException {
        String create = "insert into product(name_sp, mau_sp, tenhanng, loaisp, soluong, price, img) value (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(create);
        preparedStatement.setString(1, product.getName());
        preparedStatement.setString(2, product.getColor());
        preparedStatement.setString(3, product.getTenhang());
        preparedStatement.setString(4, product.getLoaisp());
        preparedStatement.setInt(5, product.getSoluong());
        preparedStatement.setInt(6, product.getPrice());
        preparedStatement.setString(7, product.getImg());
        preparedStatement.execute();
    }

    public static void editProduct(Product product, int id) throws SQLException {
        String edit = "update product set name_sp = ?, mau_sp = ?, tenhanng = ?, loaisp = ?, soluong = ?, price = ?, img = ? where id_sp = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(edit);
        preparedStatement.setString(1, product.getName());
        preparedStatement.setString(2, product.getColor());
        preparedStatement.setString(3, product.getTenhang());
        preparedStatement.setString(4, product.getLoaisp());
        preparedStatement.setInt(5, product.getSoluong());
        preparedStatement.setInt(6, product.getPrice());
        preparedStatement.setString(7, product.getImg());
        preparedStatement.setInt(8, id);
        preparedStatement.execute();
    }

    public static void deleteProduct(int id) throws SQLException {
        String delete = "delete from product where id_sp = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
        System.out.println(id);
    }

    public static ArrayList<Product> find(String nameProduct) throws SQLException {
        String find = "select * from product where name_sp like '%" + nameProduct + "%'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(find);
        ArrayList<Product> list = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id_sp");
            String tensp = resultSet.getString("name_sp");
            String color = resultSet.getString("mau_sp");
            String tenhang = resultSet.getString("tenhanng");
            String type = resultSet.getString("loaisp");
            int count = resultSet.getInt("soluong");
            int price = resultSet.getInt("price");
            String img = resultSet.getString("img");
            Product product = new Product(id, tensp, color, tenhang, type, count, price, img);

            list.add(product);
        }
        return list;
    }

}
