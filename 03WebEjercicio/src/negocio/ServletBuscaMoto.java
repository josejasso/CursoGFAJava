package negocio;


import db.BuscaMotoDB;
import model.Motocicleta;

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
@WebServlet(name = "ServletBuscaMoto", urlPatterns = {"/buscaMoto"})
public class ServletBuscaMoto extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        // Obtenemos un objeto Print Writer para enviar respuesta

        request.setCharacterEncoding("UTF-8");

        String id = (request.getParameter("id"));

        BuscaMotoDB bDB = new BuscaMotoDB();
        Motocicleta moto = null;

        try {
            moto = bDB.buscarMoto(id);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<HTML><HEAD><TITLE>Busqueda Motocicleta</TITLE></HEAD>");
        pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
        pw.println("<H2>Datos obtenidos</H2><P>");
        pw.println("<UL>\n");
        pw.println("ID: " + moto.getId() + "<BR>");
        pw.println("Color: "  + moto.getColor() + "<BR>");
        pw.println("Marca: "  + moto.getMarca() + "<BR>");
        pw.println("Modelo: "  + moto.getModelo() + "<BR>");
        pw.println("Transmision: "  + moto.getTransmision() + "<BR><BR>");
        pw.println("<a href=\"menu.html\">Menu Principal</a>");
        pw.println("</BODY></HTML>");
        pw.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
