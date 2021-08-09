package Controller;

import Services.ProductServices;
import dao.CRUD_Product;
import models.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    ProductServices productServices = new ProductServices();
    RequestDispatcher dispatcher;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "show":
                req.setAttribute("productList", productServices.getList());
                dispatcher = req.getRequestDispatcher("/views/Admin/ShowProduct.jsp");
                dispatcher.forward(req, resp);
                break;
            case "create":
                resp.sendRedirect("/views/Admin/CreateProduct.jsp");
                break;
            case "edit":
                int index_edit = Integer.parseInt(req.getParameter("index"));
                productServices.updateList();
                req.setAttribute("productListEdit", productServices.list.get(index_edit));
                dispatcher = req.getRequestDispatcher("/views/Admin/EditProduct.jsp");
                dispatcher.forward(req, resp);
                break;
            case "delete":
                int index_delete = Integer.parseInt(req.getParameter("index"));
                productServices.delete(index_delete);
                resp.sendRedirect("/product?action=show");
                break;
            case "showProduct":
                productServices.updateList();
                req.setAttribute("productList", productServices.list);
                dispatcher = req.getRequestDispatcher("/views/User/product-grid.jsp");
                dispatcher.forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "show":
                req.setAttribute("productList", productServices.getList());
                dispatcher = req.getRequestDispatcher("/views/Admin/ShowProduct.jsp");
                dispatcher.forward(req, resp);
                break;
            case "find":
                String nameProduct = req.getParameter("find");
                ArrayList<Product> list = null;
                try {
                    list = CRUD_Product.find(nameProduct);
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
                req.setAttribute("productList", list);
                dispatcher = req.getRequestDispatcher("/views/Admin/ShowProduct.jsp");
                dispatcher.forward(req, resp);
                break;
            case "create":
                String tensp = req.getParameter("tensp");
                String tenhang = req.getParameter("tenhang");
                String color = req.getParameter("color");
                String loaisp = req.getParameter("loaisp");
                int soluong = Integer.parseInt(req.getParameter("soluong"));
                int gia = Integer.parseInt(req.getParameter("price"));
                String img = req.getParameter("img");
                Product product = new Product(tensp, color, tenhang, loaisp, soluong, gia, img);
                productServices.create(product);
                resp.sendRedirect("/product?action=show");
                break;
            case "edit":
                int index_edit = Integer.parseInt(req.getParameter("index"));
                String tensp_edit = req.getParameter("tensp");
                String tenhang_edit = req.getParameter("tenhang");
                String color_edit = req.getParameter("color");
                String loaisp_edit = req.getParameter("loaisp");
                int soluong_edit = Integer.parseInt(req.getParameter("soluong"));
                int gia_edit = Integer.parseInt(req.getParameter("price"));
                String img_edit = req.getParameter("img");
                Product product_edit = new Product(tensp_edit, color_edit, tenhang_edit, loaisp_edit, soluong_edit, gia_edit, img_edit);
                productServices.edit(product_edit, index_edit);
                resp.sendRedirect("/product?action=show");
                break;
            default:

        }
    }
}
