package negocio;

import db.BajaAvionDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by jl.jasso on 23/01/2017.
 */
@WebServlet(name = "ServletBajaAvion", urlPatterns = {"/bajaAvion"})
public class ServletBajaAvion extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String id = (request.getParameter("id"));


        BajaAvionDB bDB = new BajaAvionDB();

        try {
            if(bDB.bajaAvion(id) == 1)
                response.sendRedirect("successBajaAvion.html");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
