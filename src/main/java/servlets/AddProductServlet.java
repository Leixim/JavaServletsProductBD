package servlets;

import dao.ManufacturerDAO;
import dao.ProductDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class AddProductServlet extends HttpServlet {
    ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
    ProductDAO productDAO = new ProductDAO();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/add_product.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html; charset = utf-8");
        try {
            String productName = request.getParameter("product_name");
            BigDecimal productPrice = new BigDecimal(request.getParameter("product_price"));
            Long manufacturerId = Long.parseLong(request.getParameter("manufacturerid"));
            productDAO.create(productName, productPrice, manufacturerId);
            response.getWriter().print("Product added");
        } catch (Exception e) {
            response.getWriter().print("Error adding product");
        }

    }
}