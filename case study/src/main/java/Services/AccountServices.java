package Services;

import dao.CRUD_Account;
import models.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccountServices {
    public ArrayList<Account> list = new ArrayList<>();

    public AccountServices() {
    }

    public boolean loginUser(String username, String password) {
        try {
            list = CRUD_Account.login(username);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        if (!list.get(0).getUserName().equals(username)) {
            return false;
        } else {
            if (list.get(0).getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public String login(String username, String password) {
        String check = "null";
        try {
            list = CRUD_Account.login(username);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        if (!list.get(0).getUserName().equals(username)) {
            check = "False";
            return check;
        } else if (list.get(0).getUserName() == null) {
            return check;
        } else {
            if (list.get(0).getUserName().equals(password)) {
                if (list.get(0).getType() == "USER") {
                    check = "UserLogin";
                    return check;
                } else {
                    check = "AdminLogin";
                    return check;
                }
            } else {
                check = "UserFalse";
                return check;
            }
        }
    }
}
