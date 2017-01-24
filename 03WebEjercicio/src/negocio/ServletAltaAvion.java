package negocio;

import db.AltaAvionDB;
import model.Avion;

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
@WebServlet(name = "ServletAltaAvion", urlPatterns = {"/altaAvion"})
public class ServletAltaAvion extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        Avion avion = new Avion("","","","","");
        avion.setId(request.getParameter("id"));
        avion.setColor(request.getParameter("color"));
        avion.setMarca(request.getParameter("marca"));
        avion.setTamañoTanque(request.getParameter("capacidadTanque"));
        avion.setLineaAerea(request.getParameter("lineaAerea"));

        AltaAvionDB aDB = new AltaAvionDB();

        try {
            if(aDB.registrarAvion(avion) == 1)
                response.sendRedirect("successAltaAvion.html");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
