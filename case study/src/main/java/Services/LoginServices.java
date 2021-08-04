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
        try {
            list = CRUD_Account.login(username);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        if (!list.get(0).getUserName().equals(username)) {
            return "False";
        } else {
            if (list.get(0).getUserName() != password) {
                return "PasswordFalse";
            } else {
                return checkUser();
            }
        }
    }

    private String checkUser(){
        String checkUser = "User";
        if (list.get(0).getType().equals("ADMIN")){
            return "Admin";
        } else {
            return checkUser;
        }
    }
}
