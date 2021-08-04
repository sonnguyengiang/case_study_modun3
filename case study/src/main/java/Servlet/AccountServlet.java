package Servlet;

import Services.AccountServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class AccountServlet extends HttpServlet {
    AccountServices accountServices = new AccountServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }

        switch (action){
            case "login":
            default:
                resp.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }

        switch (action){
            case "login":
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                String check = accountServices.checkLogin(username, password);
                switch (check){
                    case "null":
                }
            default:
                resp.sendRedirect("index.jsp");
        }


    }
}
