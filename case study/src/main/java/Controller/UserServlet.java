package Controller;

import Services.ProductServices;
import Services.UserBillServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/user"})
public class UserServlet extends HttpServlet {
    ProductServices productServices = new ProductServices();
    UserBillServices userBillServices = new UserBillServices();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;

        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "home":
                productServices.updateList();
                req.setAttribute("productList", productServices.list);
                dispatcher = req.getRequestDispatcher("/views/User/index.jsp");
                dispatcher.forward(req, resp);
                break;
            case "viewProduct":
                int index = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("productListView", productServices.list.get(index));
                dispatcher = req.getRequestDispatcher("/views/User/product-details.jsp");
                dispatcher.forward(req, resp);
                break;
            case "addProduct":
                int idProduct = Integer.parseInt(req.getParameter("index"));
                int id_sp = productServices.list.get(idProduct).getId();
                break;
            case "showBill":
                req.setAttribute("showBillList", userBillServices.listBill);
                dispatcher = req.getRequestDispatcher("/views/showtest.jsp");
                dispatcher.forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
