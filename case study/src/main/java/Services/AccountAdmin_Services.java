package Services;

import Servlet.AccountAdmin_Servlet;
import dao.CRUD_Account;
import models.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccountAdmin_Services {
    public ArrayList<Account> list = new ArrayList<>();

    public AccountAdmin_Services(){
        try {
            list = CRUD_Account.show();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
