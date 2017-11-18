package servlets;

import dao.ProductDAO;
import models.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetAllProductsServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ProductDAO productDAO = new ProductDAO();
        List<Product> productList = productDAO.getAll();
        response.getWriter().println();
        response.getWriter().println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>List of products</h2>"+
                "<table border=\"1|0\">\n" +
                "  <tr>\n" +
                "    <th>Product ID</th>\n" +
                "    <th>Product Name</th> \n" +
                "    <th>Product Price</th> \n" +
                "  </tr>\n");
        for (Product product:productList) {
            response.getWriter().println("<tr>\n" +
                    "    <th>"+ product.getId()+ "</th>\n" +
                    "    <th>"+ product.getProductName()+"</th> \n" +
                    "    <th>"+ product.getPrice()+ "</th>\n" +
                    "  </tr>\n");
        }
        response.getWriter().println(
                "</table>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }
}
