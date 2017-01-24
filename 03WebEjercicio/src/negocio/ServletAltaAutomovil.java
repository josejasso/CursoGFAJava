package negocio;

import db.AltaAutoDB;
import model.Automovil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by jl.jasso on 19/01/2017.
 */
@WebServlet(name = "ServletAltaAutomovil", urlPatterns = {"/altaAutomovil"})
public class ServletAltaAutomovil extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        Automovil automovil = new Automovil("","","","","");
        automovil.setId(request.getParameter("id"));
        automovil.setColor(request.getParameter("color"));
        automovil.setMarca(request.getParameter("marca"));
        automovil.setModelo(request.getParameter("modelo"));
        automovil.setKilometraje(request.getParameter("kilometraje"));

        AltaAutoDB aDB = new AltaAutoDB();

        try {
            if(aDB.registrarAutomovil(automovil) == 1)
                response.sendRedirect("successAltaAuto.html");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
