package negocio;

import db.AltaAutoDB;
import db.BajaAutoDB;
import model.Automovil;

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
@WebServlet(name = "ServletBajaAutomovil", urlPatterns = {"/bajaAutomovil"})
public class ServletBajaAutomovil extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String id = (request.getParameter("id"));


        BajaAutoDB bDB = new BajaAutoDB();

        try {
            if(bDB.bajaAutomovil(id) == 1)
                response.sendRedirect("successBajaAuto.html");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
