package db;

import model.Corrida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jl.jasso on 25/01/2017.
 */
public class BDCorrida {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfacorridas";
    private static final String USER = "root";
    private static final String PASS = "luces@1989";

    public static boolean insertaCorrida(Corrida corrida) throws ClassNotFoundException, SQLException {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String consulta = String.format("INSERT INTO corridas(origen, destino, fechaInicio, horaSalida," +
                        "fechaFin, horaLlegada, escalas)" +
                        "values ('%s', '%s', '%s', '%s', '%s', '%s', '%d')",corrida.getOrigen(),
                corrida.getDestino(), corrida.getFechaInicio().toString(), corrida.getHoraSalida().toString(),
                corrida.getFechaFin().toString(),
                corrida.getHoraLlegada().toString(), corrida.getEscalas());

        int respuesta = st.executeUpdate(consulta);

        return  respuesta == 1 ? true : false;
    }
}
