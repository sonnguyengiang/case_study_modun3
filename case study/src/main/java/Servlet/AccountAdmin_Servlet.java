package Servlet;

import Services.AccountAdmin_Services;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "")
///admin_account
public class AccountAdmin_Servlet extends HttpServlet {
    RequestDispatcher dispatcher;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountAdmin_Services accountAdmin_services = new AccountAdmin_Services();
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }

        switch (action){
            default:
                req.setAttribute("AccountList", accountAdmin_services.list);
                dispatcher = req.getRequestDispatcher("views/Admin/ShowAccount.jsp");
                dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AccountAdmin_Services accountAdmin_services = new AccountAdmin_Services();
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }

        switch (action){
            default:
                req.setAttribute("AccountList", accountAdmin_services.list);
                dispatcher = req.getRequestDispatcher("views/Admin/ShowAccount.jsp");
                dispatcher.forward(req, resp);
        }
    }
}
