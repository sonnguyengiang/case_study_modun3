package Services;

import dao.CRUD_Account;
import models.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class AccountServices {
    public ArrayList<Account> list = new ArrayList<>();

    public AccountServices(){
        try {
            list = CRUD_Account.show();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    public void create(Account account){
        try {
            CRUD_Account.createAccount(account);
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.add(account);
    }

    public void delete(int index){
        try {
            CRUD_Account.deleteAccount(list.get(index).getId());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.remove(index);
    }

    public void edit(Account account, int index){
        try {
            CRUD_Account.editAccount(account, list.get(index).getId());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        list.set(index, account);
    }
}
