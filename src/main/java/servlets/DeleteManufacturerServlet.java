package servlets;


import dao.ManufacturerDAO;
import models.Manufacturer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteManufacturerServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("/jsp/delete_manufacturer.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset = utf-8");

        try {
            Long manufacturerId = Long.parseLong(request.getParameter("manufacturerId"));
            ManufacturerDAO manufacturerDAO = new ManufacturerDAO();
            manufacturerDAO.delete(manufacturerId);
            response.getWriter().print("Manufacturer deleted");
        } catch (Exception e) {
            response.getWriter().print("Error deleting manufacturer");
        }
    }
}
