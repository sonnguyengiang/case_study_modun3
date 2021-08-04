package Services;

import dao.CRUD_Account;
import models.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccountServices {
    public ArrayList<Account> list = new ArrayList<>();

    public AccountServices(){};

    public void Login(String username, String password){
        try {
            list = CRUD_Account.login(username);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public String checkLogin(String username, String password){
        Login(username, password);
        String check = "null";
        String username_login = list.get(0).getUserName();
        String password_login = list.get(0).getPassword();

        if (username_login == null){
            return check;
        } else if (username_login == username){
            if (password_login == password){
                check = "login_true";
                return check;
            } else {
                check = "login_false";
                return check;
            }

        } else {
            check = "username_false";
            return check;
        }
    }

    public void createAccount(Account account){
        try {
            CRUD_Account.createUser(account);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.add(account);
    }

    public void editAccount(Account account, int index){
        try {
            CRUD_Account.editAccount(account,list.get(index).getId());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.set(index, account);
    }
}
