package Controller;

import Services.AccountServices;
import dao.CRUD_Account;
import models.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/admin"})
public class AdminServlet extends HttpServlet {
    AccountServices accountServices = new AccountServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String action = req.getParameter("action");

        if (action == null){
            action = "";
        }

        switch (action){
            case "create":
                resp.sendRedirect("views/Admin/CreateAccount.jsp");
                break;
            case "delete":
                int index = Integer.parseInt(req.getParameter("index"));
                accountServices.delete(index);
                resp.sendRedirect("/admin");
                break;
            case "edit":
                int index_edit = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("accountEdit", accountServices.list.get(index_edit));
                dispatcher = req.getRequestDispatcher("views/Admin/EditAccount.jsp");
                dispatcher.forward(req, resp);
                break;
            case "find":
                String user = req.getParameter("find");
                ArrayList<Account> list = null;
                try {
                    list = CRUD_Account.find(user);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
                req.setAttribute("AccountList", list);
                dispatcher = req.getRequestDispatcher("/views/Admin/ShowAccount.jsp");
                dispatcher.forward(req, resp);
                break;
            default:
                req.setAttribute("AccountList", accountServices.list);
                dispatcher = req.getRequestDispatcher("/views/Admin/ShowAccount.jsp");
                dispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        String action = req.getParameter("action");

        if (action == null){
            action = "";
        }

        switch (action){
            case "create":
                String username_create = req.getParameter("username");
                String password_create = req.getParameter("password");
                String gmail_create = req.getParameter("gmail");
                String phonenumber_create = req.getParameter("phonenumber");
                String address_create = req.getParameter("address");
                String type_create = req.getParameter("type");
                Account account = new Account(username_create, password_create, gmail_create, phonenumber_create, address_create, type_create);
               accountServices.create(account);
                resp.sendRedirect("/admin");
                break;
            case "edit":
                int index_edit = Integer.parseInt(req.getParameter("index"));
                String username_edit = req.getParameter("username");
                String password_edit = req.getParameter("password");
                String gmail_edit = req.getParameter("gmail");
                String phonenumber_edit = req.getParameter("phonenumber");
                String address_edit = req.getParameter("address");
                String type_edit = req.getParameter("type");
                Account account_edit = new Account(username_edit, password_edit, gmail_edit, phonenumber_edit, address_edit, type_edit);
                accountServices.edit(account_edit, index_edit);
                resp.sendRedirect("/admin");
                break;
            case "find":
                String user = req.getParameter("find");
                ArrayList<Account> list = null;
                try {
                    list = CRUD_Account.find(user);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
                req.setAttribute("AccountList", list);
                dispatcher = req.getRequestDispatcher("/views/Admin/ShowAccount.jsp");
                dispatcher.forward(req, resp);
                break;
            default:
                req.setAttribute("AccountList", accountServices.list);
                dispatcher = req.getRequestDispatcher("/views/Admin/ShowAccount.jsp");
                dispatcher.forward(req, resp);
        }
    }
}
