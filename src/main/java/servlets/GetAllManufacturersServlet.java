package servlets;

import dao.ManufacturerDAO;
import models.Manufacturer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetAllManufacturersServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
        List<Manufacturer> manufacturerList = manufacturerDAO.getAll();
        response.getWriter().println();
        response.getWriter().println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2>List of manufacturers</h2>" +
                "<table border=\"1|0\">\n" +
                "  <tr>\n" +
                "    <th>Manufacturer ID</th>\n" +
                "    <th>Manufacturer Name</th> \n" +
                "  </tr>\n");
        for (Manufacturer manufacturer : manufacturerList) {
            response.getWriter().println("<tr>\n" +
                    "    <th>" + manufacturer.getId() + "</th>\n" +
                    "    <th>" + manufacturer.getManufacturerName() + "</th> \n" +
                    "  </tr>\n");
        }
        response.getWriter().println(
                "</table>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>");
    }
}
