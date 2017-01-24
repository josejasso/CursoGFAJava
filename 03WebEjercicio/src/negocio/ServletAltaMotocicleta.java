package negocio;

import db.AltaMotocicletaDB;
import model.Motocicleta;

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
@WebServlet(name = "ServletAltaMotocicleta", urlPatterns = {"/altaMoto"})
public class ServletAltaMotocicleta extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        Motocicleta moto = new Motocicleta("","","","","");
        moto.setId(request.getParameter("id"));
        moto.setColor(request.getParameter("color"));
        moto.setMarca(request.getParameter("marca"));
        moto.setModelo(request.getParameter("modelo"));
        moto.setTransmision(request.getParameter("transmision"));

        AltaMotocicletaDB aDB = new AltaMotocicletaDB();

        try {
            if(aDB.registrarMotocicleta(moto) == 1)
                response.sendRedirect("successAltaMoto.html");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
