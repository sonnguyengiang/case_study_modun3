package Servlet;

import Services.LoginServices;
import models.Account;

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
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        
        switch (action) {
            case "login":
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                String checkString = loginServices.Login(username, password);
                if (checkString == "user") {
                    resp.sendRedirect("views/login.jsp");
                } else if (checkString == "admin") {
                    resp.sendRedirect("views/adminlogin.jsp");
                } else if (checkString == "null"){
                    resp.sendRedirect("views/null.jsp");
                } else {
                    resp.sendRedirect("false/null.jsp");
                }
                break;

            case "create":
                String username_create = req.getParameter("username");
                String password_create = req.getParameter("password");
                String gmail_create = req.getParameter("gmail");
                String phonenumber_create = req.getParameter("phonenumber");
                String address_create = req.getParameter("address");
                Account account = new Account(username_create, password_create, gmail_create, password_create, address_create);

                loginServices.create(account);
                break;
        }

    }
}
