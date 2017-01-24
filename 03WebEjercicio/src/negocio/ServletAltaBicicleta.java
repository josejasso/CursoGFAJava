package negocio;

import db.AltaAutoDB;
import db.AltaBicicletaDB;
import model.Automovil;
import model.Bicicleta;

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
@WebServlet(name = "ServletAltaBicicleta", urlPatterns = {"/altaBicicleta"})
public class ServletAltaBicicleta extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        Bicicleta bici = new Bicicleta("","","","","");
        bici.setId(request.getParameter("id"));
        bici.setColor(request.getParameter("color"));
        bici.setMarca(request.getParameter("marca"));
        bici.setRodada(request.getParameter("rodada"));
        bici.setTipo(request.getParameter("tipo"));

        AltaBicicletaDB aDB = new AltaBicicletaDB();

        try {
            if(aDB.registrarBicicleta(bici) == 1)
                response.sendRedirect("successAltaBici.html");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
