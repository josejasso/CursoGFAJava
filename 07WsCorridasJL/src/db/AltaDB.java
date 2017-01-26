package db;

import model.Servicio;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by jl.jasso on 24/01/2017.
 */
public class AltaDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfaservicios";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public static String altaServicios(Servicio servicio) throws ClassNotFoundException, SQLException {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String queryAlta  = String.format("INSERT INTO servicio(id, origen, destino, fechaSalida, horaSalida," +
                "fechaLlegada, horaLlegada, escalas)" +
                "values ('%d', '%s', '%s', '%s', '%s', '%s', '%s', '%d')", servicio.getId(), servicio.getOrigen(),
                servicio.getDestino(), servicio.getFechaSalida(), servicio.getHoraSalida(), servicio.getFechaLlegada(),
                servicio.getHoraLlegada(), servicio.getEscalas());

        int res = st.executeUpdate(queryAlta);
        //respuesta = consulta.execute(query);
        conexion.close();
        st.close();

        String respuesta = "";

        if(res == 1)
            return respuesta = "Alta correcta";
        else
            return respuesta = "Error en datos de entrada";


    }

}
