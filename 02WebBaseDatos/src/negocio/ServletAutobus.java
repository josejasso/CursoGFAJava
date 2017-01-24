package negocio;

import db.AutobusDB;
import model.Autobus;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by jl.jasso on 18/01/2017.
 */
@WebServlet(name = "ServletAutobus", urlPatterns = {"/autobuses"})
public class ServletAutobus extends HttpServlet {
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        Autobus autobus = new Autobus();
        autobus.setNum_autobus(Integer.parseInt(request.getParameter("num_autobus")));
        autobus.setSiglas(request.getParameter("siglas"));
        autobus.setModelo(Integer.parseInt(request.getParameter("modelo")));
        autobus.setCapacidad(Integer.parseInt(request.getParameter("capacidad")));
        autobus.setBase(request.getParameter("base"));

        AutobusDB aDB = new AutobusDB();

        try {
            if(aDB.registrarAutobus(autobus) == 1)
                response.sendRedirect("success.html");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        AutobusDB aDB = new AutobusDB();

        try {

            List<Autobus> lista = aDB.getAutobuses();
            PrintWriter pw = response.getWriter();
            lista.forEach(autobus -> pw.print(autobus));
            pw.close();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
