package Controller;

import Services.BillServices;
import Services.ProductServices;
import Services.DetailBillServices;
import dao.CRUD_Account;
import dao.CRUD_Detail_Bill;
import dao.CRUD_test;
import models.Detail_Bill;
import models.UserBill;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/user"})
public class UserServlet extends HttpServlet {
    ProductServices productServices = new ProductServices();
    DetailBillServices detailBillServices = new DetailBillServices();
    BillServices billServices = new BillServices();

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
            case "showCart":
                HttpSession session = req.getSession();
                int id_user = (int) session.getAttribute("iduser");
                ArrayList<UserBill> list = new ArrayList<>();
                try {
                    list = CRUD_Detail_Bill.getBillTemp(id_user);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
                req.setAttribute("Cart", list);
                dispatcher = req.getRequestDispatcher("/views/User/cart.jsp");
                dispatcher.forward(req, resp);
                break;
            case "addDetailBill":
                int id_sp = Integer.parseInt(req.getParameter("index"));
                Detail_Bill detail_bill = new Detail_Bill(id_sp);
                detailBillServices.list.add(detail_bill);
                resp.sendRedirect("/user?action=home");
                break;
            case "delete":
                try {
                    int id_detail_bill = Integer.parseInt(req.getParameter("id_detail_bill"));
                    int index_delete = Integer.parseInt(req.getParameter("index"));
                    detailBillServices.delete(index_delete, id_detail_bill);
                    resp.sendRedirect("/user?action=showCart");
                    break;
                } catch (Exception e) {
                    int id_detail_bill = Integer.parseInt(req.getParameter("id_detail_bill"));
                    int index_delete = Integer.parseInt(req.getParameter("index"));
                    detailBillServices.delete(index_delete, id_detail_bill);
                    resp.sendRedirect("/user?action=showCart");
                    break;
                }
            case "createBill":
                int price_bill = Integer.parseInt(req.getParameter("price_bill"));
                int id_bill = Integer.parseInt(req.getParameter("id_bill"));
                billServices.updateBill(id_bill, price_bill);
                resp.sendRedirect("/user?action=home");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher;

        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "addProduct":
                int id_user = Integer.parseInt(req.getParameter("id_user"));
                int id_bill = billServices.getIdBill();
                System.out.println(id_bill);
                int id_sp = Integer.parseInt(req.getParameter("index"));
                int soluongmua = Integer.parseInt(req.getParameter("number"));
                int price = Integer.parseInt(req.getParameter("price"));
                int count_price = price * soluongmua;
                Detail_Bill detail_bill = new Detail_Bill(id_user, id_bill, id_sp, count_price, soluongmua);
                detailBillServices.createTemp(detail_bill);
                resp.sendRedirect("/user?action=showCart");
                break;
            case "changePassword":
                int id_user1 = Integer.parseInt(req.getParameter("id_user"));
                String password = req.getParameter("password");
                try {
                    CRUD_Account.userEditAccount(password, id_user1);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
                req.setAttribute("changepass", true);
                dispatcher = req.getRequestDispatcher("/views/User/checkout.jsp");
                dispatcher.forward(req, resp);
                break;
        }

    }
}
