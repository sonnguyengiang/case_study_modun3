package Controller;

import Services.BillServices;
import Services.LoginServices;
import Services.ProductServices;
import Services.DetailBillServices;
import dao.CRUD_Bill;
import models.Account;
import models.Bill;

import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    LoginServices loginServices = new LoginServices();
    BillServices billServices = new BillServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;

        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "login":
                try {
                    String username = req.getParameter("username");
                    String password = req.getParameter("password");
                    String checkString = loginServices.Login(username, password);
                    int id_user = loginServices.getIdUser(username);
                    String date = String.valueOf((LocalDate.now()));
                    billServices.createBill(id_user, date);
                    int id_bill = billServices.getIdBill();
                    HttpSession session = req.getSession();
                    session.setAttribute("id_bill", id_bill);
                    session.setAttribute("username", username);
                    session.setAttribute("iduser", id_user);
                    switch (checkString) {
                        case "user":
                            resp.sendRedirect("/user?action=home");
                            break;
                        case "admin":
                            resp.sendRedirect("/views/Admin/MainPageAdmin.jsp");
                            break;
                        default:
                            try {
                                req.setAttribute("err", true);
                                dispatcher = req.getRequestDispatcher("index.jsp");
                                dispatcher.forward(req, resp);
                            } catch (Exception a) {
                                a.printStackTrace();
                            }
                    }
                } catch (Exception a) {
                    a.printStackTrace();
                }
                break;

            case "create":
                String username_create = req.getParameter("username");
                String password_create = req.getParameter("password");
                String gmail_create = req.getParameter("gmail");
                String phonenumber_create = req.getParameter("phonenumber");
                String address_create = req.getParameter("address");
                Account account = new Account(username_create, password_create, gmail_create, phonenumber_create, address_create);

                try {
                    loginServices.create(account);
                } catch (Exception a) {
                    req.setAttribute("CreateErr", true);
                    dispatcher = req.getRequestDispatcher("index.jsp");
                    dispatcher.forward(req, resp);
                }
                resp.sendRedirect("index.jsp");
                break;
        }
    }
}
