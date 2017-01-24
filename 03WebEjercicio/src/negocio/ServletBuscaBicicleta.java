package negocio;

import db.BuscaAvionDB;
import db.BuscaBiciDB;
import model.Avion;
import model.Bicicleta;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;



/**
 * Created by jl.jasso on 23/01/2017.
 */
@WebServlet(name = "ServletBuscaBicicleta", urlPatterns = {"/buscaBici"})
public class ServletBuscaBicicleta extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        // Obtenemos un objeto Print Writer para enviar respuesta

        request.setCharacterEncoding("UTF-8");

        String id = (request.getParameter("id"));

        BuscaBiciDB bDB = new BuscaBiciDB();
        Bicicleta bici = null;

        try {
            bici = bDB.buscarBici(id);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<HTML><HEAD><TITLE>Busqueda Bicicleta</TITLE></HEAD>");
        pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
        pw.println("<H2>Datos obtenidos</H2><P>");
        pw.println("<UL>\n");
        pw.println("ID: " + bici.getId() + "<BR>");
        pw.println("Color: "  + bici.getColor() + "<BR>");
        pw.println("Marca: "  + bici.getMarca() + "<BR>");
        pw.println("Rodada: "  + bici.getRodada() + "<BR>");
        pw.println("Tipo: "  + bici.getTipo() + "<BR><BR>");
        pw.println("<a href=\"menu.html\">Menu Principal</a>");
        pw.println("</BODY></HTML>");
        pw.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
