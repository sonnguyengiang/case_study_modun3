package Services;


import dao.CRUD_test;
import models.UserBill;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserBillServices {

    LoginServices loginServices = new LoginServices();
    public ArrayList<UserBill> listBill = new ArrayList<>();
//   public UserBillServices(){
//       try {
//           listBill = CRUD_test.getBill(CRUD_test.loginTest());
//       } catch (SQLException sqlException) {
//           sqlException.printStackTrace();
//       }
//   }

   public void getUsernameTest(String username) throws SQLException {
        int id = CRUD_test.loginTest(username);
       listBill = CRUD_test.getBill(id);
   }

}
