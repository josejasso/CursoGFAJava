package negocio;

import db.BuscaAvionDB;
import model.Avion;

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
@WebServlet(name = "ServletBuscaAvion", urlPatterns = {"/buscaAvion"})
public class ServletBuscaAvion extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        // Obtenemos un objeto Print Writer para enviar respuesta

        request.setCharacterEncoding("UTF-8");

        String id = (request.getParameter("id"));

        BuscaAvionDB bDB = new BuscaAvionDB();
        Avion avion = null;

        try {
            avion = bDB.buscarAvion(id);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<HTML><HEAD><TITLE>Busqueda Avion</TITLE></HEAD>");
        pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
        pw.println("<H2>Datos obtenidos</H2><P>");
        pw.println("<UL>\n");
        pw.println("ID: " + avion.getId() + "<BR>");
        pw.println("Color: "  + avion.getColor() + "<BR>");
        pw.println("Marca: "  + avion.getMarca() + "<BR>");
        pw.println("Capacidad Tanque (Litros): "  + avion.getTamañoTanque() + "<BR>");
        pw.println("Linea Aerea: "  + avion.getLineaArea() + "<BR><BR>");
        pw.println("<a href=\"menu.html\">Menu Principal</a>");
        pw.println("</BODY></HTML>");
        pw.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
