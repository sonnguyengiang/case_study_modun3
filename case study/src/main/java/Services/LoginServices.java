package Services;

import dao.CRUD_Account;
import dao.CRUD_test;
import models.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class LoginServices {
    public ArrayList<Account> list = new ArrayList<>();

    public LoginServices() {
    }

    /* kiểm tra và phân loại user */
    public String Login(String username, String password) throws SQLException {
        list = CRUD_Account.login(username);

        if (list.size() == 0) {
            return "null";
        } else if (list.get(0).getGmail().equals(username) || list.get(0).getUserName().equals(username)) {
            return checkPass(password);
        } else {
            return "userFalse";
        }
    }

    private String checkPass(String password) {
        if (!list.get(0).getPassword().equals(password)) {
            return "false";
        } else {
            return checkUser();
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

    public int getIdUser(String username){
        ArrayList<Account> list = null;
        try {
            list = CRUD_Account.login(username);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return list.get(0).getId();
    }



}
