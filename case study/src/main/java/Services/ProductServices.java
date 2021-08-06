package Services;

import dao.CRUD_Product;
import models.Product;


import java.sql.SQLException;
import java.util.ArrayList;

public class ProductServices {
    public ArrayList<Product> list = new ArrayList<>();

    public void updateList(){
        try {
            list = CRUD_Product.showList();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public ArrayList<Product> getList(){
        try {
            list = CRUD_Product.showList();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return list;
    }

    public void create(Product product){
        try {
            CRUD_Product.createProduct(product);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.add(product);
    }

    public void edit(Product product, int index){
        updateList();
        try {
            CRUD_Product.editProduct(product, list.get(index).getId());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.set(index, product);
    }
}
