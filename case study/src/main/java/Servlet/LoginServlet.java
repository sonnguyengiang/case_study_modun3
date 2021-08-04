package Servlet;

import Services.AccountServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    AccountServices accountServices = new AccountServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
//               if (accountServices.loginUser(username, password) == true){
//                   resp.sendRedirect("views/Admin/ShowAccount.jsp");
//               }else {
//                   resp.sendRedirect("index.jsp");
//               }
                String check = accountServices.login(username, password);
                switch (check){
                    case "UserLogin":
                        resp.sendRedirect("views/Admin/ShowAccount.jsp");
                        break;
                    case "AdminLogin":
                        resp.sendRedirect("/login?show");
                        break;
                }
                break;
            default:
                resp.sendRedirect("index.jsp");
        }

    }
}
