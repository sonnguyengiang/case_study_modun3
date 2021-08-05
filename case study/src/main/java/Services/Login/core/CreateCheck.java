package Services.Login.core;

import dao.account.CRUD_Account;
import models.account.Account;

import java.sql.SQLException;
import java.util.ArrayList;

public class CreateCheck {
    private ArrayList<Account> list = new ArrayList<>();
    public CreateCheck() {
        try {
            list = CRUD_Account.show();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
    public String createCheck(String username, String phonenumber, String gmail) {
        String check = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(username)){
                check = "user_lap";
                return check;
            } else {
                check = checkGmail(gmail, phonenumber);
                return check;
            }
        }
        return null;
    }

    private String checkGmail(String gmail, String phoneNumber){
        String check = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGmail().equals(gmail)){
                check = "gmail_lap";
                return check;
            } else {
                check = checkPhoneNumber(phoneNumber);
                return check;
            }
        }
        return null;
    }

    private String checkPhoneNumber(String phoneNumber){
        String check = "oke";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPhoneNumber().equals(phoneNumber)){
                check = "phoneNumber_lap";
                return check;
            } else {
                return check;
            }
        }
        return null;
    }
}
