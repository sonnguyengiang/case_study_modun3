package Services;

import dao.CRUD_Account;
import models.account.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class LoginServices {
    public ArrayList<Account> list = new ArrayList<>();

    public LoginServices() {
    }

    /* kiểm tra và phân loại user */
    public String Login(String username, String password) throws SQLException {
        String check = "null";
        list = CRUD_Account.login(username);
        if (list.size() == 0) {
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


    public void create(Account account) throws SQLException {
        CRUD_Account.create(account);
        list.add(account);
    }
}
