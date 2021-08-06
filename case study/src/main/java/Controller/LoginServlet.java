package Controller;

import Services.LoginServices;
import models.account.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    LoginServices loginServices = new LoginServices();

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
                    switch (checkString) {
                        case "user":
                            resp.sendRedirect("views/User/index.jsp");
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
