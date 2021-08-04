package Services;

import dao.CRUD_Account;
import models.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class LoginServices {
    public ArrayList<Account> list = new ArrayList<>();

    public LoginServices() {
    }


    public String Login(String username, String password) {
        String check = "null";
        try {
            list = CRUD_Account.login(username);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        if (list == null) {
            return check;
        } else if (!list.get(0).getUserName().equals(username)) {
            return "userFalse";
        } else {
            check = checkPass(password);
            return check;
        }
    }

    private String checkPass(String password) {
        String checkPassword = "passFalse";
        if (!list.get(0).getPassword().equals(password)) {
            return checkPassword;
        } else {
            checkPassword = checkUser();
            return checkPassword;
        }
    }

    private String checkUser() {
        String checkUser = "user";
        String user = "USER";
        if (list.get(0).getType().equals(user)) {
            return checkUser;
        } else {
            checkUser = "admin";
            return checkUser;
        }
    }

    public void create(Account account){
        try {
            CRUD_Account.createUser(account);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.add(account);
    }
}
